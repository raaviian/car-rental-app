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
public class PaymentGUI extends javax.swing.JFrame {

    Connection myConn;
    PreparedStatement ps;
    ResultSet rs;
    Statement myStat;
    private static long idCounter = 101;

    public static synchronized String createID() {
        return String.valueOf(idCounter++);
    }

    /**
     * Creates new form Payment
     */
    public PaymentGUI() {
        initComponents();
    }
    private static String StudentID;
    private static String paymentID;
    private static String bankaccount;
    private static String bankselect;
    private static int BankSelected;
    private static double amount;

    public static String getPaymentID() {
        paymentID = createID();
        return paymentID;
    }

    public static String getStudentID() {
        return StudentID;
    }

    public static String getBankselect() {
        return bankselect;
    }

    public static String getBankAccount() {
        return bankaccount;
    }

    public static int getBankSelected() {
        return BankSelected;
    }

    public static double getAmount() {
        return amount;
    }

    public void ClearField() {
        Amount.setText(null);
        AccNum.setText(null);
        BankSelect.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AccNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        Pay = new javax.swing.JButton();
        BankSelect = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        MatricID = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Payment");

        jLabel3.setText("Account Number   :");

        AccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccNumActionPerformed(evt);
            }
        });

        jLabel4.setText("Select Your Bank  :");

        jLabel5.setText("Amount (Rm)          :");

        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        Pay.setText("Proceed");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });

        BankSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maybank", "Bank Islam", "CIMB Bank", "RHB Bank", "Agro Bank" }));
        BankSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankSelectActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Matrics               :");

        MatricID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MatricID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BankSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MatricID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BankSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BankSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankSelectActionPerformed
            AddRentalCar addrental = new AddRentalCar();
            Amount.setText(String.valueOf(addrental.getTotalcharge()));
            amount = addrental.getTotalcharge();
    }//GEN-LAST:event_BankSelectActionPerformed

    private void AccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccNumActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AccNumActionPerformed

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AmountActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        // TODO add your handling code here:

        try {
            //STEP 1: Establish the CONNECTION to the specific DB-will obtaining CONNECTION obj 
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalsystem", "root", "");
            myStat = myConn.createStatement();

            //STEP 2: Create the JDBC STATEMENT - for sending SQL STATEMENT to the DB
            StudentID = MatricID.getText();
            AddRentalCar addrental = new AddRentalCar();
            Amount.setText(String.valueOf(addrental.getTotalcharge()));
            amount = addrental.getTotalcharge();
            paymentID = createID();
            BankSelected = BankSelect.getSelectedIndex() + 1;
            bankaccount = AccNum.getText();
            switch (BankSelected) {
                case 1:
                    bankselect = "Maybank";
                    break;
                case 2:
                    bankselect = "Bank Islam";
                    break;
                case 3:
                    bankselect = "CIMB Bank";
                    break;
                case 4:
                    bankselect = "RHB Bank";
                    break;
                case 5:
                    bankselect = "Agro Bank";
                    break;
            }
            ps = myConn.prepareStatement("INSERT INTO payment(StudentID, paymentID, Amount, AccountBank, BankSelected) VALUES (?,?,?,?,?)");
            ps.setString(1, StudentID);
            ps.setString(2, paymentID);
            ps.setDouble(3, amount);
            ps.setString(4, bankaccount);
            ps.setString(5, bankselect);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Your Payment is Successful");
            MainMenuStudent mainmenu = new MainMenuStudent();
            mainmenu.setDefaultCloseOperation(MainMenuStudent.EXIT_ON_CLOSE);
            this.setVisible(false);
            mainmenu.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PayActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        AddRentalCar addrentalcar = new AddRentalCar();
        addrentalcar.setDefaultCloseOperation(addrentalcar.EXIT_ON_CLOSE);
        this.setVisible(false);
        addrentalcar.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void MatricIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatricIDActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaymentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccNum;
    private javax.swing.JTextField Amount;
    private javax.swing.JButton Back;
    private javax.swing.JComboBox<String> BankSelect;
    private javax.swing.JTextField MatricID;
    private javax.swing.JButton Pay;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
