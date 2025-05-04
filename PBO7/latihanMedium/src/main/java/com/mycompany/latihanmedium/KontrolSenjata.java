/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Nama : Gabriel Prakosa Ardhi
* NIM : 24060123130094
* Kelas : B
*/
package com.mycompany.latihanmedium;

/**
 *
 * @author Gabriel Prakosa A
 */
public class KontrolSenjata {
    private final Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    
    public int isiPeluru(int jumPeluru){
        int total = senjata.getPeluru() + jumPeluru;
        senjata.setPeluru(total);
        System.out.println("Peluru berhasil ditambah " + jumPeluru);
        return total;
    }
    
    public int menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        return senjata.getPeluru();
    }

    public void menusuk(){
        if (senjata.isMenusuk()){
            System.out.println("Aku tusuk nih");
        } else {
            System.out.println("Aduh tumpul, gabisa tusuk");
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}
