package Bangun3D;

public class Tabung {
    private double phi = 22.0/7;
    private double r;
    private double tinggi;

    public Tabung(double r , double tinggi){
        this.r = r;
        this.tinggi = tinggi;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas(){
        return 2 * getLuasAlas() + 2 * phi * r * tinggi;
    }

    public double getLuasAlas(){
        return phi * r * r;
    }

    public double getVolume(){
        return phi * r * r * tinggi;
    }

    @Override
    public String toString() {
        return "Tabung{" + "r = " + r + " tinggi = " + tinggi +'}';
    }
}
