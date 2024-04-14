public class StaticVariable {
/* //Counter without static Variable
    int c = 0;
    StaticVariable() {
        c++;
        System.out.println(c);
    }
    public static void main(String args[]){
        StaticVariable c1 = new StaticVariable();
        StaticVariable c2 = new StaticVariable();
        StaticVariable c3 = new StaticVariable();
    }
*/
    //Counter with static Variable
    static int count = 0;     //will get memory only once and retain its value
    StaticVariable() {
            count++;
            System.out.println(count);
        }
        public static void main(String args[]){
            StaticVariable c1 = new StaticVariable();
            StaticVariable c2 = new StaticVariable();
            StaticVariable c3 = new StaticVariable();
        }
}