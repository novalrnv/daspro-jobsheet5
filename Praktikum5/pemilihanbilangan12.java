package Praktikum5;
import java.util.Scanner;

public class pemilihanbilangan12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "angka Genap" : "angka Ganjil";
        System.out.println(angka + " termasuk " + hasil);
    }
}