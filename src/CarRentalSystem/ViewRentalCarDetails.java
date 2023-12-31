package CarRentalSystem;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class ViewRentalCarDetails extends javax.swing.JFrame {

    Connection myConn;
    PreparedStatement ps;
    ResultSet rs;
    Statement myStat;

    /**
     * Creates new form ViewRentalCarDetails
     */
    public ViewRentalCarDetails() {
        initComponents();
    }
    private static String StudentID;
    private static String rentalID;
    private static String CarModel;
    private static int renthour;
    private static double price1hour;
    private static double totalcharge;
    private static String carmodel;

    public static String getStudentID() {
        return StudentID;
    }

    public static int getRenthour() {
        return renthour;
    }

    public static double getPrice1hour() {
        return price1hour;
    }

    public static double getTotalcharge() {
        return totalcharge;
    }

    public static String getCarmodel() {
        return carmodel;
    }

    public static String getRentalID() {
        return rentalID;
    }

    public static String getCarModel() {
        return CarModel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MatricID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Price1Hour = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        totalprice = new javax.swing.JTextField();
        View = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        HourRent = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("View Rental Car Details");

        jLabel2.setText("ID Matric              :");

        MatricID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Car Model            :");

        jLabel5.setText("Price for 1 hour    :");

        Price1Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price1HourActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Price           :");

        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        jLabel7.setText("Rent Hours          :");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalprice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HourRent))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MatricID, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Price1Hour)))
                        .addGap(31, 31, 31)
                        .addComponent(View)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(369, 369, 369))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(View)
                    .addComponent(MatricID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Price1Hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(HourRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(back)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatricIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatricIDActionPerformed

    private void Price1HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price1HourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price1HourActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:

        try {
            //STEP 1: Establish the CONNECTION to the specific DB-will obtaining CONNECTION obj 
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalsystem", "root", "");
            myStat = myConn.createStatement();
            //STEP 2: Create the JDBC STATEMENT - for sending SQL STATEMENT to the DB 
            StudentID = MatricID.getText();
            ps = myConn.prepareStatement("SELECT * From rentaldetails where StudentID like ?");
            ps.setString(1, StudentID);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (StudentID.equals(rs.getString("StudentID"))) {
                    ps = myConn.prepareStatement("SELECT * From rentaldetails where carmodel=?,price1hour=?,rentalhours=?,totalcharge=?");
                    ps.setString(1, carmodel);
                    ps.setDouble(2, price1hour);
                    ps.setInt(3, renthour);
                    ps.setDouble(4, totalcharge);
                    JOptionPane.showMessageDialog(null, "Your Record is found");
                    model.setText(rs.getString("carmodel"));
                    Price1Hour.setText(String.valueOf(rs.getDouble("price1hour")));
                    HourRent.setText(String.valueOf(rs.getInt("rentalhours")));
                    totalprice.setText(String.valueOf(rs.getDouble("totalcharge")));
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Your Record are unable to find");
                }
            }
            else {
                    JOptionPane.showMessageDialog(null, "Your Record are unable to find");
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MainMenuStudent mainmenustudent = new MainMenuStudent();
        mainmenustudent.setDefaultCloseOperation(mainmenustudent.EXIT_ON_CLOSE);
        this.setVisible(false);
        mainmenustudent.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRentalCarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRentalCarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRentalCarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRentalCarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRentalCarDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HourRent;
    private javax.swing.JTextField MatricID;
    private javax.swing.JTextField Price1Hour;
    private javax.swing.JButton View;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField model;
    private javax.swing.JTextField totalprice;
    // End of variables declaration//GEN-END:variables
}
