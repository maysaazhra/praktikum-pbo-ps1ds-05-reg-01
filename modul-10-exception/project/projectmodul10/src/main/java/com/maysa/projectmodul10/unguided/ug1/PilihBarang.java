/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul10.unguided.ug1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilihBarang {

    public static void main(String[] args) {
        String[] daftarBarang = {"Buku", "Pulpen", "Penghapus"};
        Scanner input = new Scanner(System.in);

        System.out.println("Daftar Barang: [0] Buku, [1] Pulpen, [2] Penghapus");

        try {
            System.out.print("Masukkan nomor barang (0-2): ");
            int indeks = input.nextInt();
            System.out.println("Barang terpilih: " + daftarBarang[indeks]);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka bulat.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Nomor barang tidak tersedia (pilih 0-2).");
        }

        System.out.println("Proses pemilihan barang selesai.");
    }
}
