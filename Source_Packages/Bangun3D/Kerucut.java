package Bangun3D;

// 5b
// Kelas Kerucut akan lebih cocok untuk mewarisi class Tabung
// karena keduanya memiliki method dan atribut yang identik, seperti radius, tinggi, rumus seperti getVolume, dan getLuas()
public class Kerucut extends Tabung{
    private double phi = 22.0/7;

    public Kerucut(double r, double tinggi){
        super(r, tinggi);
    }

    public double getLuas(){
        return getLuasAlas() + phi * getR() * getSisiMiring();
    }

    public double getSisiMiring(){
        double s = getR() * getR() + getTinggi() * getTinggi();
        return Math.sqrt(s);
    }

    public double getVolume(){
        return super.getVolume()/3;
    }

    @Override
    public String toString() {
        return "Kerucut{" + "r = " + getR() + " tinggi = " + getTinggi() +'}';
    }
}
