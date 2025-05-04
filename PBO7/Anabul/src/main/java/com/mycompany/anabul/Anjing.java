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
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing bergerak Melata Dengan empat kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara Guk-guk");
    }
}
