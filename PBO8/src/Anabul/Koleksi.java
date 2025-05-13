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
 * @param <T>
 */
public class Koleksi<T> {
    private int NbElemen; // Jumlah elemen dalam koleksi
    private T[] wadah;    // Array untuk menyimpan elemen-elemen koleksi

    // Constructor dengan kapasitas wadah yang lebih besar
    @SuppressWarnings("unchecked")
    public Koleksi() {
        this.NbElemen = 0; // Inisialisasi jumlah elemen menjadi 0
        this.wadah = (T[]) new Object[10]; // Inisialisasi array wadah dengan ukuran default 10
    }

    // Menambahkan elemen ke koleksi
    public void add(T isi) {
        if (NbElemen < wadah.length) {
            wadah[NbElemen] = isi;
            NbElemen++; // Meningkatkan jumlah elemen
        } else {
            System.out.println("Koleksi sudah penuh!");
        }
    }

    // Menghapus elemen dari koleksi
    public void delete(int index) {
        if (index >= 0 && index < NbElemen) {
            for (int i = index; i < NbElemen - 1; i++) {
                wadah[i] = wadah[i + 1]; // Menggeser elemen ke kiri
            }
            wadah[NbElemen - 1] = null;
            NbElemen--; // Mengurangi jumlah elemen
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    // Menampilkan semua elemen dalam koleksi
    public void showAll() {
        // Tampilkan nama, bunyi, dan gerakan masing-masing elemen tanpa loop pada proses input
        if (NbElemen > 0) {
            System.out.println("== Daftar Anabul dalam Koleksi ==");
            for (int i = 0; i < NbElemen; i++) {
                Anabul anabul = (Anabul) wadah[i];
                System.out.println("Nama: " + anabul.getNama());
                anabul.bersuara();
                anabul.gerak();
                System.out.println(); // Line break antar elemen
            }
        }
    }

    // Menyuarakan semua elemen dalam koleksi
    public void bersuarasemua() {
        if (NbElemen > 0) {
            for (int i = 0; i < NbElemen; i++) {
                Anabul anabul = (Anabul) wadah[i];
                anabul.bersuara();
            }
        }
    }
}

