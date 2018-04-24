/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocialNetworkServer;
import java.net.*;
/**
 *
 * @author zakbo
 */
public class SocialNetworkServer {
    
    public SocialNetworkServer()
    {
        
    }
    public static void main(String args[]){
        try{
            ServerSocket SNServer = new ServerSocket(9999);
            System.out.println("Waiting for client...");
            Socket client = SNServer.accept();
            System.out.println("Client" + client.getInetAddress() + "connected");
            InetAddress address = InetAddress.getLocalHost(); 
            String IpAdress = address.getHostAddress();
           
    } catch(Exception e)
    {
        System.out.println("error");
    }
           
           
}
}
    

