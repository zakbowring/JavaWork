/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocialNetworkServer;
import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author zakbo
 */
public class SocialNetworkHandler {
    Socket client; //Sets up a socket to reference in the handler
    ObjectOutputStream outToClient; //Sets a stream to use to send data to the client
    
    public SocialNetworkHandler(Socket _socketClient){ //Constructor (Socket is the one the server is running)
    client = _socketClient; //Sets the socket that the server is using
}
    
    public void runServer()
    {
        try{
            //This takes any information in that the client sends to the server
            ObjectInputStream inFromClient = new ObjectInputStream(client.getInputStream());
            try{
                String[] inClientArray = (String[]) inFromClient.readObject(); //Stores data from client in an array
                String userInformationFile = "programData.txt"; //The filename
                String fileDirectory = "programData\\"; //Where the file is in the directory
                
                //If statements below show what operations can happen via the client-server link
                if("loginRequest".equals(inClientArray[0])) //When the user requests to log in
                {
                    String fileLocation = fileDirectory + userInformationFile; //Complete file location
                    try{
                        FileReader fileIn = new FileReader(fileLocation);
                        BufferedReader reader = new BufferedReader(fileIn);

                        boolean isUserFound = false; //Is there a matching username
                        boolean isLoginSuccessful = false; //Is password correct
                        
                        String lineOfText = ""; //Signifies a line of text in the .txt
                        String typed_Username = inClientArray[1]; //What the user entered in username
                        String typed_Password = inClientArray[2]; //What the user entered in password
                        
                        while((lineOfText = reader.readLine()) != null) //Why'll there's still a line to read
                        {
                            //StringTokenizer is used to split a string into individual variables
                            //In this case we've used "," to show where variables begin/end
                            StringTokenizer st = new StringTokenizer(lineOfText, ",");
                            String tempName = st.nextToken().trim(); //First variable on line
                            if(typed_Username.equals(tempName))
                            {
                                isUserFound = true; //Username match
                                String tempPassword = st.nextToken().trim(); //Second variable on line
                                if(typed_Password.equals(tempPassword))
                                {
                                    isLoginSuccessful = true; //Username and password matches
                                }
                                else
                                    isLoginSuccessful = false; //Username right, password incorrect
                                //break; -->Removed, not neccessary
                            }
                        }
                        
                        //Below are thee outcomes of the login attempt
                        if(isUserFound == false) //Username doesn't exist
                            JOptionPane.showMessageDialog(null, "Username is not found");
                        else if((isUserFound == true) && (isLoginSuccessful == false)) //Username found, password incorrect
                            JOptionPane.showMessageDialog(null, "Incorrect Password");
                        else if(isUserFound == true && isLoginSuccessful == true)//Username and password correct
                        {
                            JOptionPane.showMessageDialog(null, "Login Successful");
                            outToClient.writeObject(retrieveUserAccount(fileLocation, 11, typed_Username));
                        }      
                    }catch(Exception e)
                    {
                        System.out.println("Error --> " + e.getMessage());
                    }
                }
                
            }catch(ClassNotFoundException classError)
            {
                System.out.println("Error --> " + classError.getMessage());
            }
        }catch(IOException error)
        { //This will catch any errors in the IO
            System.out.println("Error --> " + error.getMessage());
        }
    }
    
    public int no_Of_Lines(String fileLocation)
    {
        int no_Of_Lines = 0; //Count for how many lines in the file
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileLocation)); //Opens reader for file
            while(reader.readLine() != null) //If there's still unread lines left
                no_Of_Lines ++ ; //Increase count
            
            reader.close(); //Closes reader
        }catch(IOException error) //If ther's an error in the input of the file
        {
            System.out.println("Error --> "+ error); //State error message
        }
        
        return no_Of_Lines; //Return final count
    }
    
    
    
    public String[] retrieveUserAccount(String input_filename ,int input_record_length, String input_username)
    {
        String[] retrieved_record = new String[input_record_length];
        retrieved_record[0] = "HndlMain";
        

            try{
            BufferedReader reader = new BufferedReader(new FileReader(input_filename));
            String line;
            int i = 0;
            StringTokenizer myTokens; //Initialize
            
            while ((line = reader.readLine()) != null){//start loop
                myTokens = new StringTokenizer(line, ","); //Create tokens out of the retrieved line
                String tempName = myTokens.nextToken().trim();
                if (input_username.equals(tempName)) //If the name being searched for equals the token (stored username)
                {
                    for (int j = 0; j < retrieved_record.length; j++) //Populate the array
                        {
                            retrieved_record[j] = myTokens.nextToken().trim(); //Get all the tokens out
                        }
                    break; //break out of the loop since the collect username has been found
                }//endif
          
            } //endloop
            
            }//end try
            catch (IOException e) 
            {
            System.err.println("Error! - " + e.getMessage());       
        }
        
        return retrieved_record;
    }
}


