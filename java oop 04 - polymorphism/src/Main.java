public class Main {
    public static void main(String[] args) {
        // instansiasi / membuat object
        Manusia andi = new Manusia();

        Mahasiswa budi = new Mahasiswa();

        // set attribute
        andi.setNama("Andi");
        andi.setUmur(19);

        budi.setNama("Budi");
        budi.setNim("637583169");
        budi.setUmur(19);
        budi.setIpk(3.0f);

        System.out.println(">>> Overloading <<<");
        // menggunakan method belajar hasil overloading
        budi.belajar(); // tanpa parameter
        System.out.println(budi.getNama() + " memiliki IPK " + budi.getIpk());

        budi.belajar(5); // 1 parameter
        System.out.println(budi.getNama() + " memiliki IPK " + budi.getIpk());

        budi.belajar(4,"Clarissa");
        System.out.println(budi.getNama() + " memiliki IPK " + budi.getIpk());

        System.out.println("\n>>> Overriding <<<");
        // menggunakan overriding
        andi.rename("Saitama");
        budi.rename("All Mighty");






    }
}
