class AB {
    final void run() { System.out.println("Running"); }
    final int a;
    AB() {
        a = 10;                                //blank final variable can be initialized in the constructor only
        System.out.println(a);
    }
    final static int b;
    static {
        b = 20;                                //blank final variable can be static also which will be initialized in the static block only
        System.out.println(b);
    }
}

public class FinalKeywordEx extends AB{
    public static void main(String args[]) {
        new AB().run();                        //final method can be inherited, but can't be overridden
    }
}