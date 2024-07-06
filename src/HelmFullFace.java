/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
// HelmFullFace.java
public class HelmFullFace extends Helm {
    private boolean sunVisor;

    public HelmFullFace(String merk, double harga, boolean sunVisor) {
        super(merk, harga);
        this.sunVisor = sunVisor;
    }

    public boolean isSunVisor() {
        return sunVisor;
    }

    public void setSunVisor(boolean sunVisor) {
        this.sunVisor = sunVisor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sun Visor: " + (sunVisor ? "Yes" : "No"));
    }
}

