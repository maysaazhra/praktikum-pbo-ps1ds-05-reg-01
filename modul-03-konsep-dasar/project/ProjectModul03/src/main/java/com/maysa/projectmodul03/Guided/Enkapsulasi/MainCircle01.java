/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul03.Guided.Enkapsulasi;

public class MainCircle01 {
    public static void main(String[] args) {

        Circle01 lingkaran = new Circle01();

        lingkaran.r = 7;

        System.out.println("Jari-jari : " + lingkaran.r);
        System.out.println("Luas      : " + lingkaran.area());
        System.out.println("Keliling  : " + lingkaran.circumference());

        double radian = 3.14159;
        System.out.println("Radian    : " + radian);
        System.out.println("Derajat   : " + Circle01.radiansToDegrees(radian));
    }
}

