import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("=== SISTEM MANAJEMEN KONTAINER ===");
        System.out.println("Nama Pemilik Kontainer : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal     : " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        System.out.println("Berat Muatan Saat Ini  : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");

        boolean jalan = true;

        while (jalan) {
            System.out.println("Pilih Aksi:");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Bongkar/Turunkan Muatan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("\nMasukkan berat muatan baru yang ingin ditambahkan (kg): ");
                int beratTambah = input.nextInt();
                kontainerAlfa.tambahMuatan(beratTambah);
                System.out.println("-> Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");
                
            } else if (pilihan == 2) {
                System.out.print("\nMasukkan berat barang yang ingin dibongkar/diturunkan (kg): ");
                int beratTurun = input.nextInt();
                kontainerAlfa.turunkanMuatan(beratTurun);
                System.out.println("-> Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");
                
            } else if (pilihan == 3) {
                System.out.println("\nMenutup program...");
                jalan = false;
                
            } else {
                System.out.println("\nPilihan tidak valid, silakan coba lagi.\n");
            }
        }

        input.close();
    }
}