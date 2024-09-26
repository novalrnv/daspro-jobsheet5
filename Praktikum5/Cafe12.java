package Praktikum5;

import java.util.Scanner;

public class Cafe12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String menu;
    char ukurancup;
    int jumlah;
    boolean keanggotaan;

    System.out.print("Masukkan Menu: ");
    menu = sc.nextLine();
    System.out.print("Masukkan ukuran Cup: ");
    ukurancup = sc.next().charAt(0);
    System.out.print("Masukkan Jumlah: ");
    jumlah = sc.nextInt();
    System.out.print("Masukkan Keanggotaan (true/false): ");
    keanggotaan = sc.nextBoolean();

    double hargamenu = 0;
    
    switch (menu.toLowerCase()){
        case "kopi":
            hargamenu = 12000;
            break;
        case "teh":
            hargamenu = 7000;
            break;
        case "coklat":
            hargamenu = 20000;
            break;
    }

    double totalharga = hargamenu * jumlah;

    switch (ukurancup) {
        case 'S':
            break;
        case 'M':
            totalharga += 0.25 * totalharga;
            break;
        case 'L':
            totalharga += 0.4 * totalharga;
            break;
        default:
            System.out.println("Size cup tidak tersedia");
    }

    double diskon = keanggotaan ? 0 : 0.1;
    double nominalbayar = totalharga - (diskon * totalharga);

    System.out.println("Item Pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukurancup);
    System.out.println("Nominal bayar: " + nominalbayar);
    }
}
