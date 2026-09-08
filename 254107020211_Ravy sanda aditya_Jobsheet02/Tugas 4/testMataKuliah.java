public class testMataKuliah {
    public static void main(String[] args) {
        mataKuliah mk1 = new mataKuliah();
        mk1.kodeMk = "TI211";
        mk1.namaMk = "Praktikum Pemrograman Berbasis Objek";
        mk1.sks = 2;
        mk1.nilaiAngka = 3.5;
        mk1.tampilkanData();

        System.out.println("-----------------------------------");

        mataKuliah mk2 = new mataKuliah();
        mk2.kodeMk = "TI212";
        mk2.namaMk = "Basis Data Lanjut";
        mk2.sks = 3;
        mk2.nilaiAngka = 4.0;
        mk2.tampilkanData();

        System.out.println("-----------------------------------");

        mataKuliah mk3 = new mataKuliah();
        mk3.kodeMk = "TI213";
        mk3.namaMk = "Pemrograman Web";
        mk3.sks = 3;
        mk3.nilaiAngka = 3.0;
        mk3.tampilkanData();

        System.out.println("===================================");
        
        double totalBobot = mk1.hitungBobotNilai() + mk2.hitungBobotNilai() + mk3.hitungBobotNilai();
        System.out.println("Total Bobot Nilai (Ketiga MK) : " 
        + mk1.hitungBobotNilai() + " + "
        + mk2.hitungBobotNilai() + " + "
        + mk3.hitungBobotNilai() + " = "
        + totalBobot);
    }
}