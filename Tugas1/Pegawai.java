import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    /* Atribut */
    protected String NIP, Nama, TglLahir, TMT;
    protected double GajiPokok;

    /* Konstruktor */
    public Pegawai(String NIP, String Nama, String TglLahir, String TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TglLahir = TglLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    /* Selektor */
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public String getTglLahir() {
        return TglLahir;
    }

    public String getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return GajiPokok;
    }

    /* Mutator */
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setTglLahir(String TglLahir) {
        this.TglLahir = TglLahir;
    }

    public void setTMT(String TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(double GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    // Metode untuk menghitung masa kerja dalam tahun dan bulan
    public int[] hitungMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate tmtDate = LocalDate.parse(TMT, formatter);
        LocalDate today = LocalDate.now();
    
        int tahun = today.getYear() - tmtDate.getYear();
        int bulan = today.getMonthValue() - tmtDate.getMonthValue();
    
        if (bulan < 0) {
            tahun--;
            bulan += 12;
        }
    
        return new int[]{tahun, bulan};
    }

    // Metode default untuk menghitung BUP (pensiun di usia 65 tahun)
    public String hitungBUP() {
        return hitungBUP(65); // Default 65 tahun
    }

    // Overload: Menghitung BUP berdasarkan usia tertentu
    public String hitungBUP(int usiaPensiun) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate birthDate = LocalDate.parse(TglLahir, formatter);
        LocalDate bupDate = birthDate.plusYears(usiaPensiun).withDayOfMonth(1).plusMonths(1);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return bupDate.format(outputFormatter);
    }

    public void printInfo() {
        int[] masaKerja = hitungMasaKerja();
        System.out.println("NIP         : " + NIP);
        System.out.println("Nama        : " + Nama);
        System.out.println("Tgl Lahir   : " + TglLahir);
        System.out.println("TMT         : " + TMT);
        System.out.println("Masa Kerja  : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Gaji Pokok  : Rp " + String.format("%,.2f", GajiPokok));
    }
}
