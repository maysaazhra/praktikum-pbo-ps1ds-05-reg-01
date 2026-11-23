/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul10.guided.guided4;

public class DemoMultipleCatch {

    public static void main(String[] args) {
        try {
            int x = 3;
            int y = 100 / x;

            int[] arr = {10, 11};
            y = arr[x];

            System.out.println("Tidak ada eksepsi");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception karena gabisa dibagi dgn 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception karena indeks tidak valid");
        }
    }
}

