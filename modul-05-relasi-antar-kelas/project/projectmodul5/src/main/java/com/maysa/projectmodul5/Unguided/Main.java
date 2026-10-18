/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul5.Unguided;

import com.maysa.projectmodul5.Unguided.Agregasi.Pesanan;
import com.maysa.projectmodul5.Unguided.Asosiasi.Kasir;
import com.maysa.projectmodul5.Unguided.Komposisi.ItemPesanan;

public class Main {
    public static void main(String[] args) {
        // 1. Kasir
        Kasir kasir = new Kasir("Budi");

        // 2. ItemPesanan dibuat independen di main
        //    (RincianHarga dibuat otomatis di dalam ItemPesanan)
        ItemPesanan item1 = new ItemPesanan("Iced Americano", 18000);
        ItemPesanan item2 = new ItemPesanan("Beef Croissant", 25000);
        ItemPesanan item3 = new ItemPesanan("Matcha Latte", 22000);

        // 3. Pesanan untuk Meja 4, kapasitas 5 item
        Pesanan pesanan = new Pesanan(4, 5);

        // 4. Agregasi: memasukkan item yang sudah ada ke dalam pesanan
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);

        // 5. Tampilkan pesanan
        pesanan.tampilkanPesanan();

        // 6. Asosiasi: kasir memproses pembayaran
        kasir.prosesPembayaran(pesanan);
    }
}
