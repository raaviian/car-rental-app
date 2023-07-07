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
public class Record {
    private static User[] ownerRecord = {
                                         new RentingOwner("851227075041","Ali123","Ali Bin Hassan","Alihasan123@gmail.com"),
                                         new RentingOwner("851112011032","Lee2023","Lee Zii Jia","Leeziijia23@hotmail.com"),
                                         new RentingOwner("850215025548","Alisa21","Nur Alisa Binti Rais","Alisarais21@gmail.com"),
                                         new RentingOwner("870523047789","Muthu69","Muthu a/l Ramalingam","Muthu69@gmail.com"),
                                         new RentingOwner("890926091598","Firdaus22","Firdaus Bin Jamal","Daus22@gmail.com"),
                                         new RentingOwner("910830105763","qpeiD93921","Foo Ming Lee","MingLe24@hotmail.com"),
                                         new RentingOwner("931019122593","GH9e2457js","Ng Qing Zheng","QingZheng342@hotmail.com"),
                                         new RentingOwner("950113135494","Dhuq293848","Elisabeth Ng Lyeti","Elisa452@gmail.com"),
                                         new RentingOwner("990915033341","jidhF13439","Chong Yee Pheng","Pheng33@gmail.com"),
                                         new RentingOwner("000109051323","hi907WEIEE","Muhammad Afif Tambi","AfifTambi77@hotmail.com"),
                                         new RentingOwner("840405081543","niSF8766se","Karamjit Singh Karnail Singh","Karamjit2942@hotmail.com"),
                                         new RentingOwner("860303063159","hGUdd34668","Mohamed Azmin Ali","AzminAli88@gmail.com"),
                                         new RentingOwner("880805115923","nfED929521","Mohamed Azreen bin Ali","Azreen9299@gmail.com"),
                                         new RentingOwner("900604071236","nSQW93224d","Nur Liyana Binti Abdul Razak","Liyana99@gmail.com"),
                                         new RentingOwner("920708011595","hxhSh99817","Mohammad Lokman Bin Othman","Lokman009@gmail.com"),
                                         new RentingOwner("940417103459","ufdb371940","Muhammad Shaafi bin Dhaki","Shaafi88@hotmail.com"),
                                         new RentingOwner("960319089435","xbus8yy934","Ananth Nadarajan","Ananth67@gmail.com"),
                                         new RentingOwner("970725050157","KDSO20393a","Waytha Moorthy Ponnusamy","Waytha99@gmail.com"),
                                         new RentingOwner("980209040595","zhugY9e734","Chua Zi Peng","Zipeng55@hotmail.com"),
                                         new RentingOwner("870715010128","osrio39485","Sho Zhi Ying","Zhiying123@gmail.com")}; 
    private static User[] studentRecord= new Students[100];    
    private static int countUser=0;
    private static int countOwner=0;


    
    public static void addUser(User user){
        studentRecord[countUser]=user;
        countUser++;
    }
    
    public static User[] getStudent(){
        return studentRecord;
    }
    public static int getCountUser(){
        return countUser;
    }
    
    public static User[] getOwner(){
        return ownerRecord;
    }
}
