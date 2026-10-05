/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul03.Guided.Enkapsulasi;

public class KeywordBuku {

    private String pengarang;
    private String judul;

    private KeywordBuku() {
        this("Rumah Kita", "GoodBles");
// this ini digunakan untuk memanggil konstruktor yang
// menerima dua parameter
    }

    private KeywordBuku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    private void cetakKeLayar() {
        System.out.println("Judul : " + judul + " Pengarang : "
                + pengarang);
    }

    public static void main(String[] args) {
        KeywordBuku a, b;
        a = new KeywordBuku("Jurassic Park", "Michael Chricton");
        b = new KeywordBuku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
