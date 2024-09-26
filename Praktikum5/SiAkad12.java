package Praktikum5;

import java.util.Scanner;

public class SiAkad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiakhir;

        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();

        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();

        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine().charAt(0);

        System.out.print("Masukkan Nomor Absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis : " );
        nilaikuis = sc.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        nilaitugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Ujian : ");
        nilaiujian = sc.nextDouble();

        nilaiakhir = (nilaikuis * 0.2) + (nilaitugas * 0.15) + (nilaiujian * 0.3) + (nilaiujian * 0.35);

        System.out.print("Mahasiswa dengan Nama : " + nama + " (NIM : )" + nim );
        System.out.println(" Kelas : " + kelas + " Nomor Absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiakhir);

        String kualifikasi;
        String huruf;
        if(nilaiakhir>80 && nilaiakhir<=100){
            kualifikasi = "Sangat Baik";
            huruf = "A";
        }else if(nilaiakhir>73 && nilaiakhir<=80){
            kualifikasi = "Lebih dari Baik";
            huruf = "B+";
        }else if(nilaiakhir>65 && nilaiakhir<=73){
            kualifikasi = "Baik";
            huruf = "B";
        }else if(nilaiakhir>60 && nilaiakhir<=65){
            kualifikasi = "Lebih dari Cukup";
            huruf = "C+";
        }else if(nilaiakhir>50 && nilaiakhir<=60){
            kualifikasi = "Cukup";
            huruf = "C";
        }else if(nilaiakhir>39 && nilaiakhir<=50){
            kualifikasi = "Kurang";
            huruf = "D";
        }else{
            kualifikasi = "Gagal";
            huruf = "E";
        }
        System.out.println("Nilai Akhir Huruf : " + huruf);
        System.out.println("Kualifikasi : " + kualifikasi);
    }
}