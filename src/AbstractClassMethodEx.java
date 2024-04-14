abstract class Shape {
    Shape() { System.out.println("I've different Shapes"); }
    abstract void draw();
    void color() { System.out.println("Color is Red"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing Rectangle"); }
}

class Triangle extends Shape {
    void draw() { System.out.println("Drawing Triangle"); }
}

public class AbstractClassMethodEx {
    public static void main(String args[]) {
        Shape shape = new Rectangle();
        shape.color();
        shape.draw();
        Shape shape1 = new Triangle();
        shape1.draw();
    }
}