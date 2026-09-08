public class testPeminjaman {
    public static void main(String[] args) {
        peminjamanBuku peminjaman1 = new peminjamanBuku();
        peminjaman1.idTransaksi = 1111;
        peminjaman1.namaPeminjam = "Hariono";
        peminjaman1.judulBuku = "Metode gauss";
        //peminjaman1.jumlahHari=2; // non parameter

        System.out.println("TOTAL DENDA 0 HARI :"+ peminjaman1.hitungDenda(0));
        System.out.println("--------------");
                             peminjaman1.tampilkanData();

        System.out.println("===================================   ===============================");
        System.out.println("===================================   ===============================");

        peminjamanBuku peminjaman2 = new peminjamanBuku();
        peminjaman2.idTransaksi = 2222;
        peminjaman2.namaPeminjam = "Puji Astuti";
        peminjaman2.judulBuku = "Kewarganegaraan";

        System.out.println("TOTAL DENDA 3 HARI :" + peminjaman2.hitungDenda(3));
        System.out.println("---------------");
                             peminjaman2.tampilkanData();

        System.out.println("===================================   ===============================");
        System.out.println("===================================   ===============================");

        peminjamanBuku peminjaman3 = new peminjamanBuku();
        peminjaman3.idTransaksi = 3333;
        peminjaman3.namaPeminjam = "Sri wahyuni";
        peminjaman3.judulBuku = "Odyssey";

        System.out.println("TOTAL DENDA 10 HARI :"+ peminjaman3.hitungDenda(10));
        System.out.println("---------------");
                             peminjaman3.tampilkanData();

}

}

