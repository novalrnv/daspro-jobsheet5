package Praktikum5;

import java.util.Scanner;

public class pemilihanharidenganif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        System.out.print("Inputkan angka : ");
        angka=sc.nextInt();

        if(angka <= 5){
            System.out.println("Weekday");
        }else if (angka <= 7) {
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid Number");
        }
    }
}