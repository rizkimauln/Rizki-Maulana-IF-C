package com.projectlat1;

import java.util.Scanner;

public class utssoal2 {
    public static void main(String[] args) {

        int harga, beli, total, kode;
        String ukur;
        char ulang;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("TOKO RIZKI BERKAH MAKMUR");
            System.out.println("------------------------");
            System.out.println("A. Susu Dancow");
            System.out.println("  1. Ukuran Kecil");
            System.out.println("  2. Ukuran Sedang");
            System.out.println("  3. Ukuran Besar");
            System.out.println("B. Susu Bendera");
            System.out.println("  1. Ukuran Kecil");
            System.out.println("  2. Ukuran Sedang");
            System.out.println("  3. Ukuran Besar");
            System.out.println("C. Susu SGM");
            System.out.println("  1. Ukuran Kecil");
            System.out.println("  2. Ukuran Sedang");
            System.out.println("  3. Ukuran Besar");
            System.out.println();

            System.out.print("Masukan Merk Susu 1/2/3 = ");
            kode = input.nextInt();
            System.out.print("Masukan Ukuran Kaleng kecil/sedang besar = ");
            ukur = input.next();

            if (kode == 1) {
                if (ukur == "kecil") {
                    harga = 15000;
                    System.out.println("Harga Satuan Rp. " + harga);
                } else if (ukur == "sedang") {
                    harga = 20000;
                    System.out.println("Harga Satuan Rp. " + harga);
                } else {
                    harga = 25000;
                    System.out.println("Harga Satuan Rp. " + harga);
                }
            } else if (kode == 2) {
                if (ukur == "kecil") {
                    harga = 13500;
                    System.out.println("Harga Satuan Rp. " + harga);
                } else if (ukur == "sedang") {
                    harga = 17500;
                    System.out.println("Harga Satuan Rp. " + harga);
                } else {
                    harga = 20000;
                    System.out.println("Harga Satuan Rp. " + harga);
                }
            } else {
                if (ukur == "kecil") {
                    harga = 15000;
                    System.out.println("Harga Satuan Rp. " + harga);
                } else if (ukur == "sedang") {
                    harga = 18500;
                    System.out.println("Harga Satuan Rp. " + harga);
                } else {
                    harga = 22000;
                    System.out.println("Harga Satuan Rp. " + harga);
                }
            }
            System.out.print("Jumlah Yang Dibeli = ");
            beli = input.nextInt();
            System.out.print("Harga Yang Harus dibayar Sebesar Rp. " + beli * harga);

            System.out.println();
            System.out.print("Transaksi Jual Beli Diulang (y/t) = ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y');
        System.out.println("Terima Kasih");
    }

}