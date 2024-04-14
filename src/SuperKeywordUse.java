class Animal {
    String color = "white";
    void eat() { System.out.println("Eating "); }
    Animal() { System.out.println("Animal calling"); }
}

class Cat extends Animal {
    String color = "brown";
    void checkColor() {
        System.out.println(color);
        System.out.println(super.color);        //used to refer immediate parent class instance variable
    }

    void eat() { System.out.println("Eating milk"); }
    void bark() { System.out.println("Meow"); }
    void checkActivity() {
        super.eat();                            //used to invoke parent class method
        bark();
    }

    Cat() {
        super();                                //used to invoke parent class constructor, if we remove this super() then it got added in each class constructor automatically by compiler
        System.out.println("Cat calling");
    }
}

public class SuperKeywordUse {
    public static void main(String args[]) {
        Cat cat = new Cat();
        cat.checkColor();
        cat.checkActivity();
    }
}
