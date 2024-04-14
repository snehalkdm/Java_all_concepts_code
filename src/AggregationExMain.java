public class AggregationExMain {
    int j;
    String str;
    AggregationEx aggregationEx;

    AggregationExMain(int j, String str, AggregationEx aggregationEx) {
        this.j = j;
        this.str = str;
        this.aggregationEx = aggregationEx;
    }

    void display() {
        System.out.println(j + " " + str + " " + aggregationEx.i + " " + aggregationEx.s);
    }

    public static void main(String args[]) {
        AggregationEx aggregationE = new AggregationEx(20, "Hello");
        AggregationExMain aggregationExMain = new AggregationExMain(10, "Hi", aggregationE);
        aggregationExMain.display();
    }
}