/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kundservice;

import java.util.Scanner;

/**
 *
 * @author nureddinelmas
 */
public class Arkive {

    private static int PhoneCall(String ew) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public  String FirstName;
    public String LastName;
    public int Age;
    public int TelefonNummer;
    public Boolean Medlem;

    public Arkive(String FirstName, String LastName, int Age, int TelefonNummer) {
        this.FirstName = FirstName;
                
        this.LastName = LastName;
        this.Age = Age;
        this.TelefonNummer = TelefonNummer;

        if (Age >= 18) Medlem = true;
        else Medlem= false;
                
       
    }
    
    public static void PhoneCall(Arkive callDefteri){
        System.out.println("MEMBERS LIST : ");
        System.out.println("First Name     : "+callDefteri.FirstName);
        System.out.println("Last Name      : "+callDefteri.LastName);
        System.out.println("Age            : "+callDefteri.Age);
        System.out.println("Telefon Nummer : "+callDefteri.TelefonNummer);
        
        if (callDefteri.Medlem == true)
        System.out.println("Member         : "+"Medlem");

        else
          System.out.println("Member         : "+"Inte Vuxen");  
        
         if ( callDefteri.TelefonNummer >= 100 ){
            System.out.println("Telefon Numarası Yalnış");
        }
        

    }
    
        public static void UyeSirala(){
       
        Arkive[] Person = new Arkive[5];
   
        Person[0] = new Arkive("Nureddin", "Elmas", 40, 348597398);
        Person[1] = new Arkive("Seyma", "Elmas", 30, 348597398);
        Person[2] = new Arkive("Ali Emre", "Elmas", 11, 348597398);
        Person[3] = new Arkive("Sami", "Elmas", 8, 348597398);
        Person[4] = new Arkive("Muhammed", "Ertunc", 32, 343453398);
    
        Scanner Hamta = new Scanner(System.in);
        System.out.print("Ange en medlem kod : ");

        int x = Hamta.nextInt();
                if (x >= Person.length){
                    System.out.println("Medlem hittades inte");   
                }
                else{
                  Arkive.PhoneCall(Person[x]);  
                }

               
    }
        
            public void UyeEsles(){
        
    }
}
