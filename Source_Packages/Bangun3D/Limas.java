package Bangun3D;

import Master.Matematika;
import Bangun2D.Bangun;
import Bangun2D.Persegi;
import Bangun2D.PersegiPanjang;
import Bangun2D.Segitiga;

public class Limas {
    private double tinggi;
    private Bangun alas;

    public Limas(double tinggi, Bangun alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public Bangun getAlas() {
        return alas;
    }

    public double getVolume(){
        return getAlas().getLuas() * this.tinggi * 1.0/3;
    }

    public double getLuas(){
        int jumlahSisi = 0;
        if (this.alas instanceof Persegi) {
            jumlahSisi = 4;
            Persegi alas = (Persegi) this.alas;
            return getAlas().getLuas() + (jumlahSisi * ((alas.getSisi()) * Matematika.getMiring(tinggi, alas.getSisi() / 2)));
        }
        else if (this.alas instanceof Segitiga) {
            jumlahSisi = 3;
            Segitiga alas = (Segitiga) this.alas;
            return getAlas().getLuas() + (jumlahSisi * ((alas.getAlas()) * Matematika.getMiring(tinggi, alas.getAlas() / 2)));
            
        }
        else if (this.alas instanceof PersegiPanjang) {
            PersegiPanjang alas = (PersegiPanjang) this.alas;
            return getAlas().getLuas() + (2 * (((alas.getLebar()) * Matematika.getMiring(tinggi, alas.getPanjang() / 2)) + ((alas.getPanjang()) * Matematika.getMiring(tinggi, alas.getLebar() / 2))));
        }
        return 0;
    }

}
