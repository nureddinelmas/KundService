/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kundservice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nureddinelmas
 */
public class KundService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   Arkive.UyeSirala();
   
   Scanner YineGetir = new Scanner(System.in);
        System.out.println("Vill du hemta en medlem tıll : Ja/Nej? ");

        if ("Ja".equals(YineGetir.nextLine())){
            Arkive.UyeSirala();
            System.out.println("Tack!");
        }
        else if ("Nej".equals(YineGetir.nextLine())){
            System.out.println("Tack! Aterıgen");
        }
        else{
            System.out.println("Olmadı!");
        }
        

     
    

   
    }
    

  

}
