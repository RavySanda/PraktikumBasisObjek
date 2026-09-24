package percobaan6;
public class MainPercobaan6 {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("thinkpad");
        Printer printer = new Printer("epson L3110");
        laptop.cetakDokumen(printer, "Laporan.pdf");
    }
}