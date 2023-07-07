/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentalSystem;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Payment {
    private String PaymentID;
    private String BankSelect;
    private String BankAcc;
    private double Amount;
    private Rentals rentals;
   
    
    Scanner scan = new Scanner(System.in);
    public Payment(Rentals rentals){
    this.rentals = rentals;
    }
    
    private static long idCounter = 1;

    public static synchronized String createID()
    {
        return String.valueOf(idCounter++);
    }    

    public Payment() {
        PaymentID = "";
    }

    public void fillPaymentInfo(){
        String bankName[]={"Maybank","Public Bank", "CIMB Bank"};
        int i, bank;
        PaymentID=createID();
        System.out.println("PaymentID: "+ PaymentID);
        do{
        System.out.println("Please Select Your Bank");
        
        for(i=0;i<3;i++){
            System.out.println(i+1 + "  "+bankName[i]);
        }
        System.out.print("Please Enter Bank:");
        bank=scan.nextInt()-1;
        if(bank>2 || bank<0 ){
            System.out.println("please enter existed bank");
        }
        }while(bank>2 || bank<0);
        
        BankSelect=bankName[bank];
        System.out.print("Enter Bank Account:");
        BankAcc=scan.next();     
    }
    
    public void displayPaymentInfo(){
        System.out.println("Payment ID:"+PaymentID);
        System.out.println("Bank:"+BankSelect);
        System.out.println("Bank Account:"+BankAcc);
        Amount = rentals.getTotalCharge();
        System.out.printf("Amount: RM%.2f\n",Amount);
    }
    public String getBankName(){
        return BankSelect;
    }
    public String getBankAccount(){
        return BankAcc;
    }
    public double getAmount(){
        return Amount;
    }
    public String getPaymentID(){
        return PaymentID;
    }
   public void setRentals(){
       this.rentals = rentals;
   }
}
