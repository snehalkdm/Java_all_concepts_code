public class CloningArray {
        public static void main(String args[]) {
            char c[] = {'a','b','c','d','e','f','g'};
            char d[] = c.clone();
            for (char i: c) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (char i: d) {
                System.out.print(i + " ");
            }
            System.out.print(c==d);
        }
}