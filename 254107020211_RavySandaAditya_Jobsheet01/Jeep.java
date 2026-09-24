public class Jeep extends Mobil {
    private String warna;
    private int kapasitasPenumpang;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public void aktifkan4WD() {
        System.out.println("4WD diaktifkan.");
    }

    public void matikan4WD() {
        System.out.println("4WD dimatikan.");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Warna                : " + warna);
        System.out.println("Kapasitas Penumpang  : " + kapasitasPenumpang);
    }
}