public class Mahasiswa {

    private String nama;
    private String jurusan;
    private String nim;
    private float ipk;

    // constructor tanpa parameter (default)
    public Mahasiswa() {
    }

    // constructor dengan parameter
    public Mahasiswa(String nama, String jurusan, String nim, float ipk) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.nim = nim;
        this.ipk = ipk;
    }

    public static void main(String[] args) {
        System.out.println("<<< Mahasiswa >>>");

        System.out.println("Instansiasi Objek Menggunakan Constructor Default"); // membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Saitama";
        mahasiswa1.jurusan = "Teknik Pertambangan";
        mahasiswa1.nim = "12345678";
        mahasiswa1.ipk = (float) 3.5;
        System.out.println("Nama : " + mahasiswa1.nama);
        System.out.println("Jurusan : " + mahasiswa1.jurusan);
        System.out.println("NIM : " + mahasiswa1.nim);
        System.out.println("IPK : " + mahasiswa1.ipk);

        System.out.println("\nInstansiasi Objek Menggunakan Constructor Dengan Parameter");
        Mahasiswa mahasiswa2 = new Mahasiswa("All Mighty", "Kedokteran", "87654321", (float) 3.9);
        System.out.println("Nama : " + mahasiswa2.nama);
        System.out.println("Jurusan : " + mahasiswa2.jurusan);
        System.out.println("NIM : " + mahasiswa2.nim);
        System.out.println("IPK : " + mahasiswa2.ipk);
    }
}
