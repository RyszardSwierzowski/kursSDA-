public enum DniTygodnia {
    PN(1),
    WT(2),
    SR(3),
    CZW(4),
    PT(5),
    SB(6),
    ND(7);
    private int dzien;
     DniTygodnia(int dzien){
        this.dzien=dzien;
    }
    public static DniTygodnia fromNumber(int i){
         for(DniTygodnia x: DniTygodnia.values()){
             if(i==x.dzien){
                 return x;
             }
         }return null;
    }
}
