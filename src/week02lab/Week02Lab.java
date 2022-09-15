/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02lab;
import java.util.*;
/**
 *
 * @author super
 */
public class Week02Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Welcome to Kyles Krazy Mad Lib");
        System.out.println("Enter a verb: ");
        String verb1 = in.next();
        System.out.println("Enter a colour: ");
        String colour1 = in.next();
        System.out.println("Enter an animal: ");
             String animal1 = in.next();
        System.out.println("Enter a verb: ");
        String verb2 = in.next();
        System.out.println("Enter a verb: ");
        String verb3 = in.next();
        System.out.println("Enter an animal: ");
        String animal2 = in.next();
        
        System.out.println("The " + verb1 + " " + colour1 + " " +  animal1 + " " + verb2 + " " +  
                "over the " +  verb3 + " " + animal2);
    }
    
}
