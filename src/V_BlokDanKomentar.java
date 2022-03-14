import  java.io.IOException;
import java.util.Scanner;

public class V_BlokDanKomentar {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama :");
        String name = input.nextLine();
        System.out.println("masukkan umur : ");
        int age = input.nextInt();
        System.out.println("Masukkan Tinggi Badan : ");
        double height = input.nextDouble();
        System.out.println("Sudah Menikah (true/false) : ");
        boolean married = input.nextBoolean();
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
        System.out.println("Tinggi Badan : " + height);
        System.out.println("Sudah Menikah : " +married);
    }
}
