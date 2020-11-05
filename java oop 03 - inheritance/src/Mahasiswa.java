public class Mahasiswa extends Manusia{

    private String nim;
    private float ipk;

    public Mahasiswa(int umur, String nama, String nim, float ipk) {
        super(nama, umur); // super untuk akses constructor di class parent
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}
