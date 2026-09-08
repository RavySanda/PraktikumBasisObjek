public class KipasAngin {
    private String merek;
    private int kecepatan;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void nyalakanKipas() {
        System.out.println("Kipas angin dinyalakan.");
    }

    public void matikanKipas() {
        System.out.println("Kipas angin dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("Merek      : " + merek);
        System.out.println("Kecepatan  : " + kecepatan);
    }
}