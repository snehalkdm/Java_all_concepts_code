public class ParamConstructorOverloadingEx {
    int i;
    String s;
    ParamConstructorOverloadingEx(int i, String s) {
        this.i = i;
        this.s = s;
        System.out.println(i + " " + s);
    }

    ParamConstructorOverloadingEx(int i, String s, float f) {
        System.out.println(i + " " + s + " " + f);
    }

    ParamConstructorOverloadingEx(ParamConstructorOverloadingEx p) {        //Copy Constructor
        System.out.println(p.i + " " + p.s);
    }

    public static void main(String args[]) {
        ParamConstructorOverloadingEx paramConstructorOverloadingEx = new ParamConstructorOverloadingEx(10, "Hi");
        ParamConstructorOverloadingEx paramConstructorOverloadingE = new ParamConstructorOverloadingEx(20, "Hello", 1);
        ParamConstructorOverloadingEx paramConstructorOverloadingEx1 = new ParamConstructorOverloadingEx(paramConstructorOverloadingEx);    //Copy Constructor
    }
}