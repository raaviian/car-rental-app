/*
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
public class User {
   
    protected String UserID;
    protected String password;
    protected String username;
    protected String Email;
    Scanner scan= new Scanner(System.in);
    
    public User(){
        
    }
    public User(String UserID,String password, String username, String Email){
        this.UserID=UserID;
        this.password=password;
        this.username=username;
        this.Email=Email;
    }
    public String getUserID(){
        return UserID;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return Email;
    }
    public String getUsername(){
        return username;
    }
    public boolean enterLoginInfo(User[] user, int length) {
        String UserID, password;
        System.out.println("Enter your ID:");
        UserID = scan.nextLine();
        System.out.println("Enter your password:");
        password = scan.nextLine();
        
        if (length != 0) {
            for (int i = 0; i < length; i++) {
                if (password.equals(user[i].getPassword()) && UserID.equals(user[i].getUserID())) {
                    System.out.println("Welcome");
                    return true;   
                }
            }
        }
        
//        if(UserID.equals(UserID) && password.equals(password)){ 
//            System.out.println("Welcome");
//            return true;
//        }
    return false;
    }

}

