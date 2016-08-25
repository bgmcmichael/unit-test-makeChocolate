package tiy.pink;

import java.util.Scanner;

/**
 * Created by fenji on 8/24/2016.
 */
public class ChocolateRunner {
    public static void main(String[] args) {
        int bigBlock;
        int smallBlock;
        int goal;
        int gameResult = 0;
        String answer = "";
        while (true) {
            ChocolateSolver solver = new ChocolateSolver();
            Scanner scan = new Scanner(System.in);
            System.out.println("How many big blocks of chocolate do you have?");
            bigBlock = Integer.valueOf(scan.nextLine());
            System.out.println("How many small blocks of chocolate do you have?");
            smallBlock = Integer.valueOf(scan.nextLine());
            System.out.println("How much chocolate are you trying to make?");
            goal = Integer.valueOf(scan.nextLine());
            gameResult = solver.makeChocolate(smallBlock, bigBlock, goal);
            solver.printGame(gameResult, scan);
            System.out.println("would you like to try again? y/n");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
