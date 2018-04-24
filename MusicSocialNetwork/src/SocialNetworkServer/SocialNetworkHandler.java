/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocialNetworkServer;
import java.net.*;
import java.io.*;
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
                
            }catch(classException)
        }catch(IOException error)
        { //This will catch any errors in the IO
            System.out.println("Error --> " + error.getMessage());
        }
    }
}
