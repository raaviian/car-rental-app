/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentalSystem;

import static CarRentalSystem.CarRentalSystem.login;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class CarRentalSystem {
    //private String model;
    //private double renthours;
    //private double totalCharge;
    //private String id;
    
    //public CarRentalSystem(String id, String model, double renthours, double totalCharge) {

        //this.id = id;
        //this.model = model;
        //this.renthours = renthours;
        //this.totalCharge = totalCharge;
    //}
    
    //public void setModel(String model) {
        //this.model = model;
    //}

    
    //public void setRentHours(double renthours){
      //  this.renthours = renthours;
    //}
    //public String toString(){
      //  return id + " " + model + " " + renthours + " " + totalCharge;
    //}
    public static Login login=new Login();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
        login.setVisible(true);
    
        // TODO code application logic here
      //String UserID, password, Email, username;
        //Scanner scan = new Scanner(System.in);
        //int choose = 1;
        //Car[] arrayCar = new Car[20];
        //arrayCar[0] = new Car(1001, "Honda", "Muhammad Amirul Khor A'Dien", "Black", "Auto", 5, "Honda Civic", "SAO1122");
        //arrayCar[1] = new Car(1002, "Toyota", "Chin Siew Wei", "White", "Auto", 5, "Toyota Camry", "CAM1133");
        //arrayCar[2] = new Car(1003, "Proton", "Nur Syazana Mohamed Salleh", "Green", "Auto", 5, "Proton Saga", "ABC2244");
        //arrayCar[3] = new Car(1004, "Perodua", "Hamfazlin Sham Mohamed Arifin", "Red", "Auto", 5, "Perodua Myvi", "WAO3344");
        //arrayCar[4] = new Car(1005, "BMW", "Lee Hui Pin", "Silver", "Manual", 5, "BMW i7", "PAO1314");
       // arrayCar[5] = new Car(1006, "Kia", "Foo Ming Lee", "White", "Auto", 7, "Kia Sorento", "BQF3760");
        //arrayCar[6] = new Car(1007, "Honda", "Ng Qing Zheng", "Silver", "Auto", 5, "Honda HR-V", "FAT6098");
        //arrayCar[7] = new Car(1008, "Toyota", "Elisabeth Ng Lyeti", "Silver", "Auto", 5, "Toyota Yaris", "PTU9026");
        //arrayCar[8] = new Car(1009, "Proton", "Chong Yee Pheng", "Black", "Auto", 7, "Proton Exora", "AUN7903");
        //arrayCar[9] = new Car(1010, "Perodua", "Muhammad Afif Tambi", "Silver", "Manual", 7, "Perodua Aruz", "KES3490");
        //arrayCar[10] = new Car(1011, "BMW", "Karamjit Singh Karnail Singh", "Black", "Auto", 5, "BMW i4", "BCS1023");
        //arrayCar[11] = new Car(1012, "Kia", "Mohamed Azmin Ali", "Silver", "Auto", 7, "Kia Carnival", "WHO1347");
        //arrayCar[12] = new Car(1013, "Honda", "Mohamed Azreen bin Ali", "Gray", "Auto", 5, "Honda City", "PNJ2258");
        //arrayCar[13] = new Car(1014, "Toyota", "Nur Liyana Binti Abdul Razak", "Black", "Auto", 7, "Toyota Fortuner", "MCC3703");
        //arrayCar[14] = new Car(1015, "Proton", "Mohammad Lokman Bin Othman", "Silver", "Manual", 5, "Proton X50", "JER3010");
        //arrayCar[15] = new Car(1016, "Perodua", "Muhammad Shaafi bin Dhaki", "White", "Auto", 5, "Perodua Axia", "RES3250");
        //arrayCar[16] = new Car(1017, "BMW", "Ananth Nadarajan", "Gray", "Auto", 5, "BMW iX3", "VAS3890");
        //arrayCar[17] = new Car(1018, "Kia", "Waytha Moorthy Ponnusamy", "Green", "Auto", 5, "Kia K5", "QTR2194");
        //arrayCar[18] = new Car(1019, "Honda", "Chua Zi Peng", "Red", "Auto", 8, "Honda Odyssey", "TAS3295");
        //arrayCar[19] = new Car(1020, "Toyota", "Sho Zhi Ying", "Gray", "Manual", 8, "Toyota Innova", "NET1011");
        //do {
          //  System.out.println("|-----Welcome Car Rental System-----|");
            //System.out.println(" A. Register Account");
            //System.out.println(" B. Account Login");
            //System.out.println(" C. Exit");
            //System.out.println("|-----------------------------------|");
            //System.out.print("Enter your choice>> ");

            //int input = 0;
            //char Choice = scan.next().charAt(0);
            //User user = null;
            //switch (Choice) {
              //  case 'A':
                //    System.out.println("            Register Account           ");
                  //  System.out.println("---------------------------------------");
                    //System.out.println("Only Students are allowed to register account!");
                    //System.out.println("Renting Owner please contact our administrator to register account!");
                  //  System.out.println("Enter your choice (1:Students,2:Renting Owner):");
                    //scan.nextLine();
                    //input = Integer.parseInt(scan.nextLine());
                   // if (input == 1) {
                     //   System.out.print("Enter your Matric ID: ");
                       // UserID = scan.nextLine();
                       // System.out.print("Enter username      : ");
                       // username = scan.nextLine();
                       // System.out.print("Enter Email         : ");
                       // Email = scan.nextLine();
                       // System.out.print("Enter password      : ");
                       // password = scan.nextLine();
                       // user = new Students(UserID, password, username, Email);
                    //}
                    //if (user != null) {
                      //  System.out.println("Registration Details");
                        //System.out.println("--------------------");
                       // System.out.println("User ID : " + user.getUserID());
                      //  System.out.println("Password: " + user.getPassword());
                      //  System.out.println("Email   : " + user.getEmail());
                    //    System.out.println("Username: " + user.getUsername());
                  //      Record.addUser(user);
                   // }
                   // break;
                // case 'B':
                   // System.out.println("---------------------------------------");
                   // System.out.println("            Login Account           ");
                  //  System.out.println("-------------------------------------");
                  //  System.out.print("Are you student or renting owner(1=student,2=renting owner): ");
                  //  input = scan.nextInt();
                  //  if (input == 1) {
                    //    user = new Students();
                      //  System.out.println("Login Page");
                      //  System.out.println("------------");
                      //  boolean logged = false;
                      //  logged = user.enterLoginInfo(Record.getStudent(), Record.getCountUser());
                      //  if (!logged) {
                      //      System.out.println("wrong id or password");
                      //  }
                      //  System.out.println("Available Car Model");
                      //  for (int i = 0; i < arrayCar.length; i++) {
                      //      System.out.println(i + 1 + ". " + arrayCar[i].getModel()+" ("+arrayCar[i].getType()+")");
                      //      arrayCar[i].getPlateNum();arrayCar[i].getState();
                      //  }
                        //Student (Matric ID, password)
                      //  System.out.println("");

                      //  ArrayList<CarRentalSystem> RentalInfo = new ArrayList<>();

                      //  do {
                        //    System.out.println("Please Make Your Selection");
                          //  System.out.println("1. Add A Rental Car");
                          //  System.out.println("2. Delete A Rental Car");
                          //  System.out.println("3. Update A Rental Car");

                          //  System.out.println("Enter Your Option >> ");
                          //  int option = Integer.parseInt(scan.next());

                         //   if (option == 1) {
                           //     Rentals r = new Rentals();
                           //     Scanner userinput = new Scanner(System.in);
                           //     System.out.println("Enter the Rental ID: ");
                           //     String id = userinput.nextLine();
                           //     System.out.println("Please Enter The Model Of Car That You Want To Rent >> ");
                           //     String model = userinput.nextLine();
                           //     r.getRentalPrice(model);
                           //     r.getTotalCharge();

                           //     System.out.println("Please Enter The Rent Hours >> ");
                           //     int renthours = userinput.nextInt();
                           //     r.setRentalHours(renthours);

                           //     CarRentalSystem Carrents = new CarRentalSystem(id, model, renthours, r.getTotalCharge());
                           //     RentalInfo.add(Carrents);

                           //     System.out.println("<<Car Rental List>>");
                           //     System.out.println("| ID | MODEL | RENT HOURS | TOTALCHARGE | ");
                           //     for (CarRentalSystem carRentalApp : RentalInfo) {
                           //         System.out.println(carRentalApp);
                           //     }

                            //    System.out.println("Rental Car added!");
                            //    System.out.println("Total Price To Rent " + model + " is RM" + r.getTotalCharge());
                            
                           //     System.out.println("---------------------------------------------------------------");
                           //     System.out.println("PAYMENT");
                           //     System.out.println("---------------------------------------------------------------");
                             //   Payment p = new Payment(r);
                              //  p.fillPaymentInfo();
                              //  p.displayPaymentInfo();

                             //   Receipt receipt = new Receipt(p);
                              //  receipt.getRecipientName();
                              //  receipt.displayReceipt();
                            //} else if (option == 2) {
                              //  Scanner selection = new Scanner(System.in);
                                //System.out.println("Please Select The Rental Car That You Want To Delete/Remove >> ");
                                //int i = 1;
                                //for (int i = 1; i <= RentalInfo.size(); i++) {
                               // for (CarRentalSystem carRentalApp : RentalInfo) {
                                 //   System.out.println(i + "." + " - " + carRentalApp);
                                  //  i++;
                                //}
                                //System.out.print("Enter the number for your Option:");
                                //int selectRentalCar = Integer.parseInt(selection.nextLine());

                                //if (selectRentalCar < 0 || selectRentalCar > RentalInfo.size()) {
                                  //  System.out.println("Invalid Selection For The Car. Please make sure you enter the correct details.");
                               // } else {
                                 //   CarRentalSystem Carrents = RentalInfo.remove(selectRentalCar - 1);
                                 //   System.out.println("Removed - " + Carrents);
                               // }
                                //}
                            //} else if (option == 3) {
                              //  Scanner selection = new Scanner(System.in);
                              // System.out.println("Please Select The Rental Car That You Want To Update >> ");

                             //   for (int i = 0; i < RentalInfo.size(); i++) {
                               //     System.out.println(i + " - " + RentalInfo.get(i));

                                //}
                               // System.out.print("Option");
                               // int selectRentalCar = Integer.parseInt(selection.nextLine());

                               // if (selectRentalCar < 0 || selectRentalCar > RentalInfo.size()) {
                               //   System.out.println("Invalid Selection For The Car. Please make sure you enter the correct details.");
                               // } else {
                                 //   CarRentalSystem Carrents = RentalInfo.get(selectRentalCar);
                                 //   System.out.println("Updated Rental Car Info - " + Carrents);
                                 //   System.out.println("Model>> ");
                                 //   Carrents.setModel(selection.nextLine());
                                 //   System.out.println("Rent Hours>> ");
                                 //   Carrents.setRentHours(selection.nextInt());
                                 //   System.out.println("Your Rental Car Is Updated! Please wait for the verification...");
                                   
                                 //   int i = 1;
                                 //   for (CarRentalSystem carRentalApp : RentalInfo) {
                                 //     System.out.println(i + "." + " - " + " " + carRentalApp.model + " " + carRentalApp.renthours);
                                 //       i++;
                                 //   }
                               // }
                          //  }
                          //  System.out.println("Do you want to continue to select any selection again? 1 for Yes, 0 for no >>");
                          //  choose = scan.nextInt();
                       // } while (choose == 1);
                        //Renting Owner (ICNum, UserName, password)
                       // System.out.println("");
                   // } else {
                    //    user = new RentingOwner();
                      //  System.out.println("Login Page");
                      //  System.out.println("------------");
                      //  boolean logged = false;
                      //  logged = user.enterLoginInfo(Record.getOwner(), 20);
                      //  if (!logged) {
                       //     System.out.println("wrong id or password");
                       // }
                       // System.out.println("----------Main Menu----------");
                       // System.out.println("1. Update availability of cars");
                       // System.out.println("2. Exit");
                       // System.out.println("Enter your choice>>>");
                       // scan.nextLine();
                       // input = Integer.parseInt(scan.nextLine());
                        //Renting Owner (ICNum, UserName, password   
                       // if (input == 1) {
                         //   int found = 0;
                           // System.out.print("Enter owner name: ");
                           // String CarOwner = scan.nextLine();
                          //  for (int i = 0; i < arrayCar.length; i++) {
                              //  if (CarOwner.equals(arrayCar[i].getOwnerName())) {
                                //    found = 1;
                                  //  System.out.println("Your Search Record is found");
                                  //  System.out.printf("The availability of your car (%s)(Available=1,Unavailable=2): %s\n", arrayCar[i].getModel(), arrayCar[i].getAvailability());
                                 //   System.out.print("Update availability: ");
                                  // arrayCar[i].setAvailability(scan.next());
                                  //  System.out.println("New availability status: " + arrayCar[i].getAvailability());
                             //   }
                          //  }
                    //        if (found == 0) {
                      //          System.out.println("Your search result unable to found!");
                        //    }
                    //    } else {
                      //      System.out.println("Thank you for using our system!\n");
                    //    }
                  //  }
          //          System.out.println("Want to continue?(Yes=1||No=0:");
            //        choose = scan.nextInt();
        //    }
         //   System.out.println("");
      //  } while (choose == 1);
   }
} 

   

