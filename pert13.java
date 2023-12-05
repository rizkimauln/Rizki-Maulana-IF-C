package com.rizkimauln;

import java.util.Scanner;

public class pert13 {
    // Method overloading untuk operasi penjumlahan
    static int tambah(int a, int b) {
        return a + b;
    }
    static double tambah(double a, double b) {
        return a + b;
    }
    // Method overloading untuk operasi pengurangan
    static int kurang(int a, int b) {
        return a - b;
    }
    static double kurang(double a, double b) {
        return a - b;
    }
    // Method overloading untuk operasi perkalian
    static int kali(int a, int b) {
        return a * b;
    }
    static double kali(double a, double b) {
        return a * b;
    }
    // Method overloading untuk operasi pembagian
    static int bagi(int a, int b) {
        return a / b;
    }
    static double bagi(double a, double b) {
        return a / b;
    }
    // Method overloading untuk menghitung luas persegi
    static int luasPersegi(int sisi) {
        return sisi * sisi;
    }
    // Method overloading untuk menghitung luas persegi panjang
    static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }
    // Method overloading untuk menghitung luas lingkaran
    static double luasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kalkulator
        System.out.println("=====PROGRAM KALKULATOR=====");
        System.out.print("MASUKAN ANGKA PERTAMA : ");
        double angka1 = scanner.nextDouble();

        System.out.print("MASUKAN ANGKA KEDUA   : ");
        double angka2 = scanner.nextDouble();

        System.out.println("HASIL PENJUMLAHAN : " + tambah(angka1, angka2));
        System.out.println("HASIL PENGURANGAN : " + kurang(angka1, angka2));
        System.out.println("HASIL PERKALIAN   : " + kali(angka1, angka2));
        System.out.println("HASIL PERKALIAN   : " + bagi(angka1, angka2));

        // Bangun Datar
        System.out.println("\n=====PROGRAM MENGHITUNG LUAS BANGUN DATAR=====");
        System.out.println("1. BANGUN DATAR PERSEGI");
        System.out.print("MASUKAN SISI PERSEGI : ");
        int sisiPersegi = scanner.nextInt();
        System.out.println("LUAS PERSEGI : " + luasPersegi(sisiPersegi));

        System.out.println("\n2. BANGUN DATAR PERSEGI PANJANG");
        System.out.print("MASUKAN PANJANG PERSEGI PANJANG : ");
        int panjangPersegiPanjang = scanner.nextInt();
        System.out.print("MASUKAN LEBAR PERSEGI PANJANG : ");
        int lebarPersegiPanjang = scanner.nextInt();
        System.out.println("LUAS PERSEGI PANJANG : " + luasPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang));

        System.out.println("\n3. BANGUN DATAR LINGKARAN");
        System.out.print("MASUKAN JARI JARI LINGKARAN : ");
        double radiusLingkaran = scanner.nextDouble();
        System.out.println("LUAS LINGKARAN : " + luasLingkaran(radiusLingkaran));
    }

}