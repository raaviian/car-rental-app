/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentalSystem;

import CarRentalSystem.Payment;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Receipt {
     private String date;
    private String name;
    private Payment payment;
    
    public Receipt(Payment payment){
        this.payment = payment;
    }
    
    Scanner inputname = new Scanner(System.in);
    
    public String getdate(){
        return date;
    } 
    
    public void setStatus(){
        this.date = date;
    }
    
    public void getRecipientName(){
        System.out.println("Please enter your name: ");
        name = inputname.nextLine();
    }
    
    public void displayReceipt(){
        System.out.println("------------------------------------------");
        System.out.println("\t\t  RECEIPT  \t\t");
        System.out.println("------------------------------------------");
        System.out.println("Name : " +name);
        System.out.println("Payment ID : " + payment.getPaymentID());
        System.out.println("Name Of Bank: " + payment.getBankName());
        System.out.println("Bank Account No: " + payment.getBankAccount());
        System.out.println("Amount : RM " + payment.getAmount());
        System.out.println("Your Transaction is Successful! Thank You!");
    }
    

}
