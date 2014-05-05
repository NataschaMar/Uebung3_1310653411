/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein_Aufgabe5;

/**
 *
 * @author Natascha
 */
public class NewClass {
 
    public static void main(String[] args)
    {
     Liste1<Benennbar11> a =  new Liste1(3);
     Benennbar11 b = new car1();
     Benennbar11 c = new boat1();
     Benennbar11 d = new vehicle1();
     
     a.save(b);
     a.save(c);
     a.save(d);
     
     
     
     
     System.out.println(a.toString());
     
    } 
}
