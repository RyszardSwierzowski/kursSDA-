

public class DzienTygodnia
{

    public static void main(String[] args) {
        System.out.println(jakiDzienZaIleDni(DniTygodnia.CZW,1));
    }

    private static DniTygodnia jakiDzienZaIleDni(DniTygodnia obecnyDzien,int zaIleDni){
        return DniTygodnia.fromNumber(zaIleDni%7);
    }



}
