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
 * Author: Gabriel Prakosa A
 */
public class MainKoleksiAnabul{
    public static void main(String[] args) {
        Koleksi<Anabul> KoleksiAnabul = new Koleksi<>();

        String[] namaKucing = {"Luna", "Simba", "Nala", "Leo"};
        String[] namaAnjing = {"Rocky", "Buster", "Max", "Buddy"};
        String[] namaBurung = {"Sky", "Cici", "Tweety", "Sunny"};

        // Menambahkan elemen ke dalam KoleksiAnabul tanpa loop
        KoleksiAnabul.add(new Kucing(namaKucing[0]));   // Luna
        KoleksiAnabul.add(new Anjing(namaAnjing[0]));   // Rocky
        KoleksiAnabul.add(new Burung(namaBurung[0]));   // Sky
        KoleksiAnabul.add(new Kucing(namaKucing[1]));   // Simba
        KoleksiAnabul.add(new Anjing(namaAnjing[1]));   // Buster
        KoleksiAnabul.add(new Burung(namaBurung[1]));   // Cici
        KoleksiAnabul.add(new Kucing(namaKucing[2]));   // Nala
        KoleksiAnabul.add(new Anjing(namaAnjing[2]));   // Max
        KoleksiAnabul.add(new Burung(namaBurung[2]));   // Tweety
        KoleksiAnabul.add(new Kucing(namaKucing[3]));   // Leo

        KoleksiAnabul.showAll(); // Menampilkan semua elemen dalam koleksi

        System.out.println("== Semua Anabul bersuara ==\n");
        KoleksiAnabul.bersuarasemua(); // Memanggil suara semua Anabul
    }
}

