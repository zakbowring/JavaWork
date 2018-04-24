package SocialNetworkServer;

 // Used to access all other classes

import java.net.*; //Allows us to create server
/**
 *
 * @author Zak Bowring and Sukhbir Gill
 */
public class socialNetworkServer {
    public static void main(String arg[])
    {
        try
        {
        //SNServer == Social Network Server
        ServerSocket SNServer = new ServerSocket(9999);
        Socket test = SNServer.accept();
        
        System.out.println("Connected!!!!!!!!!!");
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
    }
}
