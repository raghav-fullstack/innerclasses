package nonstaticinner;

public class Outer {

    private static int x=50;
    private int y;

    public Outer(int y) {
        this.y = y;
    }

    void f1(){
        System.out.println("F1-Outer: Non Static Method of the Outer Class. ");
    }

    class Inner{
        private int y;

        public Inner(int y) {
            this.y = y;
        }

        void f1(){
            System.out.println("F1-Inner: Usage of Static & Non-Static members of Outer class ");
            System.out.println("Outer Classes Static variable :"+Outer.x);
            System.out.println("Outer Classes Non-Static variable :"+Outer.this.y);
            System.out.println("Inner Classes Static variable :"+this.y);
        }
    }

    public static void main(String[] args) {

        Outer outer = new Outer(80);
        outer.f1();
        Outer.Inner inner = outer.new Inner(40);
        inner.f1();

    }
}
