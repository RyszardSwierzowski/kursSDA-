package figury;

import figury.Punkt;

public class Punkt3D extends Punkt
{
    private int z ;

    public Punkt3D() {
        super(0,0);
        z=0;
        //System.out.println("to jest konstruktor bezparametrowy klasy figury.Punkt3D");
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public void wypiszZ(){
        System.out.println("Wartość z wynosi: "+this.z);
    }

    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public String getType(){
        return "Punkt3D";
    }
}
