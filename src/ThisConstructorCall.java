public class ThisConstructorCall {
    ThisConstructorCall() {
        System.out.println("Hi");
    }
    ThisConstructorCall(int i) {
        this();
        System.out.println(i);
    }
    public static void main(String args[]) {
        new ThisConstructorCall(10);
    }
}
