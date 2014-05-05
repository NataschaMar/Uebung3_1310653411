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
public class Liste<T> {

    T[] array;

    public Liste(int size) {
        array = (T[]) (new Object[size]);
    }

    @Override
    public String toString() {
        String listenInhalt = "";
        for (T a : array)
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
