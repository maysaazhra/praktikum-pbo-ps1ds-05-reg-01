package com.maysa.projectmodul03.Unguided;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Paksa output Java jadi UTF-8 supaya simbol derajat terbaca
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // Data suhu 7 hari
        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

        // Membuat object PengolahSuhu
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        // Menampilkan data awal
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        // Mencari index yang kosong
        int indexKosong = pengolah.cariIndexKosong();


        System.out.println();
        System.out.println(
            "Index hari kosong (dimulai dari 0): " + indexKosong
        );

        // Mengisi data yang kosong
        pengolah.isiDataKosong();

        // Menampilkan data setelah pengisian
        System.out.println();
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        // Menghitung rata-rata
        double rataRata = pengolah.hitungRataRata();

        System.out.printf(
            "%nRata-rata : %.2f\u00B0C%n",
            rataRata
        );

        // Menampilkan array yang ada di main
        System.out.println();
        System.out.println(
            "Isi array suhuHarian di main setelah isiDataKosong() dijalankan:"
        );
        System.out.println(Arrays.toString(suhuHarian));

        // Array suhuHarian ini ikut berubah isinya walau tidak pernah diubah
        // langsung di main, karena waktu object PengolahSuhu dibuat, constructor
        // menyimpan referensi/alamat array yang sama persis (bukan menyalin
        // datanya). Jadi saat isiDataKosong() mengubah data lewat object,

        // perubahan itu otomatis kebaca juga di array ini.
    }
}