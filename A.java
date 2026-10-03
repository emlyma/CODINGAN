class B {
    private int x = 10;

    void tampil() {
        System.out.println(x); // bisa
    }
}

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.tampil();
    }
}