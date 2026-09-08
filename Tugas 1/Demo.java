public class Demo {
    public static void main(String[] args) {

        // Mobil
        Mobil mobil = new Mobil();

        mobil.setMerek("Toyota");
        mobil.setTahun(2022);

        System.out.println("=== MOBIL ===");
        mobil.nyalakanMobil();
        mobil.matikanMobil();
        mobil.cetakInformasi();

        System.out.println();

        // MobilSport
        MobilSport mobilSport = new MobilSport();

        mobilSport.setMerek("Mazda 3");
        mobilSport.setTahun(2023);
        mobilSport.setTipe("Hathback");
        mobilSport.setJumlahPintu(2);

        System.out.println("=== MOBIL SPORT ===");
        mobilSport.nyalakanMobil();
        mobilSport.matikanMobil();
        mobilSport.tambahKecepatan();
        mobilSport.aktifkanModeSport();
        mobilSport.cetakInformasi();

        System.out.println();

        // Jeep
        Jeep jeep = new Jeep();

        jeep.setMerek("daihatsu");
        jeep.setTahun(1994);
        jeep.setWarna("Hitam");
        jeep.setKapasitasPenumpang(5);

        System.out.println("=== JEEP ===");
        jeep.nyalakanMobil();
        jeep.matikanMobil();
        jeep.aktifkan4WD();
        jeep.matikan4WD();
        jeep.cetakInformasi();

        System.out.println();

        // KipasAngin
        KipasAngin kipas = new KipasAngin();

        kipas.setMerek("Miyako");
        kipas.setKecepatan(3);

        System.out.println("=== KIPAS ANGIN ===");
        kipas.nyalakanKipas();
        kipas.matikanKipas();
        kipas.cetakInformasi();

        System.out.println();

        // RiceCooker
        RiceCooker riceCooker = new RiceCooker();

        riceCooker.setMerek("Cosmos");
        riceCooker.setKapasitas(2);

        System.out.println("=== RICE COOKER ===");
        riceCooker.memasakNasi();
        riceCooker.menghangatkanNasi();
        riceCooker.cetakInformasi();
    }
}