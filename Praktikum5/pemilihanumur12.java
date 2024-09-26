package Praktikum5;

import java.util.Scanner;

public class pemilihanumur12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur;

        System.out.print("Masukkan Umur : ");
        umur = sc.nextInt();

        if(umur<=0){
            System.out.println("Inputan tidak valid!");
        }else if(umur<=12){
            System.out.println("Umur tersebut termasuk kategori Anak");
        }else if(umur<=19){
            System.out.println("Umur tersebut termasuk kategori Remaja");
        }else if(umur<=64){
            System.out.println("Umur tersebut termasuk kategori Dewasa");
        }else if(umur>=65){
            System.out.println("Umur tersebut termasuk kategori Lansia");
        }
    }    
}