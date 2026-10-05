/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul03.Guided.Enkapsulasi;

public class Rekening {
    private int saldo = 0;
    
    public void tambahSaldo(int jumlah){
        saldo = saldo + jumlah;
        System.out.println("Saldo berhasil ditambahkan");
    }
    
    public void tampilkanSaldo(){
        System.out.println("Saldo Anda: " + saldo);
    }
}
