/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul09.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // List dengan generics
        List<HasilEksperimen> daftar = new ArrayList<HasilEksperimen>();
        daftar.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        daftar.add(new HasilEksperimen("Random Forest", 0.91, 45));
        daftar.add(new HasilEksperimen("SVM", 0.87, 60));
        daftar.add(new HasilEksperimen("KNN", 0.79, 5));
        daftar.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen (static method)
        System.out.println("Jumlah eksperimen: " + HasilEksperimen.getJumlahEksperimen());

        // 2. Urut akurasi tertinggi (Comparable)
        System.out.println();
        System.out.println("Sorted by akurasi");
        Collections.sort(daftar);
        daftar.forEach(System.out::println);

        // 3. Urut waktu training tercepat (Comparator)
        System.out.println();
        System.out.println("Sorted by waktu training");
        Collections.sort(daftar, new WaktuTrainingComparator());
        daftar.forEach(System.out::println);

        // 4. Filtering akurasi minimal 0.85 (lambda)
        System.out.println();
        System.out.println("Model dengan akurasi minimal 0.85");
        List<HasilEksperimen> terfilter = daftar.stream()
                .filter(e -> e.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        terfilter.forEach(System.out::println);

        // 5. Pencarian model "KNN" (lambda), null jika tidak ditemukan
        System.out.println();
        System.out.println("Pencarian model KNN");
        HasilEksperimen hasilCari = daftar.stream()
                .filter(e -> e.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(hasilCari);
    }
}
