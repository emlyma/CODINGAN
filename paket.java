// Superclass
class Pengiriman {
    String namaPengirim;
    double berat;

    Pengiriman(String namaPengirim, double berat) {
        this.namaPengirim = namaPengirim;
        this.berat = berat;
    }

    // Method Overloading
    void tampilkanInfo() {
        System.out.println("Nama Pengirim : " + namaPengirim);
    }

    void tampilkanInfo(double berat) {
        System.out.println("Nama Pengirim : " + namaPengirim);
        System.out.println("Berat Barang : " + berat + " kg");
    }
}

// Subclass
class PengirimanExpress extends Pengiriman {
    double biayaTambahan;
    int estimasiHari;

    PengirimanExpress(String namaPengirim, double berat, double biayaTambahan, int estimasiHari) {
        super(namaPengirim, berat);
        this.biayaTambahan = biayaTambahan;
        this.estimasiHari = estimasiHari;
    }

    // Method Overriding
    @Override
    void tampilkanInfo() {
        System.out.println("Nama Pengirim : " + namaPengirim);
        System.out.println("Berat Barang : " + berat + " kg");
        System.out.println("Biaya Tambahan : " + biayaTambahan);
        System.out.println("Estimasi Pengiriman : " + estimasiHari + " hari");
    }
}

// Main Class
public class paket {
    public static void main(String[] args) {

        Pengiriman pg1 = new Pengiriman("Sinta", 5);
        PengirimanExpress pg2 = new PengirimanExpress("Rina", 3, 20000, 1);

        System.out.println("=== Pengiriman Reguler ===");
        pg1.tampilkanInfo();
        pg1.tampilkanInfo(5);

        System.out.println("\n=== Pengiriman Express ===");
        pg2.tampilkanInfo();
    }
}