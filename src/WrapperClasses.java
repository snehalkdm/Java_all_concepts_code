public class WrapperClasses {
    public static void main(String args[]) {
        boolean	a = true;
        char b = 'b';
        byte c = 4;
        short d = 5;
        int	e = 10;
        long f = 20;
        float g = 25.5f;
        double h = 30.3d;

        Boolean a1 = a;
        Character b1 = b;
        Byte c1 = c;
        Short d1 = d;
        Integer e1 = e;
        Long f1 = f;
        Float g1 = g;
        Double h1 = h;
        System.out.println("Autoboxing: " + a1 + ", " + b1 + ", " + c1 + ", " + d1 + ", " + e1 + ", " + f1 + ", " + g1 + ", " + h1);

        boolean a2 = a1;
        char b2 = b1;
        byte c2 = c1;
        short d2 = d1;
        int e2 = e1;
        long f2 = f1;
        float g2 = g1;
        double h2 = h1;
        System.out.println("Unboxing: " + a2 + ", " + b2 + ", " + c2 + ", " + d2 + ", " + e2 + ", " + f2 + ", " + g2 + ", " + h2);
    }
}