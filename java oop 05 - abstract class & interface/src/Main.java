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
    }
}
