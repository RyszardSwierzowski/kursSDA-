package generyki.generyki2;

import sun.security.krb5.internal.PAData;

public class Pair <T,S> {
    protected T a;
    protected S b;

    public Pair(T a, S b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }
    public S getB() {
        return b;
    }
    public void setB(S b) {
        this.b = b;
    }

    @Override
    public String toString(){
        return "["+this.a+","+this.b+"]";
    }
    public static void main(String[] args)

    {

        Pair nn = new Pair("s", 1);
        System.out.println(nn);
    }


}
