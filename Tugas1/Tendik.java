public class Tendik extends Pegawai {
    private String BidangKerja;

    /* Konstruktor */
    public Tendik(String NIP, String Nama, String TglLahir, String TMT, double GajiPokok, String BidangKerja) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok);
        this.BidangKerja = BidangKerja;
    }

    /* Selektor */
    public String getBidangKerja() {
        return BidangKerja;
    }

    /* Mutator */
    public void setBidangKerja(String BidangKerja) {
        this.BidangKerja = BidangKerja;
    }

    public double hitungTunjangan() {
        return 0.01 * GajiPokok * hitungMasaKerja()[0]; // Hanya hitung tahun
    }

    @Override
    public String hitungBUP() {
        return super.hitungBUP(55); // Tendik pensiun di usia 55 tahun
    }

    @Override
    public void printInfo() {
        super.printInfo();
        int[] masaKerja = hitungMasaKerja();
        System.out.println("Jabatan     : Tendik");
        System.out.println("Bidang Kerja: " + BidangKerja);
        System.out.println("BUP         : " + hitungBUP());
        System.out.println("Tunjangan   : 1% x " + masaKerja[0] + " x Rp " + 
                            String.format("%,.2f", GajiPokok) + " = Rp " + 
                            String.format("%,.2f", hitungTunjangan()));
    }
}
