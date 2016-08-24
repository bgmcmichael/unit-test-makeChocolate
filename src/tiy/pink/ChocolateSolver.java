package tiy.pink;

/**
 * Created by fenji on 8/24/2016.
 */
public class ChocolateSolver {
    public int makeChocolate(int small, int big, int goal) {
        int smallWeight = 1;
        int bigWeight = 5;
        int numBig = 0;
        int numSmall = 0;
        int bigTotal = 0;

        if((small < 0) || (big < 0) || (goal < 0)){
            return -1;
        } else {
            while (bigTotal < goal) {
                numBig++;
                bigTotal = numBig * 5;
            }
            if ((numBig * 5) != goal){
                numBig--;
            }
            if (numBig > big){
                numBig = big;
            }
            numSmall = goal - (numBig * 5);
        }
        if ((numBig <= big) && (numSmall <= small)){
            return numSmall;
        } else {
            return -1;
        }
    }

}
