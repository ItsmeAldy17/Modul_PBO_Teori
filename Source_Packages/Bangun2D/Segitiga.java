package Bangun2D;

public abstract class Segitiga implements Bangun{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas(){
        return alas * tinggi / 2;
    }

    public abstract double getKeliling();

    @Override
    public String toString() {
        return "Segitiga{alas=" + alas + ", tinggi=" + tinggi + "}";
    }
}
