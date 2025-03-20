// Nama : Gabriel Prakosa Ardhi
// NIM : 24060123130094
// Kelas : B

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;
    private int B = 9;
    
    // Konstruktor
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    // Selektor
    public String getNpwp() { 
        return npwp; 
    }

    // Mutator
    public void setNpwp(String npwp) { 
        this.npwp = npwp; 
    }

    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + B;
    }

    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}