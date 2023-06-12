package Bangun2D;

public class Segitigasiku extends Segitiga{
    public Segitigasiku(double a, double t){
        super(a, t);
    }

    @Override
    public double getKeliling() {
        return getAlas() + getTinggi() + getSisiMiring();
    }

    public double getSisiMiring(){
        return Math.sqrt(Math.pow(getAlas()/2, 2) + Math.pow(getTinggi(), 2));
    }

    @Override
    public String toString() {
        return "SegitigaSiku{s=" + getAlas() + ", t=" + getTinggi() + "}";
    }
}
