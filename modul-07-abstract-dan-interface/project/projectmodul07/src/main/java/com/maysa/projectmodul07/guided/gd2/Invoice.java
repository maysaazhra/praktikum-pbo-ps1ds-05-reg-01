/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul07.guided.gd2;

//Benda mati non pegawai, 
public class Invoice implements Payable{
    private String partName;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partName, int quantity, double pricePerItem){
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public String getPerName(){
        return partName;
    }
    
    //Hitung tagihan
    @Override
    public double getPaymentAmount(){
        return quantity * pricePerItem;
    }
    
}
