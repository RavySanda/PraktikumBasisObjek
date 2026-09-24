public class testBuku {
    
    public static void main(String[] args) {
        buku buku1 = new buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        buku1.tahunTerbit = 2021;
    
        buku buku2 = new buku();
        buku2.isbn = "978-903-04-1234-5";
        buku2.judul = "Pemrograman Java ";
        buku2.penulis = "Sri wahyuni";
        buku2.penerbit = "Informatika";
        buku2.tahunTerbit = 2023;

        buku buku3 = new buku();
        buku3.isbn = "978-979-29-2019-9";
        buku3.judul = "Algoritma ";
        buku3.penulis = "abdu jaelani";
        buku3.penerbit = "Andi Offset";
        buku3.tahunTerbit = 2022;

        buku1.tampilInfoBuku();
        System.out.println("----------------------------");
        buku2.tampilInfoBuku();
        System.out.println("----------------------------");
        buku3.tampilInfoBuku();
        }
    }


