public class laptop {
    public String kodeInventaris;
    public String merk;
    public int ramGB;
    public int jumlahHari;

    public void tampilSpesifikasi() {
        System.out.println("Kode Inventaris : " + kodeInventaris);
        System.out.println("Merk            : " + merk);
        System.out.println("RAM             : " + ramGB + " GB");
    }

    public int upgradeRam(int tambahanGB) {
        ramGB = ramGB + tambahanGB;
        return ramGB;
    }

    public int hitungHargaSewa(int jumlahHari) {
        int tarif = 25000;
        return jumlahHari * tarif;
    }
}