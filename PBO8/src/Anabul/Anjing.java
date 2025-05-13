/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anabul;
/*
Nama : Gabriel Prakosa Ardhi
NIM : 24060123130094
*/
/**
 *
 * @author Gabriel Prakosa A
 */
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama); // Memanggil konstruktor Anabul untuk menyetel nama
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Anjing : Guk-guk");
    }

    @Override
    public void gerak() {
        System.out.println("Anjing sedang melata.");
    }
}
