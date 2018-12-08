public class BiednyCamelCase {
    public static void main(String[] args) {
        String str = "Jak to jest z biedbym camelcasem ???";
        System.out.println(poorCamelCase(str));
    }


    public static String poorCamelCase(String str) {
        char[] strArray = str.toCharArray();

        String poorCamelCase = "";
        int licznik = 0;

        for (int i = 0; i < str.length(); i++) {

            if ((strArray[i] >= 65 && strArray[i] <= 90) || (strArray[i] >= 97 && strArray[i] <= 122)) {
                if (licznik % 2 == 0) {
                    poorCamelCase = poorCamelCase + String.valueOf(strArray[i]).toUpperCase();
                    licznik++;
                } else {
                    poorCamelCase = poorCamelCase + String.valueOf(strArray[i]).toLowerCase();
                    licznik++;
                }
            } else {
                poorCamelCase = poorCamelCase + strArray[i];
            }
        }
        return poorCamelCase;
    }


}
