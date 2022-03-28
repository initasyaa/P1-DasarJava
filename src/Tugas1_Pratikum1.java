import java.lang.Math;

public class Tugas1_Pratikum1 {

    public static void main(String[] args) {

        Integer r=5,d ;
        double Luas, Keliling;

        // Intro
        System.out.println("Program Lingkaran Java");
        System.out.println("======================");

        // Input
        System.out.println("Jari-Jari: "+r);

        // Proses
        d = 2 * r ;
        Keliling = Math.PI * d ;
        Luas = Math.PI * Math.pow(r,2);

        // Output
        System.out.println("Diameter: "+ d);
        System.out.println("Luas: "+ Luas);
        System.out.println("Keliling: "+ Keliling);

    }
}