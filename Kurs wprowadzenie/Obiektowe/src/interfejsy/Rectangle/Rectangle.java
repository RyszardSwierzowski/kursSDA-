package interfejsy.Rectangle;

public class Rectangle extends Figura{
    private int a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return this.a*this.b;
    }

    @Override
    double getPermiter() {
        return 2*(this.a+this.b);
    }


}
