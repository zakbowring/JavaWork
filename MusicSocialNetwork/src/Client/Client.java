/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import java.net.*;
/**
 *
 * @author zakbo
 */
public class Client {
    
    public static void main(String args[])
    {
        try{
            Socket s = new Socket("127.0.0.1", 9999);
            System.out.println("Connected");
        }catch (Exception e){
            System.out.println("Unable to connect to server");
        }
    }
}
