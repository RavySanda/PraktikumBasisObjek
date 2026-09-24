public class RiceCooker {
    private String merek;
    private int kapasitas;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void memasakNasi() {
        System.out.println("Rice cooker sedang memasak nasi.");
    }

    public void menghangatkanNasi() {
        System.out.println("Rice cooker sedang menghangatkan nasi.");
    }

    public void cetakInformasi() {
        System.out.println("Merek     : " + merek);
        System.out.println("Kapasitas : " + kapasitas + " liter");
    }
}