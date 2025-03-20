// Nama : Gabriel Prakosa Ardhi
// NIM : 24060123130094
// Kelas : B

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;
    private int A = 4;
    
    // Konstruktor
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor
    public String getNip() { 
        return nip; 
    }

    // Mutator
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + A;
    }

    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
}

