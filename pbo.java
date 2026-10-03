class Mahasiswa {
    String nama;
    int umur;

    Mahasiswa(String n, int u) {
        nama = n;
        umur = u;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class pbo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Adit", 20);
        m1.tampil();
    }
}