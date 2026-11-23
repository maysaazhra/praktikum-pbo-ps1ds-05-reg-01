/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul10.guided.guided6;

public class DemoFinally {
    
    public static void main(String[] args) {
        int x = 3;
        int[] arr = {10,11,12};
        
        try {
            System.out.println(arr[x]);
            System.out.println("Tidak ada exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Ada exception");
        } finally{
            System.out.println("Program selesai");
        }
    }
}
