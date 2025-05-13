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
public abstract class Anabul {
    private String nama;

    // Constructor
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    public void gerak() {
        // Default gerakan, bisa didefinisikan lebih lanjut di subclass
    }

    public void bersuara() {
        // Default suara, bisa didefinisikan lebih lanjut di subclass
    }
}
