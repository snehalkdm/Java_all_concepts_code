public class StaticMethod {
    int i = 10;
    static String s = "Hi";
    static void change() {
        s = "Hello";
    }
    StaticMethod() {
        System.out.println(i+" "+s);
    }
    public static void main(String args[]) {
        StaticMethod.change();
        StaticMethod staticMethod = new StaticMethod();
    }
}
