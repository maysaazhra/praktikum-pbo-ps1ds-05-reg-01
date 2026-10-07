/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul04.Guided.manusia;

public class Manusia {

    private String nama;
    private int umur;

    // Constructor pertama
    public Manusia() {
    }

    // Constructor kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    // Constructor ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Setter
    public void setNama(String a) {
        nama = a;
    }

    public void setUmur(int a) {
        umur = a;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
