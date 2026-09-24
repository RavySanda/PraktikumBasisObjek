public class MobilSport extends Mobil {
    private String tipe;
    private int jumlahPintu;

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void tambahKecepatan() {
        System.out.println("Kecepatan mobil sport bertambah.");
    }

    public void aktifkanModeSport() {
        System.out.println("Mode sport diaktifkan.");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("tipe : " + tipe);
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}