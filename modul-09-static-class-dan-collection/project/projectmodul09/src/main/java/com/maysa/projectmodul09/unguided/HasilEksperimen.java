/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul09.unguided;

public class HasilEksperimen implements Comparable<HasilEksperimen> {

    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    // Static variable: dipakai bersama oleh semua objek
    private static int jumlahEksperimen = 0;

    public HasilEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Static method: dipanggil lewat nama kelas
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    // Urutan default: akurasi dari tertinggi ke terendah
    @Override
    public int compareTo(HasilEksperimen lain) {
        return Double.compare(lain.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }
}
