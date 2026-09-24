package tugas;

public class Anggota {
    private String nama;
    private KartuAnggota kartu; // HAS-A

    public Anggota(String nama, String noKartu) {
        this.nama = nama;
        
        // Ini bukti relasi Composition.
        // Alasannya karena objek KartuAnggota langsung dibikin (di-new) di dalem constructor Anggota.
        // Jadi misal data Anggota-nya dihapus, kartu anggotanya juga otomatis ikut musnah.
        this.kartu = new KartuAnggota(noKartu);
    }

    // ini contoh relasi Dependency.
    // Alasannya karena objek Buku cuma numpang lewat sebagai parameter aja (cuma dipake sementara),
    // tidak disimpan jadi variabel atau atribut tetap di class Anggota.
    public void bacaBuku(Buku b) {
        // Dicek dulu bukunya ada atau tidak (null check) biar programnya tidak crash waktu dijalanin
        if (b != null) {
            System.out.println(nama + " sedang membaca buku: " + b.getJudul());
        }
    }

    public void tampilkanInfo() {
        System.out.println("Anggota: " + nama + " | No. Kartu: " + kartu.getNoKartu());
    }
}