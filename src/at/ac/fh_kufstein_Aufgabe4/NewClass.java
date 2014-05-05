/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein_Aufgabe4;

/**
 *
 * @author Natascha
 */
public class NewClass {
    
    public static void main(String[] args)
    {
     Liste a = new Liste(2);
     a.save(2.5);
     a.save(5.0);
     a.save(200.0);
     
     System.out.println(a.toString());
     
    }           
}
