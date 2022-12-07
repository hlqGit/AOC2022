import java.util.*;
import java.io.*;

/* IMPORTANT NOTE: 
 * This code is specific to my input data. To change this, 
 * You must change the data I add into the array lists.
 */

public class dayFive {
    public static void main(String[] args) throws IOException{

        // I know this is tedious but it's my only idea.

        Scanner input = new Scanner(new File("dayFive.dat"));
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
                    for(int i = 0; i < moves; i++){stackTwo.push(stackOne.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackOne.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackOne.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackOne.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackOne.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackOne.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackOne.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackOne.pop());}
                    break;
                }
                break;
                case 2:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackTwo.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackTwo.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackTwo.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackTwo.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackTwo.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackTwo.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackTwo.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackTwo.pop());}
                    break;
                }
                break;
                case 3:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackThree.pop());}
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){stackTwo.push(stackThree.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackThree.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackThree.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackThree.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackThree.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackThree.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackThree.pop());}
                    break;
                }
                break;
                case 4:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackFour.pop());}
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){stackTwo.push(stackFour.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackFour.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackFour.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackFour.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackFour.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackFour.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackFour.pop());}
                    break;
                }
                break;
                case 5:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackFive.pop());}
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){stackTwo.push(stackFive.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackFive.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackFive.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackFive.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackFive.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackFive.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackFive.pop());}
                    break;
                }
                break;
                case 6:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackSix.pop());}
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){stackTwo.push(stackSix.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackSix.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackSix.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackSix.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackSix.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackSix.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackSix.pop());}
                    break;
                }
                break;
                case 7:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackSeven.pop());}
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){stackTwo.push(stackSeven.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackSeven.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackSeven.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackSeven.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackSeven.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackSeven.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackSeven.pop());}
                    break;
                }
                break;
                case 8:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackEight.pop());}
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){stackTwo.push(stackEight.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackEight.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackEight.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackEight.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackEight.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackEight.pop());}
                    break;
                    case 9:
                    for(int i = 0; i < moves; i++){stackNine.push(stackEight.pop());}
                    break;
                }
                break;
                case 9:
                switch(to){
                    case 1:
                    for(int i = 0; i < moves; i++){stackOne.push(stackNine.pop());}
                    break;
                    case 2:
                    for(int i = 0; i < moves; i++){stackTwo.push(stackNine.pop());}
                    break;
                    case 3:
                    for(int i = 0; i < moves; i++){stackThree.push(stackNine.pop());}
                    break;
                    case 4:
                    for(int i = 0; i < moves; i++){stackFour.push(stackNine.pop());}
                    break;
                    case 5:
                    for(int i = 0; i < moves; i++){stackFive.push(stackNine.pop());}
                    break;
                    case 6:
                    for(int i = 0; i < moves; i++){stackSix.push(stackNine.pop());}
                    break;
                    case 7:
                    for(int i = 0; i < moves; i++){stackSeven.push(stackNine.pop());}
                    break;
                    case 8:
                    for(int i = 0; i < moves; i++){stackEight.push(stackNine.pop());}
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

        System.out.println(stackSix.get(stackSix.size()-3));
    }
}