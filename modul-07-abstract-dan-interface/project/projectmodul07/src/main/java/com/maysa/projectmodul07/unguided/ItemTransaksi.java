/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul07.unguided;

public interface ItemTransaksi {
    // Kontrak publik yang harus dipenuhi semua item kasir
    double getNominalBayar();

    String getNamaTransaksi();

    // Default method: dipakai langsung oleh semua kelas yang mengimplementasikan
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static method: dipanggil lewat nama interface
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}
