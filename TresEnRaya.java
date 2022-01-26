package hw4;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
    public static int sideSize;
    public static char player = 'X';
    public static char pc = 'O';
    public static char empty = '_';
    public static char[][] field;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args){
        setupSideSize();
        playingField(sideSize);
        currentStatusField();

        while (true) {

            playerTurn();
            currentStatusField();

            if (lineCheck(player)) {
                System.out.println("Вы победили");
                break;
            }
            if (diagonalCheck(player)) {
                System.out.println("Вы победили");
                break;
            }


            if (checkFullField()) {
                System.out.println("Ничья");
                break;
            }

            pcTurn();
            currentStatusField();
            if (lineCheck(pc)) {
                System.out.println("Вы проиграли");
                break;
            }
            if (diagonalCheck(pc)) {
                System.out.println("Вы проиграли");
                break;
            }

            if (checkFullField()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закочена");




    }

    public static void playingField(int sideSize){
        field = new char[sideSize][sideSize];

        for (int i = 0; i < sideSize ; i++) {
            for (int j = 0; j < sideSize; j++) {
                field[i][j] = empty;


            }

            
        }
        
    }
    public static void currentStatusField() {
        System.out.println("=============");

        for (int i = 0; i < sideSize; i++) {
            for (int j = 0; j < sideSize; j++) {
                System.out.print(field[i][j] + "|");

            }
            System.out.println();

        }
        System.out.println("--------------");
    }

    public static boolean cellCheck(int y, int x){
        return field[y][x] == empty;

    }

    public static boolean fieldBoundary(int y, int x){
        return y >= 0 && y < sideSize && x >= 0 && x < sideSize;

    }
    public static boolean checkTurnPlayer(int y, int x) {
        return x >= 0 && x < sideSize && y >= 0 && y < sideSize;
    }

    public static int getPlayerTurn(String msg){
        System.out.print(msg +" > ");
        return scanner.nextInt() - 1;
    }

    public static void playerTurn(){
        int x;
        int y;
        do {
            x = getPlayerTurn("Введите значение Х");
            y = getPlayerTurn("Введите значение Y");
        } while (!checkTurnPlayer(y, x) || !cellCheck(y, x));

        field[y][x] = player;
    }

    public static void pcTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(sideSize);
            y = random.nextInt(sideSize);
        }while (!cellCheck(y, x));
        field[y][x] = pc;
    }
    public static void setupSideSize() {
        sideSize = getSizeField ("Введите размер поля") + 1;
    }

    public static int getSizeField(String msg){
        System.out.print(msg + " >  ");
        return scanner.nextInt() -1;
    }
    public static boolean checkWinPosition(char checkChar) {
        if (field[0][0] == checkChar && field[0][1] == checkChar && field[0][2] == checkChar) return true;
        if (field[1][0] == checkChar && field[1][1] == checkChar && field[1][2] == checkChar) return true;
        if (field[2][0] == checkChar && field[2][1] == checkChar && field[2][2] == checkChar) return true;

        if (field[0][0] == checkChar && field[1][0] == checkChar && field[2][0] == checkChar) return true;
        if (field[0][1] == checkChar && field[1][1] == checkChar && field[2][1] == checkChar) return true;
        if (field[0][2] == checkChar && field[1][2] == checkChar && field[2][2] == checkChar) return true;

        if (field[0][0] == checkChar && field[1][1] == checkChar && field[2][2] == checkChar) return true;
        if (field[0][2] == checkChar && field[1][1] == checkChar && field[2][0] == checkChar) return true;

        return false;
    }

    public static boolean checkFullField() {
        for (int i = 0; i < sideSize; i++) {
            for (int j = 0; j < sideSize; j++) {
                if (field[i][j] == empty){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean lineCheck (char symbol) {
        boolean horz, vert;
        for (int i = 0; i < sideSize; i++) {
            horz = true;
            vert = true;

            for (int j = 0; j < sideSize; j++) {
                horz = horz & (field[i][j] == symbol);
                vert = vert & (field[j][i] == symbol);


            }
            if (horz || vert ) return true;

        }
        return false;


    }
    public static boolean diagonalCheck (char symbol) {
        boolean diagR, diagL;
        diagL = true;
        diagR = true;
        for (int i = 0; i < sideSize; i++) {
            diagR = diagR & (field[i][i] == symbol);
            diagL = diagL & (field[sideSize - i -1][i] == symbol);

        }
        if (diagL || diagR) return true;
        return false;
    }

}
