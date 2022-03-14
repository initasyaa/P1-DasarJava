import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_BlokDanKomentar {
    public static void main(String[] args) throws IOException {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.printf("What Is Your Name? ");
        String name = input.readLine();
        System.out.printf("My Name is " +name);
    }
}
