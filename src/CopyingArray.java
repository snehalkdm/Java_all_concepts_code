public class CopyingArray {
    public static void main(String args[]) {
        char c[] = {'a','b','c','d','e','f','g'};
        char d[] = new char[6];
        System.arraycopy(c, 1, d, 1, 5);
        System.out.println(String.valueOf(d));
    }
}