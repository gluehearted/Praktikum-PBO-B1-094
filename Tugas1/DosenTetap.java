public class DosenTetap extends Dosen {
    private String NIDN;

    /* Konstruktor */
    public DosenTetap(String NIP, String Nama, String TglLahir, String TMT, double GajiPokok,
                      String Fakultas, String NIDN) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    /* Selektor */
    public String getNIDN() {
        return NIDN;
    }

    /* Mutator */
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        int[] masaKerja = hitungMasaKerja();
        return 0.02 * masaKerja[0] * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        int[] masaKerja = hitungMasaKerja();
        System.out.println("NIDN        : " + NIDN);
        System.out.println("Jabatan     : Dosen Tetap");
        System.out.println("BUP         : " + hitungBUP());
        System.out.println("Tunjangan   : 2% x " + masaKerja[0] + " x Rp " + 
                            String.format("%,.2f", getGajiPokok()) + " = Rp " + 
                            String.format("%,.2f", hitungTunjangan()));
    }

}
