public class CallByValue {
    int i = 10, j = 10;

    void change(int i) { i = i + 100; }         //changes will be in the local variable only

    void change(CallByValue callByValue1) { callByValue1.j = callByValue1.j + 100; }    //changes will be in the instance variable

    public static void main(String args[]) {

        CallByValue callByValue = new CallByValue();
        System.out.println("Before change: " + callByValue.i);
        callByValue.change(20);
        System.out.println("After change: " + callByValue.i);

        CallByValue callByValue1 = new CallByValue();
        System.out.println("Before change: " + callByValue1.j);
        callByValue.change(callByValue1);
        System.out.println("After change: " + callByValue1.j);
    }
}