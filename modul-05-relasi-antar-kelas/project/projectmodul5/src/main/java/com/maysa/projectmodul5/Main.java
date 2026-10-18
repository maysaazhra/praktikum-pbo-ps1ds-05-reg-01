/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul5;
import com.maysa.projectmodul5.Guided2.komposisi.Komputer;
import com.maysa.projectmodul5.Guided2.agregasi.*;

public class Main {
    public static void main(String[] args) {
        runGuided2();
        runGuided3();
    }


    public static void runGuided1(){}

    public static void runGuided2(){
        Mahasiswa m1 = new Mahasiswa("103112400148", "Rendhi");
        Mahasiswa m2 = new Mahasiswa("103112400149", "John");

        Jurusan prodi = new Jurusan("SD","Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();

    }
    
    public static void runGuided3(){
        Komputer pc = new Komputer("Intel Core i5",3200,"LG 24 Inch","Logitech","Wireless");
        pc.displaySpecKomputer();
    }
}
    
