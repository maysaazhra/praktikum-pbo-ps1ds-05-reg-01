/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author ASUS
 */
public class RekapNilaiPraktikum {

    public static void main(String[] args) {

        // Konstanta KKM
        final double KKM = 75.0;

        // Array 1 Dimensi untuk menyimpan nama mahasiswa
        String[] namaMahasiswa = {
            "Andi",
            "Budi",
            "Citra"
        };

        // Array 2 Dimensi Rectangular untuk menyimpan nilai 2 modul
        double[][] nilaiModul = {
            {80.0, 85.0},
            {70.0, 65.0},
            {75.0, 80.0}
        };

        // Menampilkan judul
        System.out.println("=== SISTEM REKAP NILAI MAHASISWA ===");
        System.out.println("KKM: " + KKM);
        System.out.println();

        // Perulangan untuk mengakses data dan menghitung rata-rata
        for (int i = 0; i < namaMahasiswa.length; i++) {

            double rataRata = (nilaiModul[i][0] + nilaiModul[i][1]) / 2;

            // Percabangan untuk menentukan status kelulusan
            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            // Menampilkan hasil
            System.out.println("Nama       : " + namaMahasiswa[i]);
            System.out.println("Modul 1    : " + nilaiModul[i][0]);
            System.out.println("Modul 2    : " + nilaiModul[i][1]);
            System.out.println("Rata-rata  : " + rataRata);
            System.out.println("Status     : " + status);
            System.out.println("-----------------------------------");
        }
    }
}
