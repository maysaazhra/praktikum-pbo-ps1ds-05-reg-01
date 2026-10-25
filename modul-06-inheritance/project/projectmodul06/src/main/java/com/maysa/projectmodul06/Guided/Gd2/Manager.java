/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul06.Guided.Gd2;

public class Manager extends Employee {
    private String alamat;
    
    public Manager(String nama, String alamat){
        super(nama);
        this.alamat = alamat;
    }
    
    public void tampilInformasi(){
        super.tampilNama();
        System.out.println("alamat: " + alamat);
        System.out.println("departemen: " + super.departemen);
    }
    
}
