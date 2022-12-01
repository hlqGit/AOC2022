import java.io.*;
import java.util.*;

public class dayOne2 {
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(new File("dayOne.dat"));
        int total = 0;
        int num1 = 0, num2 = 0, num3 = 0;
        while (input.hasNextLine()){
            String check = input.nextLine();
            if (!(check.equals(""))){
                total += Integer.parseInt(check);
            } else {
                if (total > num1) {num1 = total;} else
                if (total > num2) {num2 = total;} else
                if (total > num3) {num3 = total;} 
                total = 0;
            }
        }
        System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println(num1 + num2 + num3);
    }
}
