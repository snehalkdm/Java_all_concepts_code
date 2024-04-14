interface Printable {
    void print();
    default void msg() { System.out.println("It's a default method"); }
    static int cube(int x) { return x*x*x; }
}

interface Showable {
    void print();
    void draw();
}

class New implements Printable, Showable {
    public void print() { System.out.println("Printing"); }
    public void draw() { System.out.println("Drawing"); }
}

public class MultipleInheritance implements Printable, Showable{
    public void print() { System.out.println("Printing Implemented Multiple Inheritance in Java"); }
    public void draw() { System.out.println("Drawing Implemented Multiple Inheritance in Java"); }
    public static void main(String args[]) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.print();
        multipleInheritance.msg();
        New n = new New();
        n.print();
        n.draw();
        System.out.println(Printable.cube(10));
    }
}