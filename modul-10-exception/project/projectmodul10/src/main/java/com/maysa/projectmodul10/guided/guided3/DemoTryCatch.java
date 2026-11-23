/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul10.guided.guided3;

public class DemoTryCatch {

    public static void main(String[] args) {
        try {
            int[] arr = new int[1];

            System.out.println(arr[1]);
            System.out.println("Baris tidak pernah dieksekusi");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: Handle exception
            System.out.println("Terjadi eksepsi karena indeks tidak valid");
        }
        System.out.println("Program selesai");
    }
}

