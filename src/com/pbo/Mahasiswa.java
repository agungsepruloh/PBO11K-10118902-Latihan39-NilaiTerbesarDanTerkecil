package com.pbo;

import java.util.Scanner;

public class Mahasiswa {

    public static int jumlahMahasiswa;
    public static int[] nilaiMahasiswa;

    public static void masukanNilai() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(String.format("Masukkan nilai Mahasiswa ke-%d : ", (i+1)));
            Scanner scanner = new Scanner(System.in);
            nilaiMahasiswa[i] = scanner.nextInt();
        }
    }

    public static void munculkanNilai() {
        System.out.println("\n===== Hasil Nilai Mahasiswa =====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(String.format("Hasil nilai mahasiswa ke-%d : %,2d", (i+1), nilaiMahasiswa[i]));
        }
    }

    public static double cariNilaiTerbesar() {
        double nilaiTerbesar = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
        }
        return nilaiTerbesar;
    }

    public static double cariNilaiTerkecil() {
        double nilaiTerkecil = nilaiMahasiswa[0];
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        return nilaiTerkecil;
    }
}
