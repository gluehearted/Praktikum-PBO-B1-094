public class DosenTamu extends Dosen {
    private String NIDK;
    private int kontrakBulan;

    /* Konstruktor */
    public DosenTamu(String NIP, String Nama, String TglLahir, String TMT, double GajiPokok,
                     String Fakultas, String NIDK, int kontrakBulan) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.kontrakBulan = kontrakBulan;
    }

    /* Selektor */
    public String getNIDK() {
        return NIDK;
    }

    public int getKontrakBulan() {
        return kontrakBulan;
    }

    /*  Mutator */
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setKontrakBulan(int kontrakBulan) {
        this.kontrakBulan = kontrakBulan;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK        : " + NIDK);
        System.out.println("Jabatan     : Dosen Tamu");
        System.out.println("Masa Kontrak: " + kontrakBulan + " bulan");
        System.out.println("Tunjangan   : 2,5% x Rp " + String.format("%,.2f", getGajiPokok()) + 
                            " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }    
}
