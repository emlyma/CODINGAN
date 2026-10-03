abstract class Transportasi {
    abstract double hitungBiaya(double jarak, int penumpang);
}

class Bus extends Transportasi {
    @Override
    double hitungBiaya(double jarak, int penumpang) {
        return jarak * 2000 + penumpang * 5000;
    }
}

class Kereta extends Transportasi {
    @Override
    double hitungBiaya(double jarak, int penumpang) {
        return jarak * 3000 + penumpang * 8000;
    }
}

public class Nilai {
    public static void main(String[] args) {
        Transportasi bus = new Bus();
        Transportasi kereta = new Kereta();

        System.out.println("Biaya Bus: " + bus.hitungBiaya(10, 5));
        System.out.println("Biaya Kereta: " + kereta.hitungBiaya(10, 5));
    }
}