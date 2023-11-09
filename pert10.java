package com.projectlat1;

public class pert10 {
    public static void main(String[] args) {
        // Matriks 1
        int[][] matrix1 = {
            {2, 5, 3},
            {4, 1, 6}
        };

        // Matriks 2
        int[][] matrix2 = {
            {1, 4, 3},
            {3, 2, 1}
        };

        // Inisialisasi matriks hasil dengan ukuran yang sama
        int[][] result = new int[matrix1.length][matrix1[0].length];

        // Melakukan penjumlahan matriks
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Menampilkan hasil penjumlahan matriks
        System.out.println("=== PENJUMLAHAN MATRIK ===");
        System.out.println("\nMATRIK 1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nMATRIK 2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nHasil Penjumlahan Matrik 1 dan Matrik 2 adalah:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

