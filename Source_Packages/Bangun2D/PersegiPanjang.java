package Bangun2D;

public class PersegiPanjang implements Bangun {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLuas(){
        return panjang * lebar;
    }

    public double getKeliling(){
        return 2 * (panjang + lebar);
    }

    @Override
    public String toString() {
        return "PersegiPanjang{panjang=" + panjang + ", lebar=" + lebar + "}";
    }
}
