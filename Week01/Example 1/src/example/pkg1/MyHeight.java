/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.pkg1;

/**
 *
 * @author dsmale
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cm = 180;
        double totalInches;
        double inches;
        double feet;
        
        totalInches = cm / 2.54;
        feet = totalInches / 12;
       inches = totalInches % 12;
       
       System.out.println(cm + " cm is "+ feet + " foot and " + inches + " inches");
    }
    
}
