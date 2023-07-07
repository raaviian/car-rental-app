/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentalSystem;

/**
 *
 * @author Asus
 */
public class Rentals {
   

    protected String id;
    private double price;
    private double rentalHours;
    private double totalCharge;
  
    
    public Rentals(){
    }
    
    public Rentals(String id,double price,double rentalHours, double totalCharge){
        //super();
        this.id = id;
        this.price = price;
        this.rentalHours = rentalHours;
        this.totalCharge = totalCharge;
    }
    
    
    public String getId(){
        return id;
    }
    
    
    public void setId(String id){
        this.id = id;
    }
    
    
    public double getRentalHours(){
        return rentalHours;
    }
    
    
    public void setRentalHours(double hours){
        this.rentalHours = hours;
    }
    
    
    public double getRentalPrice(String model){
     
        switch (model) {
            case "Honda Civic": 
                price = 22.15;
                break;
            case "Toyota Camry": 
                price = 25.00;
                break;
            case "Proton Saga": 
                price = 9.55;
                break;
            case "Perodua Myvi":
                price = 10.60; 
                break;
            case "BMW i7":
                price = 42.00; 
                break;
            case "Kia Sorento":
                price = 9.55; 
                break;
            case "Honda HR-V":
                price= 19.00; 
                break;
            case "Toyota Yaris":
                price= 13.70;
                break;
            case "Proton Exora":
                price = 9.90;
                break;
            case "Perodua Aruz":
                price = 14.80;
                break;
            case "BMW i4":
                price = 40.30; 
                break;
            case "Kia Carnival":
                price = 15.00;
                break;
            case "Honda City":
                price = 16.30 ; 
                break;
            case "Toyota Fortuner":
                price = 15.80;
                break;
            case "Proton X50":
                price = 10.00;
                break;
            case "Perodua Axia":
                price = 8.50;
                break;
            case "BMW iX3":
                price = 38.00;
                break;
            case "Kia K5":
                price = 10.50;
                break;
            case "Honda Odyssey":
                price = 22.20;
                break;
            case "Toyota Innova":
                price = 13.75 ; 
                break;
            default:
                break; 
        }
        return price;
    }
    
     public double getTotalCharge(){
         totalCharge = (price * rentalHours);
         return totalCharge;
     }
}


