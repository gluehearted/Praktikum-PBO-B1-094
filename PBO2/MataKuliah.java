public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int SKS;

    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.SKS = 000;
    }

    MataKuliah(String idMatKul, String nama, int SKS) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.SKS = SKS;
    }

    String getidMatKulMataKuliah() {
        return this.idMatKul;
    }

    String getNamaMataKuliah() {
        return this.nama;
    }

    int getSKSMahasiswa() {
        return this.SKS;
    }

    public void setidMatKulMataKuliah(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNamaMataKuliah(String nama) {
        this.nama = nama;
    }
    
    public void setSKSMahasiswa(int SKS) {
        this.SKS = SKS;
    }
}
