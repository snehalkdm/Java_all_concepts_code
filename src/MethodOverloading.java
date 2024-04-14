public class MethodOverloading {
    void sum(int i, int j) {
        System.out.println(i+j);
    }
    void sum(int i, int j, int k) {     //By changing number of arguments
        System.out.println(i+j+k);
    }

    void sum(double i, double j) {
        System.out.println(i+j);        //By changing the data type
    }

    public static void main(String args[]) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.sum(10,10);
        methodOverloading.sum(10,10, 10);
        methodOverloading.sum(10.1,10.1);
    }
}
