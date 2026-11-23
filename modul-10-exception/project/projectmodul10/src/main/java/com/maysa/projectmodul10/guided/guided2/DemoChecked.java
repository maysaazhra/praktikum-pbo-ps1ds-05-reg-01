/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul10.guided.guided2;

import java.io.FileReader;
import java.io.IOException;

public class DemoChecked {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("file berhasil dibuka");
        } catch (IOException e) {
            System.out.println("terjadi eksepsi");
        }

        System.out.println("Program selesai");
    }
}
