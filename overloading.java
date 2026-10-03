class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    float tambah(float a, float b) {
        return a + b;
    }
}

class overloading {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println(k.tambah(2, 3));       
        System.out.println(k.tambah(2, 3, 4));    
        System.out.println(k.tambah(2.5f, 3.5f));   
    }
}