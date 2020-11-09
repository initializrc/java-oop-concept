public class Main {
    public static void main(String[] args) {
        // error akan terjadi jika dibuat object dari abstract class

        // buat object dari class turunannya
        Cat cat = new Cat();

        // panggil method yang sudah dioverride dari abstract method
        cat.makeNoise();

        // membuat object Wolf dan ditampung di abstract class
        Animal obj = new Wolf();
        obj.makeNoise();

        System.out.println();

        // tidak bisa membuat object dari interface, sehingga
        // membuat object harus lewat subclass (class implementasinya)
        // InterfaceSample interfaceSample = new Interface(); // tidak bisa

        // membuat object dari class yang implement interface
        RealClassInterface obj2 = new RealClassInterface();
        obj2.interfaceMethod();

        // pada interface setiap variabel harus di deklarasi
        // dan auto bersifat public static final
        // karena static, variabel number bisa langsung dipanggil dari class ataupun objectnya
        System.out.println(RealClassInterface.number);
        System.out.println(obj2.number);

        // karena final, variabel number tidak dapat diganti nilainya, jika di ganti akan error
        // RealClassInterface.number = 50;
        // obj2.number = 50;
    }
}
