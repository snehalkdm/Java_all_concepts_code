public class InheritanceEx {
    void eat() {
        System.out.println("Eat");
    }
}
class A extends InheritanceEx {     //Single Inheritance
    void sleep() {
        System.out.println("Sleep");
    }
}

class B extends A {     //Multilevel Inheritance
    void hardWork() {
        System.out.println("Do HardWork");
    }
}

class C extends InheritanceEx {     //Hierarchical Inheritance
    void patience() {
        System.out.println("Have patience");
    }
}

class Result {
    public static void main(String args[]) {
        A a = new A();
        a.sleep();
        a.eat();
        B b = new B();
        b.hardWork();
        b.eat();
        b.sleep();
        C c = new C();
        c.patience();
        c.eat();
    }
}