class Nenek {
    private String rahasia = "Uang Simpanan Nenek";

    // Getter supaya bisa diakses
    public String getRahasia() {
        return rahasia;
    }
}

class Ayah extends Nenek {
    public void cobaAkses() {
        System.out.println("Ayah akses lewat getter: " + getRahasia());
    }
}

public class MainPrivate {
    public static void main(String[] args) {
        Ayah ayah = new Ayah();
        ayah.cobaAkses();
    }
}