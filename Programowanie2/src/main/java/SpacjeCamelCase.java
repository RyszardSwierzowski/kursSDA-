public class SpacjeCamelCase
{
    public static void main(String[] args) {
        String input="Dzis jest cos a jutro nic nie ma ";

        System.out.println(spaceCamelCase(input));;
    }

    private static String spaceCamelCase(String str){
        String result="";
        char[] strArray=str.toCharArray();
        char znak;
        boolean isFirst=true;

        for( int i=0;i<str.length();i++)
        {
            znak=strArray[i];

            if((znak >= 65 && znak <= 90) || (znak >= 97 && znak <= 122))
            {
                if(isFirst){
                    isFirst=false;
                    result+=String.valueOf(znak).toUpperCase();
                }else
                    result+=String.valueOf(znak).toLowerCase();
            }
            else
            {
                isFirst=true;
            }
        }

    return result;
    }
}
