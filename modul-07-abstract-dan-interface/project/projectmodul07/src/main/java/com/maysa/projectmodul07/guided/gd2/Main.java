/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul07.guided.gd2;

public class Main {
    public static void main(String[] args){
        Payable[] items = new Payable[2];
        
        items[0] = new Invoice("Monitor LED", 2, 1500000);
        items[1] = new SalariedEmployee("Budi", 5000000);
        
        // Dynamic dispatch = Java otomatis mengeksekusi rumus yang tepat sesuai objek
        for (Payable item : items){
            System.out.println("jumlah yang perlu dibayar: Rp" + item.getPaymentAmount());
        } 
    }
}
