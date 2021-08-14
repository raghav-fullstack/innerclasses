package staticinner;

public class Outer {
    static void f1() {
        System.out.println("Outers static method.");
    }

    public static void main(String[] args) {

        Outer.f1();

        Outer.Inner.f2();

        Outer.Inner innerObj = new Outer.Inner();
        innerObj.f3();

        Outer outer = new Outer();

        outer.f4();

        //Object of inner class without Outer class reference
        Inner obj = new Inner();
        obj.f3();
    }

    void f4() {
        System.out.println("Inside the outer class.");
    }

    static class Inner {
        static void f2() {
            System.out.println("Inner Static Method.");
        }

        void f3() {
            System.out.println("F3 : Non Static Method Inside the Inner Class.");
        }
    }
}
