public class WalidacjaPesel {

        public static boolean isValidPesel (String pesel){
            char[] charPesel = pesel.toCharArray();
            int[] intPesel = new int[11];
            for (int i = 0; i < intPesel.length; i++){
                intPesel[i]=Character.getNumericValue(charPesel[i]);
            }
            int control = 1*intPesel[0]
                    + 3*intPesel[1]
                    + 7*intPesel[2]
                    + 9*intPesel[3]
                    + 1*intPesel[4]
                    + 3*intPesel[5]
                    + 7*intPesel[6]
                    + 9*intPesel[7]
                    + 1*intPesel[8]
                    + 3*intPesel[9]
                    + 1*intPesel[10];

            int resztaDzielenia = control%10;

            if (pesel.length()==11 && resztaDzielenia==0){
                return true;
            } else
               return  false;

        }
        public static String getGenderByPesel(String pesel){
            char[] charPesel = pesel.toCharArray();
            int[] intPesel = new int[11];
            for (int i = 0; i < intPesel.length; i++){
                intPesel[i]=Character.getNumericValue(charPesel[i]);
            }
            if (intPesel[9]%2==0){
                return "Kobieta";
            } else {
                return "Mężczyzna";
            }
        }
        public static void getDateBirth (String pesel){
            String birth = pesel.substring(0,6);
            char[] charBirth = birth.toCharArray();
            int[] intBirth = new int[6];
            for (int i = 0; i < intBirth.length;i++){
                intBirth[i]=Character.getNumericValue(charBirth[i]);
            }
            for (int i: intBirth){
                System.out.print(i);
            }
            System.out.println();
            int day = 10*intBirth[4]+ intBirth[5];
            int month = 10*intBirth[2]+intBirth[3];
            int year = 10*intBirth[0] + intBirth[1];

            if (month <= 12 && month>=01){
                System.out.println("Data uroddzenia: Rok: 19"+year + " " + month + " " + day);
            } else if (month <= 92 && month>=81){
                System.out.println("Data uroddzenia: Rok: 18"+year + " " + (month-80) + " " + day);
            } else if (month <= 32 && month>=21){
                System.out.println("Data uroddzenia: Rok: 20"+year + " " + (month-20) + " " + day);
            } else if (month <= 52 && month >=41){
                System.out.println("Data uroddzenia: Rok: 21"+year + " " + (month-40) + " " + day);
            } else if (month <= 72 && month >=61){
                System.out.println("Data uroddzenia: Rok: 22"+year + " " + (month-60) + " " + day);
            }

        }

    }

