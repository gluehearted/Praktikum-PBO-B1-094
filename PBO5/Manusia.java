// Nama : Gabriel Prakosa Ardhi
// NIM : 24060123130094
// Kelas : B

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Manusia {
    // Atribut
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    // Konstruktor
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
      
    // Selektor
    public String getNama() { 
        return nama; 
    }
    
    public LocalDate getTglMulaiKerja() { 
        return tglMulaiKerja; 
    }
    
    public String getAlamat() { 
        return alamat; 
    }
    
    public double getPendapatan() { 
        return pendapatan; 
    }

    // Mutator
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) { 
        this.tglMulaiKerja = tglMulaiKerja; 
    }

    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }

    public void setPendapatan(double pendapatan) { 
        this.pendapatan = pendapatan; 
    }
    
    // Fungsi Lainnya
    public abstract int hitungMasaKerja();
    
    public void cetakInfo() {
        System.out.println("Nama      : " + nama);
        System.out.println("Alamat    : " + alamat);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.printf("Pendapatan: %.2f\n", pendapatan);
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
}
