/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul04.Guided.main;

import com.maysa.projectmodul04.Guided.manusia.Manusia;

public class DemoManusia {

    public static void main(String[] args) {

        Manusia arrMns[] = new Manusia[3];

        // Constructor pertama
        Manusia objMns1 = new Manusia();

        // Constructor kedua
        Manusia objMns2 = new Manusia("John");

        // Constructor ketiga
        Manusia objMns3 = new Manusia("Bajuri", 44);

        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nama: " + arrMns[i].getNama());
            System.out.println("Umur: " + arrMns[i].getUmur());
        }
    }
}
