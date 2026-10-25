/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul06.Unguided.model;

// Kelas turunan kedua: model klasifikasi
public class ModelKlasifikasi extends ModelML {
    private int jumlahKelas;

    public ModelKlasifikasi(String namaModel, int jumlahDataLatih, int jumlahKelas) {
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    // Override: biaya induk x jumlah kelas
    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() * jumlahKelas;
    }

    // hitungBiaya(int epoch) TIDAK di-override (memakai versi kelas induk)
}
