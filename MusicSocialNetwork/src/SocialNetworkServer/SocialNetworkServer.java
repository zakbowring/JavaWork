/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocialNetworkServer;
import java.io.IOException;
import java.net.*;
/**
 *
 * @author zakbo
 */
public class SocialNetworkServer {
   public static void main(String[] args) throws IOException {        
        ServerSocket server = new ServerSocket(9090);
        while (true) {
            System.out.println("Waiting for connection...");
            Socket client = server.accept();
            System.out.println("Client " + client.getInetAddress() + " connected!");
            //assign each client to a thread
            SocialNetworkHandler t = new SocialNetworkHandler(client);
            t.runServer();
         }
    }
           
           
}
    

