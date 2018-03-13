/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.beans;

import java.time.LocalDate;

/**
 *
 * @author c1042421
 */
public class Bestelling {
    private String naamKoper;
    private LocalDate datumBestelling;
    private int aantalStuks;
    private Broek broek;

    public Bestelling() {
    }

    public String getNaamKoper() {
        return naamKoper;
    }

    public void setNaamKoper(String naamKoper) {
        this.naamKoper = naamKoper;
    }

    public LocalDate getDatumBestelling() {
        return datumBestelling;
    }

    public void setDatumBestelling(LocalDate datumBestelling) {
        this.datumBestelling = datumBestelling;
    }

    public int getAantalStuks() {
        return aantalStuks;
    }

    public void setAantalStuks(int aantalStuks) {
        this.aantalStuks = aantalStuks;
    }

    public Broek getBroek() {
        return broek;
    }

    public void setBroek(Broek broek) {
        this.broek = broek;
    }
    
    public double getVerkoopprijs() {
        double prijs = aantalStuks * broek.getPrijs();
        prijs = aantalStuks < 3 ? prijs : prijs * 0.9;
        prijs *= 100;
        return Math.round(prijs) / (double) 100;
    }
    
    public LocalDate getLeverdatum() {
        return datumBestelling.plusWeeks(1);
    }

    @Override
    public String toString() {
        return "Bestelling van " + getNaamKoper() + ": " + getAantalStuks() + " kledingstukken van het volgende type:";
    }
    
    
}
