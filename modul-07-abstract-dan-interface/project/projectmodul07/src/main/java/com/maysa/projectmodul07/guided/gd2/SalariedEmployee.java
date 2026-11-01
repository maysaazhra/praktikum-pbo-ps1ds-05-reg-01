/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul07.guided.gd2;

//Bentuk konkret: perannya jelas sebagai pegawai dengan skema gaji tetap
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    public SalariedEmployee(String name, double weeklySalary){
        super(name); 
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings(){
        return weeklySalary;
    }
    
}
