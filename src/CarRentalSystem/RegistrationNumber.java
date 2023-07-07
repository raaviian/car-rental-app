/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentalSystem;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class RegistrationNumber {
 
    private String plateNumber;
    private String state;
    private String regNum;

    public RegistrationNumber(String regNum){
        this.regNum=regNum;
        this.plateNumber=regNum;
    }
    public void setPlateNum(String regNum,String plateNumber){
        this.plateNumber=plateNumber;
    }


    public String getPlateNum() {
    return plateNumber;
    }

    public String getState(){
    switch (getPlateNum().charAt(0)){
            case 'A': state="Perak";
            break;
            case 'B': state="Selangor";
            break;
            case 'C': state="Pahang";
            break;
            case 'D': state="Kelantan";
            break;
            case 'F': state="Putrajaya";
            break;
            case 'J': state="Johor";
            break;
            case 'K': state="Kedah";
            break;
            case 'M': state="Melaka";
            break;
            case 'N': state="Negeri Sembilan";
            break;
            case 'P': state="Penang";
            break;
            case 'R': state="Perlis";
            break;
            case 'T': state="Terengganu";
            break;
            case 'V': state="Kuala Lumpur";
            break;
            case 'W': state="Kuala Lumpur";
            break;
            case 'Q': state="Kuching";
            break;
            case 'S': state="Sabah";
            break;
            default:
            break;
        }

    return state;
    }
    public String getregNum(){
        return regNum;
    }
}
