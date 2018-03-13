/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c1042421
 */

package hbo5.it.www.beans;

public class Kledingsstuk {
    private String merk;
    private double prijs;

    public Kledingsstuk(String merk) {
        this.merk = merk;
    }

    public Kledingsstuk() {
    }

    public Kledingsstuk(String merk, double prijs) {
        this.merk = merk;
        this.prijs = prijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return merk.toUpperCase() ;
    }
}
