/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul03.Guided.Enkapsulasi;

public class Method {
    int i, j;

    Method(int a, int b) {
        i = a;
        j = b;
    }

    // passed by value dengan parameter tipe data primitif
    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    // passed by reference dengan parameter berupa tipe data class
    void calculate(Method e) {
        e.i = e.i * 10;
        e.j = e.j / 2;
    }
}
