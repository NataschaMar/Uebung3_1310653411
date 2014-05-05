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
public class car1 extends vehicle1{
 
    private boolean aircondition;
    private short airbag;

    public car1(short w, Color f, short ps, short d, short a) {
        super(w, f, ps, d);
        aircondition = false;
        airbag = a;
    }
    
    public car1()
    {
        super();
    }
    
    public void startAircondition()
    {
        if(aircondition = false)
        {
        aircondition = true;
        }
        else
        {
            System.out.println("Die Aircondition läuft bereits");
        }
        
        
    }
    
    public void stopAircondition()
    {
        if(aircondition = true)
        {
            aircondition = false;
        }
        else
        {
            System.out.println("Die Aircondition ist bereits aus");
        }
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    @Override
    public String toString() {
       return "Mein Auto hat " + getPs() + " PS und fährt mit " + getSpeed() + " km/h"; 
    }
    
    
}
