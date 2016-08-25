package tiy.pink;

import java.util.Scanner;

/**
 * Created by fenji on 8/24/2016.
 */
public class ChocolateSolver {
    int numBig = 0;
    int numSmall = 0;
    int bigTotal = 0;
    int userSmall = 0;
    int userBig = 0;
    int userGoal = 0;

    public int makeChocolate(int small, int big, int goal) {
        userBig = big;
        userSmall = small;
        userGoal = goal;

        if ((small < 0) || (big < 0) || (goal < 0)) {
            return -1;
        } else {
            while (bigTotal < goal) {
                numBig++;
                bigTotal = numBig * 5;
            }
            if ((numBig * 5) != goal) {
                numBig--;
            }
            if (numBig > big) {
                numBig = big;
            }
            numSmall = goal - (numBig * 5);
        }
        if ((numBig <= big) && (numSmall <= small)) {
            return numSmall;
        } else {
            return -1;
        }
    }

    public void printGame(int gameResult, Scanner scan) {


        if ((gameResult == -1) && ((userGoal < 0) || (userSmall < 0) || (userBig < 0))) {
            System.out.println("You cannot use negative numbers.");
            AsciiHandler asscii = new AsciiHandler();
            asscii.printX();
        } else {
            if (gameResult == -1) {

                System.out.println("You don't have enough chocolate.");
                AsciiHandler asscii = new AsciiHandler();
                asscii.printX();
            } else {
                AsciiHandler asscii = new AsciiHandler();
                asscii.printChocolateBars(numBig, numSmall);
            }
        }
    }
}