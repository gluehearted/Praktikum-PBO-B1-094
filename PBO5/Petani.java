// Nama : Gabriel Prakosa Ardhi
// NIM : 24060123130094
// Kelas : B

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia {
    private String asalkota;
    private static int counterPetani = 0;
    private int C = 0;
    
    // Konstruktor
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalkota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalkota = asalkota;
        counterPetani++;
    }
    
    // Selektor
    public String getAsalkota() { 
        return asalkota; 
    }

    // Mutator
    public void setasalkota(String asalkota) { 
        this.asalkota = asalkota; 
    }

    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + C;
    }

    public double hitungPajak() {
        return 0;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
}