public class MatricesAddition {
    public static void main(String args[]) {
        int arrA[][] = {{2,3,4}, {5,6,7}};
        int arrB[][] = {{2,3,4}, {5,6,7}};
        int arrC[][] = new int[2][3];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < 3; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
                System.out.print(arrC[i][j] + " ");
            }
            System.out.println();
        }
    }
}