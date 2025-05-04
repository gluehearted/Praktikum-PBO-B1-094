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
public class ContohMetodeGenerik {
    public <G extends Anabul> G fungsi (Datum<G> d) {
        return d.getIsi();
    }
}
