import java.util.*;
import java.io.*;

//A for rock B for paper C for sissors
//x for rock y for paper z for sizzors 

public class dayTwo{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("dayTwo.dat"));
        int total = 0;
        while(input.hasNextLine()){
            String p1 = input.next();
            String p2 = input.next();
            if(p1.equals("A")){
                if(p2.equals("X")){
                    total += 1;
                    total += 3;
                }
                if(p2.equals("Y")){
                    total += 2;
                    total += 6;
                }
                if(p2.equals("Z")){
                    total += 3;
                }
            }
            if(p1.equals("B")){
                if(p2.equals("X")){
                    total += 1;
                    total += 0;
                }
                if(p2.equals("Y")){
                    total += 2;
                    total += 3;
                }
                if(p2.equals("Z")){
                    total += 3;
                    total += 6;
                }
            }
            if(p1.equals("C")){
                if(p2.equals("X")){
                    total += 1;
                    total += 6;
                }
                if(p2.equals("Y")){
                    total += 2;
                }
                if(p2.equals("Z")){
                    total += 3;
                    total += 3;
                }
            }

        }
        System.out.println(total);
    }
}