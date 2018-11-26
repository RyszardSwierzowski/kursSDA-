package klasyAbstrakcyjne;

public class Figury {

    public static boolean czyKwadrat(Prostokat ob){
        if(ob instanceof Kwadrat){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean czyProstokat(Prostokat ob){
        if(ob instanceof Prostokat){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Prostokat prostokat1 = new Prostokat(15,4);
        Kwadrat kwadrat1=new Kwadrat(3);

        System.out.println(prostokat1.obliczPole());

        System.out.println(kwadrat1.obliczPole());


        //System.out.println(czyKwadrat(kwadrat1));
        System.out.println("prostokąt jest kwadratem : "+czyKwadrat(prostokat1));

        System.out.println("kwadrat jest prostokątem : "+czyProstokat(kwadrat1));
        //System.out.println(czyProstokat(prostokat1));




    }
}
