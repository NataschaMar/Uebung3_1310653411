/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein_Aufgabe5;

import at.ac.fh_kufstein.uebung03.Benennbar;


/**
 *
 * @author Natascha
 * @param <T>
 */
public class Liste1<T extends Benennbar11> {

    Benennbar11[] array;

    public Liste1(int size) {
        array =  new  Benennbar11[size];
    }

    @Override
    public String toString() {
        String listenInhalt = "";
        for (Benennbar11 a : array)
        {
            listenInhalt += a+ "\n";
        }
        return listenInhalt; 
       }
    

    public void save(T value) {
        for (int i = 0; i < array.length;i++) {

            if (array[i] == null) {
                array[i] = value;
                System.out.println("Es wurde gespeichert");
                break;
            } 
        }

    }
}
