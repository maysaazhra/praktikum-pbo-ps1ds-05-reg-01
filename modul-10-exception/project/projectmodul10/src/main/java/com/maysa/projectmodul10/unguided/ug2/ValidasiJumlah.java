/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul10.unguided.ug2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidasiJumlah {

    // throws Exception: method ini bisa melempar checked exception ke pemanggilnya
    public static void cekJumlah(int qty) throws Exception {
        if (qty <= 0) {
            throw new Exception("Jumlah barang minimal harus 1.");
        }
        System.out.println("Jumlah barang valid: " + qty + " pcs.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int qty = input.nextInt();
            cekJumlah(qty);
        } catch (InputMismatchException e) {
            // harus di atas catch (Exception e), karena InputMismatchException
            // adalah turunan Exception
            System.out.println("Error: Input harus berupa angka bulat.");
        } catch (Exception e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }
    }
}
