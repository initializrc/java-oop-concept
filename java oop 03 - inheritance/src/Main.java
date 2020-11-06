import java.util.ArrayList;

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

        // tidak dapat membuat object parent class (Manusia) dan tampung di child class (Mahasiswa)
        // Mahasiswa allMighty = new Manusia("All Mighty", 20);

        // ArrayList dari class
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
        listMahasiswa.add(budi);
        listMahasiswa.add(new Mahasiswa("All Mighty", 20, "444658769", 3.92f));

        System.out.println(budi); // hanya print alamat stack
        System.out.println(budi.getNama()); // print nama saja
        // print satu data
        System.out.println("Nama : " + budi.getNama() + " " +
                           "Umur : " + budi.getUmur() + " " +
                           "NIM : " + budi.getNim() + " " +
                           "IPK : " + budi.getIpk());

        System.out.println("\n" + listMahasiswa.get(1)); // hanya print alamat stack
        System.out.println(listMahasiswa.get(1).getNama()); // print nama saja
        // print satu data
        System.out.println("Nama : " + listMahasiswa.get(1).getNama() + " " +
                           "Umur : " + listMahasiswa.get(1).getUmur() + " " +
                           "NIM : " + listMahasiswa.get(1).getNim() + " " +
                           "IPK : " + listMahasiswa.get(1).getIpk());

        System.out.println();

        // print semua data menggunakan for ada dua cara
        // cara 1
        System.out.println();
        for (int i = 0; i < listMahasiswa.size(); i++){
            System.out.println(listMahasiswa.get(i).getNama() + " " +
                               listMahasiswa.get(i).getUmur() + " " +
                               listMahasiswa.get(i).getNim() + " " +
                               listMahasiswa.get(i).getIpk()) ;
        }

        // cara 2
        System.out.println("\nPrint Seluruh Data ArrayList");
        for (Mahasiswa mahasiswa : listMahasiswa){
            System.out.println("Nama : " + mahasiswa.getNama() + " " +
                               "Umur : " + mahasiswa.getUmur() + " " +
                               "NIM : " + mahasiswa.getNim() + " " +
                               "IPK : " + mahasiswa.getIpk());
        }
    }
}
