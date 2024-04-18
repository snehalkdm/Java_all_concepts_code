public class FactorialByRecursion {
    static int calculateFactorial(int num) {
        if(num == 0 || num == 1) { return num; }
        else { return num * calculateFactorial(num-1); }
    }

    public static void main(String args[]) {
        System.out.println("Factorial is: " + calculateFactorial(6));
    }
}