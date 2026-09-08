public class testRuangKelas {
    public static void main(String[] args) {
        ruangKelas kelas = new ruangKelas();
        kelas.kodeRuang = "RT 02";
        kelas.namaGedung = "AK";
        kelas.kapasitas = 40 ;
        kelas.jumlahMahasiswa= 30;

        System.out.println("--------------");
                             kelas.tampilkanData();
    
}
}