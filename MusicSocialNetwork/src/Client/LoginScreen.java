/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import java.io.IOException;
import java.net.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.*;

/**
 *
 * @author zakbo
import java.io.IOExceptio
 */
public class LoginScreen extends javax.swing.JFrame {
    static boolean Logged_In = false;
    
    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_Text = new javax.swing.JLabel();
        password_Text = new javax.swing.JLabel();
        username_Input_Text = new javax.swing.JTextField();
        password_Input_Text = new javax.swing.JTextField();
        login_Button = new javax.swing.JButton();
        title_Text = new javax.swing.JLabel();
        register_Text = new javax.swing.JLabel();
        register_Button = new javax.swing.JButton();
        toMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username_Text.setText("Username: ");

        password_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_Text.setText("Password:");

        username_Input_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_Input_TextActionPerformed(evt);
            }
        });

        login_Button.setText("Login");
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });

        title_Text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title_Text.setText("Music Social Network");

        register_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        register_Text.setText("Don't have an account? Register here - >");

        register_Button.setText("Register");
        register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_ButtonActionPerformed(evt);
            }
        });

        toMain.setText("To Main");
        toMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_Button)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(username_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_Input_Text)
                            .addComponent(password_Input_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title_Text))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toMain)
                        .addGap(65, 65, 65)
                        .addComponent(register_Text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(register_Button)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_Text)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_Text)
                    .addComponent(username_Input_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_Text)
                    .addComponent(password_Input_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_Text)
                    .addComponent(register_Button)
                    .addComponent(toMain))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_Input_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_Input_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_Input_TextActionPerformed

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ButtonActionPerformed
       String[] login = new String[3];
       login[0] = "loginRequest";
       login[1] = username_Input_Text.getText();
       login[2] = password_Input_Text.getText();
       
       serverCode t = new serverCode(login);
       Thread th = new Thread(t);
       th.start();
       
       
       
       
       if (Logged_In == true)
       {
           this.dispose();
           new msnMainScreen().setVisible(true);
           
       }
       
       
    }//GEN-LAST:event_login_ButtonActionPerformed

    private void register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_ButtonActionPerformed
        this.dispose(); //This disposes the current window
        new RegistrationScreen().setVisible(true); //Turns the registration screen on
    }//GEN-LAST:event_register_ButtonActionPerformed

    private void toMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMainActionPerformed
        this.dispose();
        new msnMainScreen().setVisible(true);
    }//GEN-LAST:event_toMainActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton login_Button;
    private javax.swing.JTextField password_Input_Text;
    private javax.swing.JLabel password_Text;
    private javax.swing.JButton register_Button;
    private javax.swing.JLabel register_Text;
    private javax.swing.JLabel title_Text;
    private javax.swing.JButton toMain;
    private javax.swing.JTextField username_Input_Text;
    private javax.swing.JLabel username_Text;
    // End of variables declaration//GEN-END:variables
}


class serverCode implements Runnable
{
    String[] login = new String[3];
    
    public serverCode (String[]_login) 
    {
        login = _login;
    }
    
    public void run() 
    {
        try (Socket server = new Socket ("localhost",9090);)
        {
            JOptionPane.showMessageDialog(null,"Attempting Login...");
            ObjectOutputStream outToServer = new ObjectOutputStream(server.getOutputStream());
            outToServer.writeObject(login);
            JOptionPane.showMessageDialog(null, "Attempting to recieve data from server");
            ObjectInputStream inFromServer = new ObjectInputStream(server.getInputStream());
            
        
            
            boolean test = inFromServer.readBoolean();
            if(test==true)
                System.out.println("Success");
            try
            {
                String[] text = (String[]) inFromServer.readObject();
                
                ObjectOutputStream outToServer2 = new ObjectOutputStream(server.getOutputStream());
                if ("loginRequest".equals(text[0]))
                {
                    LoginScreen.Logged_In = true;
                    outToServer2.writeObject(text);
                    
                }
               
            } catch (ClassNotFoundException d) 
            {
            }
            server.close();
            
        
            
        } catch (IOException e) 
        {
            JOptionPane.showMessageDialog(null,"login error caught");
        }
    }

}