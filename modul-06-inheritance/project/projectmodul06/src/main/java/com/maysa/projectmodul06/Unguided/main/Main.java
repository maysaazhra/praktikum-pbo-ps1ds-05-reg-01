/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul06.Unguided.main;

import com.maysa.projectmodul06.Unguided.model.ModelML;
import com.maysa.projectmodul06.Unguided.model.ModelRegresi;
import com.maysa.projectmodul06.Unguided.model.ModelKlasifikasi;
import com.maysa.projectmodul06.Unguided.model.ModelDeepLearning;

public class Main {
    public static void main(String[] args) {
        // Array bertipe kelas induk (polymorphism)
        ModelML[] daftarModel = {
            new ModelRegresi("Regresi Linier", 500, 4),
            new ModelKlasifikasi("Decision Tree", 800, 3),
            new ModelDeepLearning("Neural Network", 1000, 5, 3)
        };

        int totalBiaya = 0;
        for (ModelML model : daftarModel) {
            model.tampilkanInfo();
            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }
        System.out.println("Total biaya: " + totalBiaya);

        // Neural Network (indeks 2): hitungBiaya(int) milik ModelML, tidak di-override
        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));

        // Regresi Linier (indeks 0)
        System.out.println("Biaya 10 epoch (Regresi Linier): " + daftarModel[0].hitungBiaya(10));

        // Versi dua parameter hanya ada di ModelRegresi, sehingga perlu casting
        ModelRegresi regresi = (ModelRegresi) daftarModel[0];
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    }
}
