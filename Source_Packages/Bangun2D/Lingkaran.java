package Bangun2D;

public class Lingkaran implements Bangun{
    private double phi = 22.0/7, r;

    public Lingkaran(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLuas(){
        return phi * r * r;
    }

    public double getKeliling(){
        return 2 * phi * r;
    }

    @Override
    public String toString() {
        return "Lingkaran{r=" + r + "}";
    }
}
