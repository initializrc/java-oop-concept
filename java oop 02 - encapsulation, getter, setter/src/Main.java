public class Main {

    public static void main(String[] args) {
        // membuat object menggunakan constructor tanpa parameter
        Mahasiswa andi =  new Mahasiswa();
        System.out.println("Nama : " + andi.getNama());
        System.out.println("Jurusan : " + andi.getJurusan());
        System.out.println("NIM : " + andi.getNim());
        System.out.println("IPK : " + andi.getIpk());

        // membuat object menggunakan constructor dengan parameter
        Mahasiswa  budi = new Mahasiswa("Budi", "Kedokteran", "12356232",(float) 3.4);
        System.out.println("\nNama : " + budi.getNama());
        System.out.println("Jurusan : " + budi.getJurusan());
        System.out.println("NIM : " + budi.getNim());
        System.out.println("IPK : " + budi.getIpk());
    }
}
