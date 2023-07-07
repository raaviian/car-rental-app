package CarRentalSystem;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.sql.Statement; 
/**
 *
 * @author Asus
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form CarRentalSystemMainPage
     */
    Connection myConn;
    PreparedStatement ps;
    ResultSet rs;
    Statement myStat;
    
    public Login() {
        initComponents();
    }
    private static int Roles;
    private static String MatricID;
    private static String ICNumber;
    private static String Password;

    public static int getRoles() {
        return Roles;
    }

    public static void setRoles(int Roles) {
        Login.Roles = Roles;
    }

    public static String getMatricID() {
        return MatricID;
    }

    public static String getICNumber() {
        return ICNumber;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        Login.Password = Password;
    }
    
    
    public static String getIdType() {
        if (Roles == 1) {
            return "Matric ID         ";
        } else if (Roles == 2) {
            return "IC Number        ";
        }
        return "";
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        IDBox = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        StudRdButton = new javax.swing.JRadioButton();
        RentingOwnerRdButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to Car Rental System!");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setText("User ID :");

        jLabel3.setText("Password :");

        PasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBoxActionPerformed(evt);
            }
        });

        IDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDBoxActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Roles :");

        buttonGroup3.add(StudRdButton);
        StudRdButton.setText("Student");
        StudRdButton.setName(""); // NOI18N
        StudRdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudRdButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(RentingOwnerRdButton);
        RentingOwnerRdButton.setText("Renting Owner");
        RentingOwnerRdButton.setName(""); // NOI18N
        RentingOwnerRdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentingOwnerRdButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("     Do not have an account?");

        jLabel6.setText("=> For Student : Insert ID Matrics");

        jLabel7.setText("=> For Renting Owner: Insert IC number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudRdButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RentingOwnerRdButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StudRdButton)
                    .addComponent(RentingOwnerRdButton))
                .addGap(39, 39, 39)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDBoxActionPerformed

    private void PasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordBoxActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        if (RentingOwnerRdButton.isSelected()) {
            Roles = 2;   
        }
        if (StudRdButton.isSelected()) {
            Roles = 1;
        }

        Password = String.valueOf(PasswordBox.getPassword());
        try{ 
            //STEP 1: Establish the CONNECTION to the specific DB-will obtaining CONNECTION obj 
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalsystem", "root", ""); 
            myStat = myConn.createStatement(); 
            //STEP 2: Create the JDBC STATEMENT - for sending SQL STATEMENT to the DB 
            if(Roles==1){
                MatricID = IDBox.getText();
                ps = myConn.prepareStatement("SELECT * from studregistrationdetails WHERE MatricID=? AND Password=?"); 
                ps.setString(1, MatricID);
                ps.setString(2, Password);
            }else{
                ICNumber = IDBox.getText();
                ps = myConn.prepareStatement("SELECT * from rentingownerrecord WHERE ICNumber=? AND Password=?"); 
                ps.setString(1, ICNumber);
                ps.setString(2, Password);
            }
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(Roles==1){
                    
                    if(MatricID.equals(rs.getString("MatricID")) && rs.getString("Password").equals(Password)){
                        JOptionPane.showMessageDialog(null,"Login Successful");
                        MainMenuStudent mainmenu = new MainMenuStudent();
                        MainMenuStudent.setMatricID(MatricID);
                        mainmenu.setDefaultCloseOperation(MainMenuStudent.EXIT_ON_CLOSE);
                        this.setVisible(false);
                        mainmenu.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Your ID Matric and Password are incorrect");
                        Login login = new Login();
                        login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
                    }
                }else{
                    if(rs.getString("ICNumber").equals(ICNumber) && rs.getString("Password").equals(Password)){
                        JOptionPane.showMessageDialog(null,"Login Successful");
                        MainMenuRentingOwner mainmenu = new MainMenuRentingOwner();
                        mainmenu.setDefaultCloseOperation(MainMenuRentingOwner.EXIT_ON_CLOSE);
                        this.setVisible(false);
                        mainmenu.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Your IC Number and Password are incorrect");
                        Login login = new Login();
                        login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
                    }
                    
                }
            }
            else{
                        JOptionPane.showMessageDialog(null, "Your User ID and Password are incorrect");
                        Login login = new Login();
                        login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
                    }
                    
            }catch(Exception e){ 
            e.printStackTrace(); 
        } 
       
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        Register register = new Register();
        register.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        this.setVisible(false);
        register.setVisible(true);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void StudRdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudRdButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudRdButtonActionPerformed

    private void RentingOwnerRdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentingOwnerRdButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentingOwnerRdButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDBox;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JRadioButton RentingOwnerRdButton;
    private javax.swing.JRadioButton StudRdButton;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
