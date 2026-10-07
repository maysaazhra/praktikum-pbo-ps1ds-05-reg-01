/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul04.Unguided.model;

public class Dataset {
    
    // Konstanta: batas persentase missing (dalam persen)
    public static final double BATAS_MISSING = 5.0;

    // Variabel milik class: total objek Dataset yang telah dibuat
    private static int totalDataset = 0;

    // Atribut (enkapsulasi: private)
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Constructor 1: tanpa parameter
    public Dataset() {
        this("Tanpa Nama", 0, 0, 0);
    }

    // Constructor 2: hanya parameter 'nama'
    public Dataset(String nama) {
        this(nama, 0, 0, 0);
    }

    // Constructor 3: lengkap: 'nama','jumlahBaris','jumlahKolom','jumlahMissing'
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        setJumlahBaris(jumlahBaris);
        setJumlahKolom(jumlahKolom);
        setJumlahMissing(jumlahMissing);
        totalDataset++; // setiap objek yang dibuat menambah hitungan
    }

    // Method static untuk mengambil total tanpa membuat objek
    public static int getTotalDataset() {
        return totalDataset;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public int getJumlahMissing() {
        return jumlahMissing;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Nilai negatif ditolak: nilai lama tidak berubah
    public void setJumlahBaris(int jumlahBaris) {
        if (jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
        }
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
        }
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
        }
    }

    // Persentase sel kosong terhadap total sel (baris x kolom)
    public double getPersentaseMissing() {
        long totalSel = (long) jumlahBaris * jumlahKolom;
        if (totalSel == 0) {
            return 0;
        }
        return (double) jumlahMissing / totalSel * 100;
    }

    // true jika persentase missing melebihi batas
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }
}

