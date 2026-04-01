public class Segitiga extends BangunDatar {

    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }

}