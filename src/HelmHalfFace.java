/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
// HelmHalfFace.java
public class HelmHalfFace extends Helm {
    private boolean kacaAntiBaret;

    public HelmHalfFace(String merk, double harga, boolean kacaAntiBaret) {
        super(merk, harga);
        this.kacaAntiBaret = kacaAntiBaret;
    }

    public boolean isKacaAntiBaret() {
        return kacaAntiBaret;
    }

    public void setKacaAntiBaret(boolean kacaAntiBaret) {
        this.kacaAntiBaret = kacaAntiBaret;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kaca Anti Baret: " + (kacaAntiBaret ? "Yes" : "No"));
    }
}


