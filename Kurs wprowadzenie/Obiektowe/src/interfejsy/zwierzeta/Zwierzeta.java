package interfejsy.zwierzeta;

public class Zwierzeta {
    public static void main(String... a){
        Pies pies = new Pies();
        Kot kot = new Kot();
        Papuga papuga = new Papuga();
        Rybka rybka = new Rybka();

        TresowanyZwierzak[] tab = {pies,kot,papuga,rybka};

        for(TresowanyZwierzak i:tab)
        {
            System.out.println(i.dajGlos());
//            if( i instanceof Pies){
//                System.out.println("Pies robi :"+((Pies) i).dajGlos());
//            }else if( i instanceof Kot){
//                System.out.println("Kot robi :"+((Kot) i).dajGlos());
//            }else if( i instanceof Papuga){
//                System.out.println("Papuga robi :"+((Papuga) i).dajGlos());
//            }
        }
        System.out.println();


//        for(int i=0;i<tab.length;i++){
//            System.out.print("Pod indeksem "+i+" jest obiekt typu " );
//            if( tab[i] instanceof Pies){
//                System.out.println("Pies i robi   : "+((Pies) tab[i]).dajGlos());
//            }else if( tab[i] instanceof Kot){
//                System.out.println("Kot i robi    : "+((Kot) tab[i]).dajGlos());
//            }else if( tab[i] instanceof Papuga){
//                System.out.println("Papuga i robi : "+((Papuga) tab[i]).dajGlos());
//            }
//        }


    }
}
