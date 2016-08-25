package tiy.pink;

/**
 * Created by fenji on 8/24/2016.
 */
public class AsciiHandler {
    public void printX(){
        System.out.println("\\       /");
        System.out.println(" \\     / ");
        System.out.println("  \\   /  ");
        System.out.println("   \\ /   ");
        System.out.println("    /    ");
        System.out.println("   / \\   ");
        System.out.println("  /   \\  ");
        System.out.println(" /     \\ ");
        System.out.println("/       \\");
    }

    public void printChocolateBars(int numBig, int numSmall){
        String[] smallBlocksArray = new String[4];
        String[] largeBlocksArray = new String[7];
        for(String thisString:smallBlocksArray){
            thisString = "";
        }
        for(String thisString:largeBlocksArray){
            thisString = "";
        }
        System.out.println("You used " + numSmall + " small blocks of chocolate.");
        if (numSmall == 0){
            printX();
        } else {
            for (int counter = 0; counter < numSmall; counter++) {
                if (counter == 0){
                    smallBlocksArray[0] = (" __  ");
                    smallBlocksArray[1] = ("|  | ");
                    smallBlocksArray[2] = ("|  | ");
                    smallBlocksArray[3] = ("|__| ");
                } else {
                    smallBlocksArray[0] += (" __  ");
                    smallBlocksArray[1] += ("|  | ");
                    smallBlocksArray[2] += ("|  | ");
                    smallBlocksArray[3] += ("|__| ");
                }
            }
            for (String thisString : smallBlocksArray) {
                System.out.println(thisString);
            }
        }

        System.out.println("You used " + numBig + " big blocks of chocolate.");
        if (numBig == 0){
            printX();
        } else {
            for (int counter = 0; counter < numBig; counter++) {
                if (counter == 0){
                    largeBlocksArray[0] = (" ______  ");
                    largeBlocksArray[1] = ("|      | ");
                    largeBlocksArray[2] = ("|      | ");
                    largeBlocksArray[3] = ("|      | ");
                    largeBlocksArray[4] = ("|      | ");
                    largeBlocksArray[5] = ("|      | ");
                    largeBlocksArray[6] = ("|______| ");
                } else {
                    largeBlocksArray[0] += (" ______  ");
                    largeBlocksArray[1] += ("|      | ");
                    largeBlocksArray[2] += ("|      | ");
                    largeBlocksArray[3] += ("|      | ");
                    largeBlocksArray[4] += ("|      | ");
                    largeBlocksArray[5] += ("|      | ");
                    largeBlocksArray[6] += ("|______| ");
                }
            }
            for (String thisString : largeBlocksArray) {
                System.out.println(thisString);
            }
        }
    }
}
