class Nenek {
    protected String warisan = "Tanah Warisan";
}

class Anak extends Nenek {
    public void akses() {
        // ✅ bisa langsung
        System.out.println("Anak akses protected: " + warisan);
    }
}

public class MainProtected {
    public static void main(String[] args) {
        Anak a = new Anak();
        a.akses();
    }
}