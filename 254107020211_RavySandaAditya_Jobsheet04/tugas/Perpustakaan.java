package tugas;

public class Perpustakaan {
    private String nama;
    // Pake array of object buat menyimpan kumpulan buku
    private Buku[] daftarBuku; 
    private int jumlahBuku;

    public Perpustakaan(String nama, int kapasitas) {
        this.nama = nama;
        this.daftarBuku = new Buku[kapasitas];
        this.jumlahBuku = 0;
    }

    // Ini contoh relasi Aggregation.
    // Alasannya karena objek Buku tidak dibikin (di-new) di dalam class Perpustakaan,
    // tapi cuma dilempar dari luar lewat parameter method ini. 
    // Jadi misal objek perpustakaan dihapus, data bukunya tetep aman di memori.
    public void tambahBuku(Buku b) {
        // Pengecekan biar array nggak kelebihan kapasitas dan bukunya nggak kosong (defensive)
        if (jumlahBuku < daftarBuku.length && b != null) {
            daftarBuku[jumlahBuku] = b;
            jumlahBuku++;
        } else {
            System.out.println("Kapasitas rak buku penuh!");
        }
    }

    public void tampilkanBuku() {
        System.out.println("\n=== Daftar Buku di Perpustakaan " + nama + " ===");
        // Looping sebanyak buku yang udah dimasukin aja
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].tampilkanInfo();
        }
        System.out.println("============================================\n");
    }
}