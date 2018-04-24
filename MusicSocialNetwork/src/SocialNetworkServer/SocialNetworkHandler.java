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
                           //11 - The no of info each user has in programData
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
    
    
    
    public String[] retrieveUserAccount(String fileName ,int info_Length, String username)
    {
        String[] userAccount = new String[info_Length]; //Array for data return
        userAccount[0] = "mainReturn"; //Signifies data being passed is for the main
        
            try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringTokenizer myTokens; //Declaration of StringTokenizer
            
            while ((line = reader.readLine()) != null){ //While there's still lines in the file
                myTokens = new StringTokenizer(line, ","); //Stores line and what seperates each piece of data
                String tempName = myTokens.nextToken().trim(); //Takes the next untested username
                if (username.equals(tempName)) //Is current username equal to entered username
                {
                    for (int i = 0; i < userAccount.length; i++) 
                        {
                            userAccount[i] = myTokens.nextToken().trim(); //Stores all data in user account
                        }
                    break; 
                }
            }
            }
            catch (IOException e) 
            {
            System.err.println("Error! - " + e.getMessage());       
        }
        
        return userAccount; //Returns array ready for sending to client
    }
}


