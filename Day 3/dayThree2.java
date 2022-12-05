import java.util.*;
import java.io.*;

public class dayThree2 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("dayThree.dat"));
        int totalAdd = 0, total = 0;
        int temp = 0;
        while (input.hasNextLine()){
            System.out.println();
            System.out.println(++temp);
            String a = input.nextLine();
            String b = input.nextLine();
            String c = input.nextLine();
            System.out.println(a + " " + b + " " + c);
            for(int i = 0; i < a.length(); i++){
                if((a.contains(a.substring(i, i+1))) && b.contains(a.substring(i, i+1)) && (c.contains(a.substring(i, i+1)))){
                    char match = a.charAt(i);
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
                    System.out.println(total);            
                    break;     
                }
            }
        }
    }
}