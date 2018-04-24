package Client; //Allows access to other classes

//Below are the external libraries we have used
import Client.LoginScreen;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.net.*; //Alllows creation of server
import javax.swing.JOptionPane;

/**
 *
 * @author Zak Bowring and Sukhbir Gill
 */
public class RegistrationScreen extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationScreen
     */
    public RegistrationScreen() {
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

        registration_Text = new javax.swing.JLabel();
        name_Text = new javax.swing.JLabel();
        password_Input = new javax.swing.JTextField();
        place_Of_Birth_Text = new javax.swing.JLabel();
        place_Of_Birth_Input = new javax.swing.JTextField();
        date_Of_Birth_Text = new javax.swing.JLabel();
        dob_Day_Input = new javax.swing.JTextField();
        dob_Month_Input = new javax.swing.JComboBox<>();
        dob_Year_Input = new javax.swing.JTextField();
        place_Of_Residence_Text = new javax.swing.JLabel();
        place_Of_Residence_Input = new javax.swing.JTextField();
        preffered_Music_Genre_Text = new javax.swing.JLabel();
        indie_Check = new javax.swing.JCheckBox();
        grime_Check = new javax.swing.JCheckBox();
        pop_Check = new javax.swing.JCheckBox();
        rock_Check = new javax.swing.JCheckBox();
        opera_Check = new javax.swing.JCheckBox();
        rb_Check = new javax.swing.JCheckBox();
        alternative_Check = new javax.swing.JCheckBox();
        classical_Check = new javax.swing.JCheckBox();
        punk_Check = new javax.swing.JCheckBox();
        techno_Check = new javax.swing.JCheckBox();
        profile_Picture_Check = new javax.swing.JLabel();
        upload_Picture_Button = new javax.swing.JButton();
        URL_Text = new javax.swing.JTextField();
        register_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();
        password_Text = new javax.swing.JLabel();
        name_Input1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registration_Text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registration_Text.setText("Registration");

        name_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_Text.setText("UserName:");

        password_Input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_InputActionPerformed(evt);
            }
        });

        place_Of_Birth_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place_Of_Birth_Text.setText("Place of birth:");

        place_Of_Birth_Input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place_Of_Birth_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                place_Of_Birth_InputActionPerformed(evt);
            }
        });

        date_Of_Birth_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date_Of_Birth_Text.setText("Date of birth:");

        dob_Day_Input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dob_Day_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_Day_InputActionPerformed(evt);
            }
        });

        dob_Month_Input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dob_Month_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        dob_Year_Input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dob_Year_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_Year_InputActionPerformed(evt);
            }
        });

        place_Of_Residence_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place_Of_Residence_Text.setText("Place of residence:");

        place_Of_Residence_Input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place_Of_Residence_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                place_Of_Residence_InputActionPerformed(evt);
            }
        });

        preffered_Music_Genre_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        preffered_Music_Genre_Text.setText("Preferred Music Genres:");

        indie_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        indie_Check.setText("Indie");
        indie_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indie_CheckActionPerformed(evt);
            }
        });

        grime_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grime_Check.setText("Grime");
        grime_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grime_CheckActionPerformed(evt);
            }
        });

        pop_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pop_Check.setText("Pop");
        pop_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_CheckActionPerformed(evt);
            }
        });

        rock_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rock_Check.setText("Rock");
        rock_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rock_CheckActionPerformed(evt);
            }
        });

        opera_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opera_Check.setText("Opera");
        opera_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opera_CheckActionPerformed(evt);
            }
        });

        rb_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_Check.setText("R & B");
        rb_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_CheckActionPerformed(evt);
            }
        });

        alternative_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alternative_Check.setText("Alternative");
        alternative_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternative_CheckActionPerformed(evt);
            }
        });

        classical_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classical_Check.setText("Classical");
        classical_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classical_CheckActionPerformed(evt);
            }
        });

        punk_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        punk_Check.setText("Punk");
        punk_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punk_CheckActionPerformed(evt);
            }
        });

        techno_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        techno_Check.setText("Techno");
        techno_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                techno_CheckActionPerformed(evt);
            }
        });

        profile_Picture_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        profile_Picture_Check.setText("Profile Picture:");

        upload_Picture_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upload_Picture_Button.setText("Upload Picture");
        upload_Picture_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_Picture_ButtonActionPerformed(evt);
            }
        });

        URL_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        URL_Text.setText("URL");
        URL_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URL_TextActionPerformed(evt);
            }
        });

        register_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        register_Button.setText("Register");
        register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_ButtonActionPerformed(evt);
            }
        });

        cancel_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel_Button.setText("Cancel");
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });

        password_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_Text.setText("Password:");

        name_Input1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_Input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_Input1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registration_Text))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name_Text)
                                    .addComponent(date_Of_Birth_Text)
                                    .addComponent(place_Of_Residence_Text)
                                    .addComponent(preffered_Music_Genre_Text)
                                    .addComponent(password_Text))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dob_Day_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dob_Month_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dob_Year_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(place_Of_Residence_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(indie_Check)
                                    .addComponent(opera_Check)
                                    .addComponent(pop_Check)
                                    .addComponent(rock_Check))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(classical_Check)
                                    .addComponent(alternative_Check)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grime_Check)
                                        .addGap(68, 68, 68)
                                        .addComponent(punk_Check))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_Check)
                                        .addGap(70, 70, 70)
                                        .addComponent(techno_Check)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(profile_Picture_Check)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(upload_Picture_Button))
                        .addComponent(URL_Text))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(place_Of_Birth_Text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(place_Of_Birth_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(register_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel_Button)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registration_Text)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profile_Picture_Check)
                        .addComponent(upload_Picture_Button)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Text)
                    .addComponent(URL_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_Input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_Text)
                    .addComponent(password_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_Of_Birth_Text)
                    .addComponent(dob_Day_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_Month_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_Year_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(place_Of_Birth_Text)
                    .addComponent(place_Of_Birth_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(place_Of_Residence_Text)
                    .addComponent(place_Of_Residence_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preffered_Music_Genre_Text)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indie_Check)
                    .addComponent(grime_Check)
                    .addComponent(punk_Check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Check)
                    .addComponent(opera_Check)
                    .addComponent(techno_Check))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pop_Check)
                    .addComponent(alternative_Check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rock_Check)
                    .addComponent(classical_Check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_Button)
                    .addComponent(cancel_Button))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_InputActionPerformed

    private void place_Of_Birth_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_place_Of_Birth_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_place_Of_Birth_InputActionPerformed

    private void dob_Day_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_Day_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_Day_InputActionPerformed

    private void dob_Year_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_Year_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_Year_InputActionPerformed

    private void place_Of_Residence_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_place_Of_Residence_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_place_Of_Residence_InputActionPerformed

    private void indie_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indie_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indie_CheckActionPerformed

    private void grime_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grime_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grime_CheckActionPerformed

    private void pop_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pop_CheckActionPerformed

    private void rock_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rock_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rock_CheckActionPerformed

    private void opera_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opera_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opera_CheckActionPerformed

    private void rb_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_CheckActionPerformed

    private void alternative_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternative_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternative_CheckActionPerformed

    private void classical_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classical_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classical_CheckActionPerformed

    private void punk_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punk_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punk_CheckActionPerformed

    private void techno_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_techno_CheckActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_techno_CheckActionPerformed

    private void upload_Picture_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_Picture_ButtonActionPerformed
        //Below is where the user can select a profile picture
        String path = "C:\\Users\\Public";
        new File("programData").mkdir();
        
        JFileChooser fileSelector = new JFileChooser(path);
        fileSelector.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG, GIF & PNG Images", "jpg", "gif", "png");
        
        fileSelector.setFileFilter(filter);
        
        int result = fileSelector.showOpenDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileSelector.getSelectedFile();
            System.out.println(selectedFile.getAbsoluteFile());
            URL_Text.setText(selectedFile.getAbsolutePath());
        }
        
        //send to server
    }//GEN-LAST:event_upload_Picture_ButtonActionPerformed

    private void URL_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URL_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_URL_TextActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        this.dispose(); //Closes down the registration window
        new LoginScreen().setVisible(true); //Opens a new login screen window
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    private void register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_ButtonActionPerformed
        boolean anyCheckSelected = false;
        boolean isDobSelected = false; 
        
        if(indie_Check.isSelected() || opera_Check.isSelected() || pop_Check.isSelected() || rock_Check.isSelected() || grime_Check.isSelected() || rb_Check.isSelected() || alternative_Check.isSelected() || classical_Check.isSelected() || punk_Check.isSelected() || techno_Check.isSelected() == true )
        {
            //Runs if any check box is selected
            anyCheckSelected = true;
        }
        
        if(dob_Day_Input.getText().isEmpty() || dob_Year_Input.getText().isEmpty() == true)
        {
            //Runs if either DOB entry is empty
            isDobSelected = true;
        }
        
        if(password_Input.getText().isEmpty() || place_Of_Birth_Input.getText().isEmpty() || place_Of_Residence_Input.getText().isEmpty() || anyCheckSelected == false || isDobSelected == false )
        //Put in a check to make sure all fields are in use
        {
            JOptionPane.showMessageDialog(null, "Registration Unsuccessful, ensure all fields are filled in.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Registration Successful");
        }
        
            
        
        
        
        
        //0 - request name
        //1 - username
        //2 - password
        //3 - DOB (all joined into one string)
        //4 - place of birth
        //5 - place of residence
        //6 - faviourite genres (all joined into one string, seperate via a \)
        //7 - picture URl
        //8 - Music file location ---------
        //9 - friends                     |
        //10 - recieved friend request    | --- join multiple ones of their own type into one
        //11 - sent friend requests -------
    }//GEN-LAST:event_register_ButtonActionPerformed

    private void name_Input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_Input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_Input1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try
        {
        Socket test = new Socket("127.0.0.1", 9999);
        System.out.println("worked");
        }catch(Exception e){
            System.out.println("error1");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField URL_Text;
    private javax.swing.JCheckBox alternative_Check;
    private javax.swing.JButton cancel_Button;
    private javax.swing.JCheckBox classical_Check;
    private javax.swing.JLabel date_Of_Birth_Text;
    private javax.swing.JTextField dob_Day_Input;
    private javax.swing.JComboBox<String> dob_Month_Input;
    private javax.swing.JTextField dob_Year_Input;
    private javax.swing.JCheckBox grime_Check;
    private javax.swing.JCheckBox indie_Check;
    private javax.swing.JTextField name_Input1;
    private javax.swing.JLabel name_Text;
    private javax.swing.JCheckBox opera_Check;
    private javax.swing.JTextField password_Input;
    private javax.swing.JLabel password_Text;
    private javax.swing.JTextField place_Of_Birth_Input;
    private javax.swing.JLabel place_Of_Birth_Text;
    private javax.swing.JTextField place_Of_Residence_Input;
    private javax.swing.JLabel place_Of_Residence_Text;
    private javax.swing.JCheckBox pop_Check;
    private javax.swing.JLabel preffered_Music_Genre_Text;
    private javax.swing.JLabel profile_Picture_Check;
    private javax.swing.JCheckBox punk_Check;
    private javax.swing.JCheckBox rb_Check;
    private javax.swing.JButton register_Button;
    private javax.swing.JLabel registration_Text;
    private javax.swing.JCheckBox rock_Check;
    private javax.swing.JCheckBox techno_Check;
    private javax.swing.JButton upload_Picture_Button;
    // End of variables declaration//GEN-END:variables
}
