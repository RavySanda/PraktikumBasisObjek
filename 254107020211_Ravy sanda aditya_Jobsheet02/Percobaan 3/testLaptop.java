public class testLaptop {
    public static void main(String[] args) {
        laptop lab1 = new laptop();
        lab1.kodeInventaris = "LAB-JTI-017";
        lab1.merk = "Lenovo ThinkPad E14";
        lab1.ramGB = 8;
       
        System.out.println("RAM setelah upgrade : " 
                           + lab1.upgradeRam(8) + " GB");
                          
        
        System.out.println("HARGA SEWA 2 HARI :" 
                           + lab1.hitungHargaSewa(2));
                             lab1.tampilSpesifikasi();

    }
}