public class Main {

    public static void main(String[] args) {

        Persegi p = new Persegi(4);
        Lingkaran l = new Lingkaran(7);
        Segitiga s = new Segitiga(6, 8);

        System.out.println("PERSEGI");
        System.out.println("Luas: " + p.luas());
        System.out.println("Keliling: " + p.keliling());

        System.out.println();

        System.out.println("LINGKARAN");
        System.out.println("Luas: " + l.luas());
        System.out.println("Keliling: " + l.keliling());

        System.out.println();

        System.out.println("SEGITIGA");
        System.out.println("Luas: " + s.luas());
        System.out.println("Keliling: " + s.keliling());
    }

}