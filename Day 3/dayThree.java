import java.util.*;
import java.io.*;

public class dayThree {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("dayThree.dat"));
        int totalAdd = 0, total = 0;
        while(input.hasNextLine()){
            String a = input.nextLine();
            String halfOne = a.substring(0, a.length()/2), halfTwo = a.substring(a.length()/2);
            System.out.println(halfOne + " " + halfTwo);
            for (int i = 0; i < halfOne.length(); i++){
                if (halfOne.contains(halfTwo.substring(i, i+1))){
                    char match = halfTwo.charAt(i);
                    if (match <=90){
                        totalAdd = match - 38;
                        System.out.println(match);
                        System.out.println(totalAdd);
                    } else {
                        totalAdd = match - 96;
                        System.out.println(match);
                        System.out.println(totalAdd);
                    }
                    total += totalAdd;
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
