import java.io.IOException;
import java.util.Scanner;

public class U_BlokDanKomentar {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        String name = input.nextLine();
        System.out.println("Masukkan Umur : ");
        String age = input.nextLine();
        System.out.println("Masukkan Tinggi Badan : ");
        String height = input.nextLine();
        System.out.println("Sudah Menikah (true/false) : ");
        String married = input.nextLine();
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + Integer.parseInt(age));
        System.out.println("Tinggi Badan : " + Double.parseDouble(height));
        System.out.println("Sudah Menikah : " +Boolean.parseBoolean(married));
    }
}
