public class Mobil {
    private String merek;
    private int tahun;
    

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void nyalakanMobil() {
        System.out.println("Mobil dinyalakan.");
    }

    public void matikanMobil() {
        System.out.println("Mobil dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("Merek : " + merek);
        System.out.println("Tahun : " + tahun);
    }
}