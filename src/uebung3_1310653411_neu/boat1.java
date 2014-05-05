/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uebung3_1310653411_neu;

import at.ac.fh_kufstein.uebung03.*;
import at.ac.fh_kufstein.uebung03.*;

/**
 *
 * @author Natascha
 */
public class boat1 extends vehicle{
 
    private short draft;
    private short probeller;
    private double cargo;

    public boat1(short w, Color f, short ps, short d, short draft, short probeller, double cargo) {
        super(w, f, ps, d);
        this.draft = draft;
        this.probeller = probeller;
        this.cargo = cargo;
    }
    
    public void unload() throws InterruptedException
    {
        cargo = 0;
        Thread.sleep(5000);
    }

    public short getDraft() {
        return draft;
    }

    public void setDraft(short draft) {
        this.draft = draft;
    }

    public short getProbeller() {
        return probeller;
    }

    public void setProbeller(short probeller) {
        this.probeller = probeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + getPs() +  " PS und fährt mit " + getSpeed() + " km/h";
    }
    
    
}
