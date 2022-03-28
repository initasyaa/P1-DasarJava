import java.util.Scanner;

public class Tugas2_Pratikum1 {
    public static void main (String[]args){
        double c,f,hasil1,hasil2; //variabel
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Celcius = ");
        c = input.nextInt(); //input suhu Celcius
        hasil1 = (c*9/5)+32; //rumus suhu farenheit

        System.out.print("Masukan Nilai Fahrenheit = ");
        f = input.nextInt(); //input suhu Fahrenheit
        hasil2 = (5.0/9.0)*(f-32.0); //rumus suhu Celcius

        System.out.println("  ");
        System.out.println("Fahrenheit ke Celsius = " +hasil1);
        System.out.println("Celcius ke Fahrenheit = "+hasil2);
    }
}