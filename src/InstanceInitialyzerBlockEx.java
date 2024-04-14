class Parent {
    Parent() { System.out.println("Parent class calling"); }
}

class Child extends Parent{
    Child() { System.out.println("Child class calling"); }
    Child(int a) { System.out.println("Child class calling with param " + a); }
    { System.out.println("Instance Initializer Block calling"); }
}

public class InstanceInitialyzerBlockEx {
    public static void main(String args[]) {
        new Child();
        new Child(10);
    }
}