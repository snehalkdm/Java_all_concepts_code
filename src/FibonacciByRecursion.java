public class FibonacciByRecursion {
    static int n1 = 0, n2 = 1, n3 = 0;
    static void calculateFibonacci(int num) {
        if(num > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            calculateFibonacci(num - 1);
        }
    }

    public static void main(String args[]) {
        int n = 20;
        if(n == 1) { System.out.println(n1); }
        else if(n == 2) { System.out.println(n1 + " " + n2); }
        else {
            System.out.print(n1 + " " + n2);
            calculateFibonacci(n - 2);
        }
    }
}