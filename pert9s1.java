package com.projectlat1;

import java.util.Scanner;

public class pert9s1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====PROGRAM DATA MAHASISWA=====");
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        int[] umurMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukan Umur Mahsiswa Ke- " + (i + 1) + " :");
            umurMahasiswa[i] = input.nextInt();
        }
        System.out.println(" ");
        System.out.println("=======Data Dahasiswa=======");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("umur mahasiswa ke-" + (i + 1) + ": " + umurMahasiswa[i]);

        }
    }

}
