public class BagiKelompokTC {
    public static void main(String[] args) {
        System.out.println("awal program");

        int jumlahMahasiswa = 32;
        int jumlahKelompok = 0;
        int anggotaPerKelompok = 0;
        buku buku1 = new buku();
        buku1.judul = "Pemrograman Java";

        try {
            anggotaPerKelompok = jumlahMahasiswa / jumlahKelompok;
        } catch (ArithmeticException e) {
            System.out.println("jumlah kelompok tidak boleh nol");
        }

        // try { kasus error harusnya angka tpi memasukkan teks
   // int angka = Integer.parseInt("abc");
    //} catch (NumberFormatException e) {
    //System.out.println("Input harus berupa angka");
    //}

    // try {
    //int[] angka = {10, 20, 30};
    //System.out.println(angka[5]);
    //} catch (ArrayIndexOutOfBoundsException e) {
    //System.out.println("Index tidak tersedia");
    //}

        System.out.println(anggotaPerKelompok);
        System.out.println("akhir program");
    }
}