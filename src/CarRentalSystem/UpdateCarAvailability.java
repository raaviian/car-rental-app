package CarRentalSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class UpdateCarAvailability extends javax.swing.JFrame {

    Connection myConn;
    PreparedStatement ps;
    ResultSet rs;
    Statement myStat;

    /**
     * Creates new form UpdateCarAvailability
     */
    public UpdateCarAvailability() {
        initComponents();
    }
    private static String Ownername;
    private static String CarModel;
    private static String Availability;
    private static int UpdateAvailability;

    public static String getOwnerName() {
        return Ownername;
    }

    public static int getUpdateAvailability() {
        return UpdateAvailability;
    }

    public static String getCarModel() {
        return CarModel;
    }

    public static String getAvailability() {
        return Availability;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Model = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Updateavailability = new javax.swing.JComboBox<>();
        Currentavailability = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Update Car Availability");

        jLabel2.setText("Enter Owner Name :");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel3.setText("The availability of your car");

        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });

        jLabel4.setText(":");

        Updateavailability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available", " " }));
        Updateavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateavailabilityActionPerformed(evt);
            }
        });

        jLabel5.setText("Update availability  : ");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Updateavailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Currentavailability, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(159, 159, 159))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Update)
                            .addGap(82, 82, 82)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)
                        .addGap(111, 111, 111))))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Currentavailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Updateavailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Update))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

        try {
            //STEP 1: Establish the CONNECTION to the specific DB-will obtaining CONNECTION obj 
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalsystem", "root", "");
            myStat = myConn.createStatement();
            //STEP 2: Create the JDBC STATEMENT - for sending SQL STATEMENT to the DB 
            Ownername=Name.getText();
            ps = myConn.prepareStatement("Select * from cardetails where OwnerName=?");
            ps.setString(1,Ownername);
            rs = ps.executeQuery();
            if (rs.next()){
                if (Ownername.equals(rs.getString("OwnerName"))) {
                    ps = myConn.prepareStatement("Select * from cardetails where Model=?,availability=?");
                    ps.setString(1,CarModel);
                    ps.setString(2,Availability);
                    Model.setText(rs.getString("Model"));
                    Currentavailability.setText(rs.getString("availability"));
                    JOptionPane.showMessageDialog(null, "Record Found");
                } else {
                    JOptionPane.showMessageDialog(null, "Record Cannot be Found");
                }
            }else {
                JOptionPane.showMessageDialog(null, "Record Cannot be Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         try{ 
            //STEP 1: Establish the CONNECTION to the specific DB-will obtaining CONNECTION obj 
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalsystem", "root", ""); 
            myStat = myConn.createStatement(); 
            //STEP 2: Create the JDBC STATEMENT - for sending SQL STATEMENT to the DB 
              Ownername=Name.getText();
              ps = myConn.prepareStatement("Select * from cardetails where OwnerName=?"); 
              ps.setString(1,Ownername);
              rs = ps.executeQuery();
             if(rs.next()){   
             if (Ownername.equals(rs.getString("OwnerName"))){
                JOptionPane.showMessageDialog(null, "Update Sucessfully");
            } else {
                JOptionPane.showMessageDialog(null, "Update Unsucessfully");
             }     
            }}catch(Exception e){ 
            e.printStackTrace(); 
            }
    }//GEN-LAST:event_UpdateActionPerformed

    private void UpdateavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateavailabilityActionPerformed
        // TODO add your handling code here:
        try {
            //STEP 1: Establish the CONNECTION to the specific DB-will obtaining CONNECTION obj 
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalsystem", "root", "");
            myStat = myConn.createStatement();
            //STEP 2: Create the JDBC STATEMENT - for sending SQL STATEMENT to the DB 
            Ownername=Name.getText();
            Availability=Updateavailability.getSelectedItem().toString();
            ps = myConn.prepareStatement("Select * from cardetails where OwnerName=?");
            ps.setString(1,Ownername);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (Ownername.equals(rs.getString("OwnerName"))) {
                    ps = myConn.prepareStatement("Update cardetails SET availability=? where OwnerName=?");
                    ps.setString(1,Availability);
                    ps.setString(2,Ownername);
                    ps.executeUpdate();
                    Currentavailability.setText(String.valueOf(Availability));
                } else {      
                }
            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_UpdateavailabilityActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        MainMenuRentingOwner mainmenu = new MainMenuRentingOwner();
        mainmenu.setDefaultCloseOperation(MainMenuRentingOwner.EXIT_ON_CLOSE);
        this.setVisible(false);
        mainmenu.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCarAvailability.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCarAvailability.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCarAvailability.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCarAvailability.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCarAvailability().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField Currentavailability;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox<String> Updateavailability;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}