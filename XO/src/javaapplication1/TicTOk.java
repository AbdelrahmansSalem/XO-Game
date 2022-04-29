/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abdel
 */
public class TicTOk {

    private char[][] XO = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    static ArrayList<Integer> nums = new ArrayList<Integer>();

    public void draw() {

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 19; k++) {
                System.out.print("*");

            }
            System.out.println();
            if (i == 3) {
                break;
            }

            for (int l = 0; l < 3; l++) {
                int s = 0;

                for (int k = 0; k < 19; k++) {

                    if (k == 0 || k == 6 || k == 12 || k == 18) {
                        System.out.print("#");

                    } else if ((k == 3 && l == 1) || (k == 9 && l == 1) || (k == 15 && l == 1)) {
                        System.out.print(XO[i][s]);

                        s++;

                    } else {
                        System.out.print(" ");
                    }

                }

                System.out.println();

            }
        }

    }

    public boolean iswin() {
        if (XO[0][0] == 'x' && XO[0][1] == 'x' && XO[0][2] == 'x') {
            return true;
        } else if (XO[1][0] == 'x' && XO[1][1] == 'x' && XO[1][2] == 'x') {
            return true;
        } else if (XO[2][0] == 'x' && XO[2][1] == 'x' && XO[2][2] == 'x') {
            return true;
        } else if (XO[0][0] == 'x' && XO[1][0] == 'x' && XO[2][0] == 'x') {
            return true;
        } else if (XO[0][1] == 'x' && XO[1][1] == 'x' && XO[2][1] == 'x') {
            return true;
        } else if (XO[0][2] == 'x' && XO[1][2] == 'x' && XO[2][2] == 'x') {
            return true;
        } else if (XO[0][0] == 'x' && XO[1][1] == 'x' && XO[2][2] == 'x') {
            return true;
        } else if (XO[0][2] == 'x' && XO[1][1] == 'x' && XO[2][0] == 'x') {
            return true;
        } else if (XO[0][0] == 'o' && XO[0][1] == 'o' && XO[0][2] == 'o') {
            return true;
        } else if (XO[1][0] == 'o' && XO[1][1] == 'o' && XO[1][2] == 'o') {
            return true;
        } else if (XO[2][0] == 'o' && XO[2][1] == 'o' && XO[2][2] == 'o') {
            return true;
        } else if (XO[0][0] == 'o' && XO[1][0] == 'o' && XO[2][0] == 'o') {
            return true;
        } else if (XO[0][1] == 'o' && XO[1][1] == 'o' && XO[2][1] == 'o') {
            return true;
        } else if (XO[0][2] == 'o' && XO[1][2] == 'o' && XO[2][2] == 'o') {
            return true;
        } else if (XO[0][0] == 'o' && XO[1][1] == 'o' && XO[2][2] == 'o') {
            return true;
        } else if (XO[0][2] == 'o' && XO[1][1] == 'o' && XO[2][0] == 'o') {
            return true;
        } else {
            return false;
        }

    }

    public void Player1() {
        l:
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.print("player 1 Enter your move: ");

            int p1 = s.nextInt();

            for (int m = 0; m < nums.size(); m++) {
                if (p1 == nums.get(m)) {
                    System.out.println("This place has been chosen ,choose anthoter place.");
                    continue l;

                } else {

                }
            }
            if (p1 == 1) {
                XO[0][0] = 'x';
            } else if (p1 == 2) {
                XO[0][1] = 'x';
            } else if (p1 == 3) {
                XO[0][2] = 'x';
            } else if (p1 == 4) {
                XO[1][0] = 'x';
            } else if (p1 == 5) {
                XO[1][1] = 'x';
            } else if (p1 == 6) {
                XO[1][2] = 'x';
            } else if (p1 == 7) {
                XO[2][0] = 'x';
            } else if (p1 == 8) {
                XO[2][1] = 'x';
            } else if (p1 == 9) {
                XO[2][2] = 'x';
            }

            nums.add(p1);
            break;

        }
    }

    public void Player2() {

        l:
        while (true) {

            Scanner s = new Scanner(System.in);
            System.out.print("player 2 Enter your move: ");

            int p2 = s.nextInt();

            for (int m = 0; m < nums.size(); m++) {
                if (p2 == nums.get(m)) {
                    System.out.println("This place has been chosen, choose anthoter place.");
                    continue l;
                } else {

                }
            }
            System.out.println("...........");

            if (p2 == 1) {
                XO[0][0] = 'o';
            } else if (p2 == 2) {
                XO[0][1] = 'o';
            } else if (p2 == 3) {
                XO[0][2] = 'o';
            } else if (p2 == 4) {
                XO[1][0] = 'o';
            } else if (p2 == 5) {
                XO[1][1] = 'o';
            } else if (p2 == 6) {
                XO[1][2] = 'o';
            } else if (p2 == 7) {
                XO[2][0] = 'o';
            } else if (p2 == 8) {
                XO[2][1] = 'o';
            } else if (p2 == 9) {
                XO[2][2] = 'o';
            }

            nums.add(p2);
            break;
        }
    }

    public void thegame() {

        for (int i = 0; i < 9; i++) {
            draw();
            Player1();

            if (iswin()) {
                System.out.println("congratulation player 1 you are the winner");
                System.exit(0);
            }

            Player2();

            if (iswin()) {
                System.out.println("congratulation player 2 you are the winner");
                System.exit(0);
            }

        }

    }

}

//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
