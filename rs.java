class Pasien {
    String nama;
    double biaya;

    Pasien(String nama, double biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    void tampilkanInfo() {
        System.out.println("Nama Pasien : " + nama);
    }

    void tampilkanInfo(double biaya) {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Biaya Pemeriksaan : " + biaya);
    }
}

class PasienBPJS extends Pasien {
    String noBPJS;
    String kelas;

    PasienBPJS(String nama, double biaya, String noBPJS, String kelas) {
        super(nama, biaya);
        this.noBPJS = noBPJS;
        this.kelas = kelas;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Biaya Pemeriksaan : " + biaya);
        System.out.println("No BPJS : " + noBPJS);
        System.out.println("Kelas Perawatan : " + kelas);
    }
}

public class rs {
    public static void main(String[] args) {

        Pasien p1 = new Pasien("Andi", 250000);
        PasienBPJS p2 = new PasienBPJS("Budi", 150000, "BPJS12345", "Kelas 2");

        System.out.println("=== Pasien Umum ===");
        p1.tampilkanInfo();
        p1.tampilkanInfo(250000);

        System.out.println("\n=== Pasien BPJS ===");
        p2.tampilkanInfo();
    }
}