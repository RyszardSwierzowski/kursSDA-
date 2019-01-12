package zapychaczeCzasu;

public class WalidacjaHasla {
    public static boolean validateNewPassword(String password) {
        char[] tab = password.toCharArray();


        // DŁUGOŚĆ HASŁA POWYŻEJ 8 ZNAKÓW
        if (!isStringLongerThen8(password))
            return false;

        if(isPassHaveCorrectChars(tab) && isPassHaveCorrectChars(tab) && isPasswordHave2Numbers(tab) && isPassHaveSpecialChar(tab) && isPassHAveBigLetter(tab))
            return true;
        return false;
    }

    private static boolean isStringLongerThen8(String password) {
        if (password.length() < 8)
            return false;
        return true;

    }

    public static boolean isPasswordHave2Numbers(char[] pass) {
        int liczbaCyfr = 0;
        for (int i = 0; i < pass.length; i++) {
            if (pass[i] >= 48 && pass[i] <= 57)
                liczbaCyfr++;
        }
        return liczbaCyfr >= 2;
    }

    public static boolean isPassHaveCorrectChars(char[] pass) {
        for (int i = 0; i < pass.length; i++) {
            if (!(pass[i] == 33 ||
                    pass[i] == 64 ||
                    (pass[i] >= 35 && pass[i] <= 37) ||
                    (pass[i] >= 48 && pass[i] <= 57) ||
                    (pass[i] >= 65 && pass[i] <= 90) ||
                    (pass[i] >= 97 && pass[i] <= 122))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPassHAveBigLetter(char[] pass) {
        for (int i = 0; i < pass.length; i++)
            if (pass[i] >= 65 && pass[i] <= 90) {
                return true;
            }
        return false;
    }

    public static boolean isPassHaveSpecialChar(char[] pass) {
        for (int i = 0; i < pass.length; i++) {
            if (pass[i] == 33 || pass[i] == 64 || (pass[i] >= 35 && pass[i] <= 37))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validateNewPassword("AAAA!@#$%QQQQ11!"));


    }


}



