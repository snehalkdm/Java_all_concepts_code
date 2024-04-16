public class MultiplicationMatrices {
        public static void main(String args[]) {
            int arrA[][] = {{2,3,4}, {5,6,7}, {8,9,1}};
            int arrB[][] = {{2,3,4}, {5,6,7}, {8,9,1}};
            int arrC[][] = new int[3][3];

            for (int i = 0; i < arrA.length; i++) {
                for (int j = 0; j < arrB.length; j++) {
                    for (int k = 0; k < arrB.length; k++) {
                        arrC[i][j] += arrA[i][k] * arrB[k][j];
                    }
                    System.out.print(arrC[i][j] + " ");
                }
                System.out.println();
            }
        }
}