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

public class Broek extends Kledingsstuk{
    private double binnenbeenlengte;
    private double taillebreedte;
    private SoortBroek type;

    public Broek(double binnenbeenlengte, double tallebreedte, String merk) {
        super(merk);
        this.binnenbeenlengte = binnenbeenlengte;
        this.taillebreedte = tallebreedte;
    }

    public double getBinnenbeenlengte() {
        return binnenbeenlengte;
    }

    public void setBinnenbeenlengte(double binnenbeenlengte) {
        this.binnenbeenlengte = binnenbeenlengte;
    }

    public double getTaillebreedte() {
        return taillebreedte;
    }

    public void setTaillebreedte(double tallebreedte) {
        this.taillebreedte = tallebreedte;
    }

    public SoortBroek getType() {
        return type;
    }

    public void setType(SoortBroek type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "broek (" + type.toString() + ")" + " van het merk " + 
                super.toString() + " met binnenbeenlengte " + 
                binnenbeenlengte + " cm en taillebreedte " + taillebreedte + " cm." ;
    }
    
    
}
