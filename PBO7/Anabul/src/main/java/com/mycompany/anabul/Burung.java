/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Nama : Gabriel Prakosa Ardhi
* NIM : 24060123130094
* Kelas : B
*/
package com.mycompany.anabul;

/**
 *
 * @author Gabriel Prakosa A
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Burung bergerak Terbang dengan sayap");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung bersuara Cuit");
    }
}
