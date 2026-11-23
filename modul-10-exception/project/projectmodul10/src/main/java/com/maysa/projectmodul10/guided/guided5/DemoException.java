/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul10.guided.guided5;

public class DemoException {

    public static void main(String[] args) {
        Coba c = new Coba();

        try {
            c.tampil();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println("Program selesai");
        }
    }
}
