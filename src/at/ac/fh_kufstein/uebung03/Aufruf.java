/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung03;

import at.ac.fh_kufstein.uebung03.vehicle.Color;



/**
 *
 * @author Natascha
 */
public class Aufruf {
    
    public static void main(String[] args){
        
    
    car bmw = new car((short) 4, Color.Silver, (short) 220, (short) 5, (short) 4);
    car audi = new car((short) 4, Color.Black, (short) 180, (short) 5, (short) 8);   
    boat titanic = new boat((short) 0, Color.Blue, (short) 51000, (short) 0, (short) 10.54, (short) 3, 100.000);
    
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());

        //Aufgabe 2
     Benennbar namedCar = new car(); //Inteface Polymorphismus
     namedCar.setName("Bernadette");
     System.out.println("Es heißt " + namedCar.getName());
    }        
    
}


