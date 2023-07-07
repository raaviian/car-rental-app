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
public class Car {
    private int ID;
    private String Manufacturer, OwnerName, Colour, Type;
    int SeatingCapacity;
    String Model;
    private RegistrationNumber regNum;
    private String availability;
    
    public Car(int ID,String Manufacture,String OwnerName,String Colour,String Type,int SeatingCapacity,String Model,String regNum){
        this.ID=ID;
        this.Manufacturer=Manufacturer;
        this.OwnerName=OwnerName;
        this.Colour=Colour;
        this.Type=Type;
        this.SeatingCapacity=SeatingCapacity;
        this.Model=Model;
        this.regNum=new RegistrationNumber(regNum);
        this.availability="Available";
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getOwnerName() {
        return OwnerName;
    }
    
    public void setAvailability(String availability){
        this.availability = availability;
    }
    
    public String getAvailability(){
        return availability;
    }

    public void setName(String CarOwnerName) {
        this.OwnerName = CarOwnerName;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(int SeatingCapacity) {
        this.SeatingCapacity = SeatingCapacity;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
    

    public void getPlateNum(){
    System.out.println("Plate Number\t: "+ regNum.getPlateNum());
    }

    public void getState(){
    System.out.println("State\t\t: " +regNum.getState());
   
    }

}
