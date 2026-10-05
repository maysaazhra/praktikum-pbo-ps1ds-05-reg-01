/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul03.Unguided;

public class PengolahSuhu {

    private double[] suhuHarian; //kurung siku buat array, biasanya ada isinya dan isinya lebih dari satu//
    private static final double NILAI_KOSONG = -1.0; 

    public PengolahSuhu(double[] suhuHarian) { //constructor:ciri'nya namanya sama dengan nama class
        this.suhuHarian = suhuHarian; //untuk membuat objek suhu harian
    }

    public void tampilkanData() { //procedure, tidak akan mengembalikan nilai 
        //perulangan
        for (int i = 0; i < suhuHarian.length; i++) { //jika i<jumlah suhuharian, maka perulangan berhenti 

            if (suhuHarian[i] == NILAI_KOSONG) { 
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println(
                    "Hari " + (i + 1) + " : " + suhuHarian[i] + "\u00B0C"
                );
            }
        }
    }

    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {

            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }

        return -1;
    }

    public void isiDataKosong() { //isinya index yang kosong, dengan memangggil index kosong
        int indexKosong = cariIndexKosong();

        if (indexKosong != -1) {

            suhuHarian[indexKosong] =
                (suhuHarian[indexKosong - 1]
                + suhuHarian[indexKosong + 1]) / 2;
        }
    }

    public double hitungRataRata() {
        double total = 0;

        for (double suhu : suhuHarian) {
            total += suhu;
        }

        return total / suhuHarian.length; //total data suhu harian
    }
}

