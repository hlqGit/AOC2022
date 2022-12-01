import java.util.*;
import java.io.*;

public class dayOne{
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(new File("dayOne.dat"));
        int total = 0, largest = 0;
        while (input.hasNextLine()){
            String check = input.nextLine();
            if (!(check.equals(""))){
                total += Integer.parseInt(check);
            } else {
                if (total > largest){ largest = total; }
                total = 0;
            }
        }
        if (total > largest){ largest = total; }
        System.out.println(largest);
    }
}