package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk mencari nilai terbesar dan nilai terkecil dari sejumlah mahasiswa
 *
 */

public class Latihan39NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {
        Petugas petugas = new Petugas();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("===== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa");
        System.out.print("Masukkan Nama Petugas\t: ");
        Scanner scanner = new Scanner(System.in);
        petugas.nama = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa\t: ");
        Scanner scanner1 = new Scanner(System.in);
        mahasiswa.jumlahMahasiswa = scanner1.nextInt();
        mahasiswa.nilaiMahasiswa  = new int[mahasiswa.jumlahMahasiswa];
        mahasiswa.masukanNilai();
        mahasiswa.munculkanNilai();

        System.out.println("\nNilai terbesar adalah " + mahasiswa.cariNilaiTerbesar());
        System.out.println("Nilai terkecil adalah " + mahasiswa.cariNilaiTerkecil());
        System.out.println();
        petugas.ttdPetugas();
    }
}
