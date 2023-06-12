package Bangun3D;
import Bangun2D.Segitiga;
import Bangun2D.SegitigaSamaKaki;
import Bangun2D.SegitigaSamaSisi;
import Bangun2D.Segitigasiku;


public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggi;
    
    public PrismaSegitiga(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga getAlas() {
        return alas;
    }

    public void setAlas(Segitiga alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return alas.getLuas() * tinggi;
    }

    public double getLuas() {
        return 2 * alas.getLuas() + alas.getKeliling() * this.tinggi;
    }

    public String getDetailAlas(){
        if (alas instanceof Segitigasiku){
            return "Alas berbentuk Segitiga Siku";
        }
        else if (alas instanceof SegitigaSamaKaki){
            return "Alas berbentuk Segitiga Sama Kaki";
        }
        else if (alas instanceof SegitigaSamaSisi){
            return "Alas berbentuk Segitiga Sama Sisi";
        }
        else {
            return "Alas berbentuk Segitiga";
        }
    }

    @Override
    public String toString() {
        return "PrimaSegitiga{alas=" + this.alas + ", tinggi=" + this.tinggi + "}";
    }
    
}
