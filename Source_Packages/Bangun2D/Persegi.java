package Bangun2D;

public class Persegi implements Bangun{
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    @Override
    public String toString() {
        return "Persegi{sisi=" + sisi + "}";  
    }
}
