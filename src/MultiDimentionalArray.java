public class MultiDimentionalArray {
    public static void main(String args[]) {
        int a[][] = {{5,2,1}, {7,6,5}, {8,7,6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}