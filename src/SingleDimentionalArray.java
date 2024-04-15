public class SingleDimentionalArray {
    public static void main(String args[]) {
        int a[] = {6,5,3,2};
        int b[] = {7,3,2};
        for (int i = 0; i < a.length; i++) {                    //for loop
            System.out.println(a[i]);
        }
        for(int i: b) {                                         //for-each loop
            System.out.println(i);
        }
    }
}