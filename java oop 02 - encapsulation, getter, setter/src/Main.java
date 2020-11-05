public class Main {

    public static void main(String[] args) {
        /**
         *  Encapsulation
         *  akan error jika mengakses langsung ke variabel yang access modifier nya private
         *  solusi 1 : dapat diakses dengan menggunakan getter and setter
         *  solusi 2 : dengan menggubah jenis access modifiers variabel menjadi public atau no access modifiers
         * */

        // membuat object menggunakan constructor tanpa parameter
        Mahasiswa andi =  new Mahasiswa();
        System.out.println("Nama : " + andi.getNama());
        System.out.println("Jurusan : " + andi.getJurusan());
        System.out.println("NIM : " + andi.getNim());
        System.out.println("IPK : " + andi.getIpk());

        // memanggil method belajar
        andi. belajar((float) 150);
        System.out.println("IPK : " + andi.getIpk());

        // membuat object menggunakan constructor dengan parameter
        Mahasiswa  budi = new Mahasiswa("Budi", "Kedokteran", "12356232",(float) 3.4);
        System.out.println("\nNama : " + budi.getNama());
        System.out.println("Jurusan : " + budi.getJurusan());
        System.out.println("NIM : " + budi.getNim());
        System.out.println("IPK : " + budi.getIpk());

        // memanggil static variabel
        // static ialah milik class
        // dapat memanggil atau mengubah value melalui class maupun object
        System.out.println("\nStatic");
        Mahasiswa.jumlah = 10;
        System.out.println(Mahasiswa.jumlah);
        System.out.println(andi.jumlah);
        System.out.println(budi.jumlah);

        andi.jumlah = 20;
        System.out.println(Mahasiswa.jumlah);
        System.out.println(andi.jumlah);
        System.out.println(budi.jumlah);

        // memanggil static method tambahMahasiswa();
        Mahasiswa.tambahMahasiswa();
        System.out.println(Mahasiswa.jumlah);
    }
}
