import java.util.*;
import java.io.*;
// x lose y draw z win
public class dayTwo2 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("dayTwo.dat"));
        int total = 0;
        while (input.hasNextLine()){
            String p1 = input.next();
            String outcome = input.next();
            if(outcome.equals("X")){
                if(p1.equals("A")){
                    total += 3;
                }
                if(p1.equals("B")){
                    total += 1;
                }
                if(p1.equals("C")){
                    total += 2;
                }
            }
            if(outcome.equals("Y")){
                if(p1.equals("A")){
                    total += 4;
                }
                if(p1.equals("B")){
                    total += 5;
                }
                if(p1.equals("C")){
                    total += 6;
                }
            }
            if(outcome.equals("Z")){
                if(p1.equals("A")){
                    total += 8;
                }
                if(p1.equals("B")){
                    total += 9;
                }
                if(p1.equals("C")){
                    total += 7;
                }
            }
        }
        System.out.println(total);
    }
}
