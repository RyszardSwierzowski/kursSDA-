package KolkoIKrzyzyk;


import java.util.Scanner;

public class KolkoIKrzyzyk {
    static char[][] plansza = new char[3][3];
    static char[][] planszaTest = new char[3][3];


    public static void wykonajRuch(Gracz gracz, int poleX, int poleY, char[][] plansza) {


        if (plansza[poleX][poleY] == '*') {
            plansza[poleX][poleY] = gracz.znacznik;
        } else {
            throw new RuntimeException("Pole jest zajęte");
        }

    }

    public static void generujPlansze(char[][] plansza) {
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + plansza[i][0] + " | " + plansza[i][1] + " | " + plansza[i][2] + " |");
        }
    }

    public static boolean isWinner(Gracz gracz, char[][] plansza) {

        // spr pionowo
        for (int i = 0; i < 3; i++) {
            if (plansza[0][i] == plansza[1][i] && plansza[2][i] == plansza[0][i] && plansza[0][i] == gracz.znacznik) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (plansza[i][0] == plansza[i][1] && plansza[i][2] == plansza[0][i] && plansza[0][i] == gracz.znacznik) {
                return true;
            }
        }
        if (plansza[0][0] == plansza[1][1] && plansza[2][2] == plansza[1][1] && plansza[1][1] == gracz.znacznik) {
            return true;
        }
        if (plansza[2][0] == plansza[1][1] && plansza[2][0] == plansza[1][1] && plansza[1][1] == gracz.znacznik) {
            return true;
        }
        return false;
        // spr poziom
        //spr ukosnie
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                plansza[i][j] = '*';
            }
        }
        Gracz gracz1 = new Gracz('X');
        Gracz gracz2 = new Gracz('O');


//        wykonajRuch(gracz1,1,2,plansza);
//        generujPlansze(plansza);
        int max = 9;
        int x;
        int y;
        while (max > 0) {
            System.out.println("GRACZ 1");
            System.out.print(" \nPodaj x: ");
            x = scanner.nextInt();
            System.out.print(" \nPodaj y: ");
            y = scanner.nextInt();
            wykonajRuch(gracz1, x, y, plansza);
            generujPlansze(plansza);
            if (isWinner(gracz1, plansza)) {
                System.out.println("\n\n\n\n\nGRACZ1 WYGRYWA");
                generujPlansze(plansza);
                break;
            }
            System.out.println("GRACZ 2");
            System.out.print(" \nPodaj x: ");
            x = scanner.nextInt();
            System.out.print(" \nPodaj y: ");
            y = scanner.nextInt();
            wykonajRuch(gracz2, x, y, plansza);
            generujPlansze(plansza);
            if (isWinner(gracz2, plansza)) {
                System.out.println("\n\n\n\n\nGRACZ2 WYGRYWA");
                generujPlansze(plansza);
                break;
            }

            max--;
            System.out.println("\n\n");
        }
    }

}
