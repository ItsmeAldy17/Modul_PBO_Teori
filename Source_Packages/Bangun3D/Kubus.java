package Bangun3D;

import Bangun2D.Persegi;

public class Kubus extends Persegi{

    public Kubus(double sisi) {
        super(sisi);
    }
    
    public double getLuas() {
        return 6 * super.getLuas();
        // Tugas 2.1
        // return 6 * getLuas();
        
    }

    public double getKeliling() {
    return 12 * super.getSisi();
    }

    public double getLuasAlas() {
        return super.getLuas();
        // Tugas 2.1
        // return getLuas();
        }

    public double getVolume() {
        return super.getLuas() * getSisi();
    }

    @Override
    public String toString() {
        return "Kubus{sisi=" + getSisi() + "}";
    }
    
}
