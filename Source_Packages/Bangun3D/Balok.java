package Bangun3D;
import Bangun2D.PersegiPanjang;

public class Balok extends PersegiPanjang{
    private double tinggi;

    public Balok(double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return 2  * (getPanjang() * getLebar() + getPanjang() * this.tinggi) + getLebar() * tinggi;
    }

    public double getVolume() {
        return super.getLuas() * this.tinggi;
    }
        
    public String toString() {
        return "Balok{panjang=" + getPanjang() + ", lebar=" + getLebar() + ", tinggi=" + this.tinggi + "}";
    }
}

