import java.util.*;
import java.io.*;

/* IMPORTANT NOTE: 
 * This code is specific to my input data. To change this, 
 * You must change the data I add into the array lists.
 */

public class dayFive2 {
    public static void main(String[] args) throws IOException{

        // I know this is tedious but it's my only idea.

        Scanner input = new Scanner(new File("test.dat"));
        Stack<String> stackOne = new Stack<String>();
        Stack<String> stackTwo = new Stack<String>();
        Stack<String> stackThree = new Stack<String>();
        Stack<String> stackFour = new Stack<String>();
        Stack<String> stackFive = new Stack<String>();
        Stack<String> stackSix = new Stack<String>();
        Stack<String> stackSeven = new Stack<String>();
        Stack<String> stackEight = new Stack<String>();
        Stack<String> stackNine = new Stack<String>();
        stackOne.push("Z");
        stackOne.push("J");
        stackOne.push("G");

        stackTwo.push("Q");
        stackTwo.push("L");
        stackTwo.push("R");
        stackTwo.push("P");
        stackTwo.push("W");
        stackTwo.push("F");
        stackTwo.push("V");
        stackTwo.push("C");

        stackThree.push("F");
        stackThree.push("P");
        stackThree.push("M");
        stackThree.push("C");
        stackThree.push("L");
        stackThree.push("G");
        stackThree.push("R");
        
        stackFour.push("L");
        stackFour.push("F");
        stackFour.push("B");
        stackFour.push("W");
        stackFour.push("P");
        stackFour.push("H");
        stackFour.push("M");
        
        stackFive.push("G");
        stackFive.push("C");
        stackFive.push("F");
        stackFive.push("S");
        stackFive.push("V");
        stackFive.push("Q");

        stackSix.push("W");
        stackSix.push("H");
        stackSix.push("J");
        stackSix.push("Z");
        stackSix.push("M");
        stackSix.push("Q");
        stackSix.push("T");
        stackSix.push("L");

        stackSeven.push("H");
        stackSeven.push("S");
        stackSeven.push("F");
        stackSeven.push("B");
        stackSeven.push("V");

        stackEight.push("F");
        stackEight.push("J");
        stackEight.push("Z");
        stackEight.push("S");

        stackNine.push("M");
        stackNine.push("C");
        stackNine.push("D");
        stackNine.push("P");
        stackNine.push("F");
        stackNine.push("H");
        stackNine.push("B");
        stackNine.push("T");

        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();

        while(input.hasNextLine()){
            String[] command = new String[3];
            command = input.nextLine().replace("move", "").replace("from", "").replace("to", "").split(" ");
            int moves = Integer.parseInt(command[1]);
            int from = Integer.parseInt(command[3]);
            int to = Integer.parseInt(command[5]);
            switch(from){
                case 1:
                switch(to){
                    case 2:
                    for(int i = moves; i > 0; i--){
                        stackTwo.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackOne.get(stackOne.size()-moves));
                        stackOne.remove(stackOne.size()-moves);
                    }
                    break;
                }
                break;
                case 2:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackTwo.get(stackTwo.size()-moves));
                        stackTwo.remove(stackTwo.size()-moves);
                    }
                    break;
                }
                break;
                case 3:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                    case 2:
                    for(int i = moves; i > 0; i--){
                        stackTwo.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackThree.get(stackThree.size()-moves));
                        stackThree.remove(stackThree.size()-moves);
                    }
                    break;
                }
                break;
                case 4:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){
                        stackTwo.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackFour.get(stackFour.size()-moves));
                        stackFour.remove(stackFour.size()-moves);
                    }
                    break;
                }
                break;
                case 5:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){
                        stackTwo.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackFive.get(stackFive.size()-moves));
                        stackFive.remove(stackFive.size()-moves);
                    }
                    break;
                }
                break;
                case 6:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){
                        stackTwo.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackSix.get(stackSix.size()-moves));
                        stackSix.remove(stackSix.size()-moves);
                    }
                    break;
                }
                break;
                case 7:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){
                        stackTwo.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackSeven.get(stackSeven.size()-moves));
                        stackSeven.remove(stackSeven.size()-moves);
                    }
                    break;
                }
                break;
                case 8:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){
                        stackTwo.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){
                        stackNine.push(stackEight.get(stackEight.size()-moves));
                        stackEight.remove(stackEight.size()-moves);
                    }
                    break;
                }
                break;
                case 9:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){
                        stackOne.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){
                        stackTwo.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){
                        stackThree.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){
                        stackFour.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){
                        stackFive.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){
                        stackSix.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){
                        stackSeven.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){
                        stackEight.push(stackNine.get(stackNine.size()-moves));
                        stackNine.remove(stackNine.size()-moves);
                    }
                    break;
                }
                break;
            }
        }
        System.out.println(stackOne.toString());
        System.out.println(stackTwo.toString());
        System.out.println(stackThree.toString());
        System.out.println(stackFour.toString());
        System.out.println(stackFive.toString());
        System.out.println(stackSix.toString());
        System.out.println(stackSeven.toString());
        System.out.println(stackEight.toString());
        System.out.println(stackNine.toString());
    }
}