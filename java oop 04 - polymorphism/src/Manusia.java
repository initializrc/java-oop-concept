/**
 * Polymorphism "many forms"
 *
 *  1. Overloading : method dengan nama yang sama namun memiliki behaviour yang berbeda.
 *     perbedaan tersebut meliputi (jumlah parameter, tipe data parameter, urutan parameter)
 *
 *  2. Overriding :  kita mengubah behaviour dari method parent class dengan behaviour child class yang baru.
 * */

public class Manusia {
    protected String nama ; // attribute
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // method ini akan dioverride oleh class Mahasiswa
    public void rename(String nama){
        System.out.println(this.nama + " berganti nama menjadi " + nama);
        this.nama = nama;
    }
}
