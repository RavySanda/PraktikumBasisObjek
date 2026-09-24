package tugas;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek Perpustakaan dengan kapasitas maksimal 5 buku.
        Perpustakaan perpus = new Perpustakaan("Pusat Polinema", 5);
        
        // 2. Membuat instansiasi objek Buku secara terpisah (di luar class Perpustakaan).
        Buku buku1 = new Buku("Dasar Pemrograman Java", "Pak Budi");
        Buku buku2 = new Buku("Desain UI/UX", "Bu Alice");
        Buku buku3 = new Buku("Manajemen Basis Data", "Pak Santoso");
        
        // 3. Implementasi AGGREGATION: Objek Buku yang telah dibuat di luar
        // dimasukkan (di-inject) ke dalam Perpustakaan melalui pemanggilan method.
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);
        perpus.tambahBuku(buku3);
        
        perpus.tampilkanBuku();
        
        // 4. Implementasi COMPOSITION: Saat instansiasi objek Anggota baru, 
        // objek KartuAnggota secara otomatis diciptakan di dalam constructor-nya.
        Anggota anggota1 = new Anggota("Andi", "A-2026-001");
        anggota1.tampilkanInfo();
        
        // 5. Implementasi DEPENDENCY: Objek Anggota menggunakan objek Buku (Uses-A) 
        // yang dikirimkan hanya sebagai parameter method, bukan disimpan sebagai atribut tetap.
        anggota1.bacaBuku(buku1);
        anggota1.bacaBuku(buku2);
    }
}