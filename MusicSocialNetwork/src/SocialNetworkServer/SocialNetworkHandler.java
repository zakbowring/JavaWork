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
    ObjectOutputStream outToClient;
    
    public SocialNetworkHandler(Socket _socketClient){
    client = _socketClient; //Sets the socket that the server is using
}
    
    public void runServer()
    {
        try{
            //This takes any information in that the client sends to the server
            ObjectInputStream inFromClient = new ObjectInputStream(client.getInputStream());
            try{
                String[] inClientArray = (String[]) inFromClient.readObject();
                String userInformationFile = "programData.txt"; //The filename
                String fileDirectory = "programData\\"; //Where the file is in the directory
                
                //If statements below show what operations can happen via the client-server link
                if("loginRequest".equals(inClientArray[0])) //When the user requests to log in
                {
                    String fileLocation = fileDirectory + userInformationFile; //Complete file location
                    try{
                        FileReader fileIn = new FileReader(fileLocation);
                        BufferedReader reader = new BufferedReader(fileIn);
                        
                        int numberOfProfiles = no_Of_Lines(fileLocation);
                        int currentLineCheck = 1;
                        boolean isUserFound = false;
                        boolean isLoginSuccessful = false;
                        
                        String lineOfText = ""; //Signifies a line of text
                        String typed_Username = inClientArray[1];
                        String typed_Password = inClientArray[2];
                        String userNameFound = "failed";
                        
                        while((lineOfText = reader.readLine()) != null) //Why'll there's still a line to read
                        {
                            StringTokenizer st = new StringTokenizer(lineOfText, ",");
                            String tempName = st.nextToken().trim();
                            if(typed_Username.equals(tempName))
                            {
                                isUserFound = true;
                                String tempPassword = st.nextToken().trim();
                                if(typed_Username.equals(tempPassword))
                                {
                                    isLoginSuccessful = true;
                                    userNameFound = tempName;
                                }
                                else
                                    isLoginSuccessful = false;
                                break;
                            }
                            currentLineCheck ++;
                        }
                        
                        //Below are thee outcomes of the login attempt
                        if(isUserFound == false)
                            JOptionPane.showMessageDialog(null, "Username is not found");
                        else if((isUserFound == true) && (isLoginSuccessful = false))
                            JOptionPane.showMessageDialog(null, "Incorrect Password");
                        else if(isUserFound && isLoginSuccessful == true)
                        {
                            JOptionPane.showMessageDialog(null, "Login Successful");
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
}
