/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method untuk merepresentasikan titik
 * Pembuat   : Gabriel Prakosa Ardhi - 24060123130094
 * Tanggal   : Selasa, 18 Februari 2025
 */

 public class Titik {
    /* States/Atribut */
    private double absis; 
    private double ordinat;     
    private static int counterTitik = 0; 

    /* Behavior/Method */
    /* Konstruktor untuk inisialisasi titik dengan absis dan ordinat tertentu */
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    /* Konstruktor default, membuat titik di koordinat (0,0) */
    public Titik() {
        this(0,0);
    }

    /* Mencetak jumlah titik yang telah dibuat */
    public void printCounterTitik() {
        System.out.println(Titik.counterTitik);
    }
    
    /* Mengembalikan nilai absis */
    public double getAbsis() {
        return absis;
    }

    /* Mengembalikan nilai ordinat */
    public double getOrdinat() {
        return ordinat;
    }

    /* Mengubah nilai absis */
    public void setAbsis(double x) {
        this.absis = x;
    }

    /* Mengubah nilai ordinat */
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    /* Menggeser titik sejauh x dan y */
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    /* Mengembalikan jumlah objek Titik yang telah dibuat */
    public static int getCounterTitik() {
        return counterTitik;
    }

    /* Menentukan kuadran tempat titik berada */
    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0; // Titik berada di sumbu atau di pusat
        }
    } 

    /* Mengembalikan jarak titik ke pusat koordinat (0,0) */
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    /* Mengembalikan jarak antara dua titik */
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    /* Merefleksikan titik terhadap sumbu X */
    public void setRefelksiX() {
        this.ordinat = this.ordinat * (-1);
    }

    /* Merefleksikan titik terhadap sumbu Y */
    public void setRefelksiY() {
        this.absis = this.absis * (-1);
    }

    /* Mengembalikan titik baru yang merupakan refleksi terhadap sumbu X */
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    /* Mengembalikan titik baru yang merupakan refleksi terhadap sumbu Y */
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    /* Mencetak koordinat titik */
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}