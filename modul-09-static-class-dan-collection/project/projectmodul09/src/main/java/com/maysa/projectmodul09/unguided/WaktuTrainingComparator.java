/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maysa.projectmodul09.unguided;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<HasilEksperimen> {

    // Urutan: waktu training dari tercepat ke terlama
    @Override
    public int compare(HasilEksperimen e1, HasilEksperimen e2) {
        return Integer.compare(e1.getWaktuTraining(), e2.getWaktuTraining());
    }
}
