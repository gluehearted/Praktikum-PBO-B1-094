/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Nama : Gabriel Prakosa Ardhi
* NIM : 24060123130094
* Kelas : B
*/
package com.mycompany.anabul;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Prakosa A
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Contoh dengan Generik ===");

        Datum<Anabul> wadahHewan = new Datum<>();
        ContohMetodeGenerik metode = new ContohMetodeGenerik();

        wadahHewan.setIsi(new Kucing("Milo"));
        metode.fungsi(wadahHewan).gerak();
        metode.fungsi(wadahHewan).bersuara();

        wadahHewan.setIsi(new Burung("Rio"));
        metode.fungsi(wadahHewan).gerak();
        metode.fungsi(wadahHewan).bersuara();

        wadahHewan.setIsi(new Anjing("Bruno"));
        metode.fungsi(wadahHewan).gerak();
        metode.fungsi(wadahHewan).bersuara();

        System.out.println("\n=== Contoh tanpa Generik ===");

        ArrayList<Anabul> daftarHewan = new ArrayList<>();
        daftarHewan.add(new Burung("Tweety"));
        daftarHewan.add(new Anjing("Rex"));
        daftarHewan.add(new Kucing("Garfield"));

        for (Anabul hewan : daftarHewan) {
            hewan.bersuara();
            hewan.gerak();
            System.out.println("---");
        }
    }
}

