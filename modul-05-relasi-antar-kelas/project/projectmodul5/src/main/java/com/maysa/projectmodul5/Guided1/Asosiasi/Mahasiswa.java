/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul5.Guided1.Asosiasi;

public class Mahasiswa {

    private String nim;
    private String nama;
    private int nilai;
    
    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    //Getter
    public int getNilai(){
        return this.nilai;
    }
     
    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

}
