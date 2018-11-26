package figury;


public class Punkt
{
    private int x;
    private int y;

    public Punkt() {
        x=0;
        y=0;
        //System.out.println("Konstruktor bezparametrowy klasy Punkt");
    }
    public Punkt(int x,int y) {
        this.x=x;
        this.y=y;
       // System.out.println("Konstruktor klasy Punkt2D");
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public String getType(){
        return "Punkt";
    }

    public void wypiszX(){
        System.out.println("Wartość x wynosi: "+this.x);
    }
    public void wypiszY(){
        System.out.println("Wartość y wynosi: "+this.y);
    }

}
