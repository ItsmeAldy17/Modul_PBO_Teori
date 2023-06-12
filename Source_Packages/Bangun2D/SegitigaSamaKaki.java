package Bangun2D;

public class SegitigaSamaKaki extends Segitiga{
    public SegitigaSamaKaki(double a, double t){
        super(a, t);
    }

    @Override
    public double getKeliling() {
        return getAlas() + 2 * getSisiMiring();
    }

    public double getSisiMiring(){
        return Math.sqrt(Math.pow(getAlas()/2, 2) + Math.pow(getTinggi(), 2));
    }

    @Override
    public String toString() {
        return "SegitigaSamaKaki{a=" + getAlas() + ", t=" + getTinggi() + "}"; 
    }
}
