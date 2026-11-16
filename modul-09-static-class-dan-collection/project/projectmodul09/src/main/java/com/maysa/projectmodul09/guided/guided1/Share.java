/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul09.guided.guided1;

public class Share {
    private int privateInt;
    private static int staticInt;

    public Share(int pr, int si) {
        privateInt = pr;
        staticInt = si;
    }

    public String toString() {
        return privateInt + " " + staticInt;
    }
}
