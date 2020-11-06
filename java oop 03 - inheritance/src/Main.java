/**
 * parent class tidak dapat mengakses child class
 * child class dapat meengakses semua milik parent class
 * */

public class Main {
    public static void main(String[] args) {
        Manusia andi = new Manusia("Andi", 12);
        // memanggil method dari parent class Manusia
        andi.ulangTahun();

        System.out.println(andi.getUmur());

        Mahasiswa budi = new Mahasiswa("Budi", 20, "76524893470",3.5f); // float bisa dicasting (float) 3.5
        // memanggil method dari parent class Manusia
        // class child bisa mengakses method dari class parent
        budi.ulangTahun();
        budi.belajar();
        System.out.println(budi.getUmur());
        System.out.println(budi.getIpk());

        // membuat objeck Mahasiswa dan ditampung pada class Manusia
        Manusia saitama = new Mahasiswa("Saitama", 21,"58697990938",3.9f);
        saitama.ulangTahun();
        System.out.println(saitama.getUmur());
        // class parent tidak bisa mengakses method dari class child
        // saitama.belajar();

    }
}
