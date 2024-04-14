class Bank {
    void getInterest() {
        System.out.println(0);
    }
}
class SBI extends Bank {
    void getInterest() {
        System.out.println(2);
    }
}
class Axis extends Bank {
    void getInterest() {
        System.out.println(1);
    }
}
class BOI extends Bank {
    void getInterest() {
        System.out.println(4);
    }
}
public class MethodOverridingEx {
    public static void main(String args[]) {
        SBI sbi = new SBI();
        Axis axis = new Axis();
        BOI boi = new BOI();
        sbi.getInterest();
        axis.getInterest();
        boi.getInterest();
    }
}
