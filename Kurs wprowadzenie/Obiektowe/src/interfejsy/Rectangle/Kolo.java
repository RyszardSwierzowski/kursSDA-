package interfejsy.Rectangle;

public class Kolo extends Figura {
   private int r;

    public Kolo(int r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return  (2*Math.PI*r);
    }

    @Override
    double getPermiter() {
        return Math.PI*r*r;
    }
}
