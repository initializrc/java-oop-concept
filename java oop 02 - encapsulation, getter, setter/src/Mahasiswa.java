public class Mahasiswa {
    // attribute
    private String nama; // private hanya bisa di akses oleh class nya sendiri
    private String jurusan;
    private String nim;
    private float ipk;

    // constructor tanpa parameter (default)
    public Mahasiswa() {
        nim = "";
        jurusan = "";
        nim = "";
        ipk = 0;
    }

    // constructor dengan parameter
    public Mahasiswa(String nama, String jurusan, String nim, float ipk) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.nim = nim;
        this.ipk = ipk;
    }

    // method baru
    void belajar (float jam){
        // ipk = ipk + (jam/50);
        // sama saja
        ipk += (jam/50);
    }

    public static void tambahMahasiswa(){
        jumlah++;
    }

    // cara mengakses attribute yang private dengan menggunakan getter and setter
    // getter mendapatkan value dari attribute class mahasiswa
    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getNim() {
        return nim;
    }

    public float getIpk() {
        return ipk;
    }

    // setter untuk mengubah value attibute dari class mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    // variable constant / konstanta
    // variabel yang tidak akan bisa di ubah valuenya
    // menggunakan final
    final double constant = 10;

    // static adalah penanda bahwa attibute tersebut milik dari sebuah class
    // static variabel
    static int jumlah;

    // gabungan
    final static double phi = 3.14;


}
