import java.util.*;
import java.io.*;

public class daySix {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("daySix.dat"));
        String thing = input.nextLine();
        int count = 0;
        for(int i = 0; i < thing.length(); i++){
            char char1 = thing.charAt(i);
            char char2 = thing.charAt(i+1);
            char char3 = thing.charAt(i+2);
            char char4 = thing.charAt(i+3);
            if((char1 != char2) && (char1 !=char3) && (char1 !=char4) && ((char2 != char1) && (char2 !=char3) && (char2 !=char4)) && (char3 != char1) && (char3 !=char2) && (char3 !=char4) && (char4 != char1) && (char4 !=char2) && (char4 !=char3)){
                break;
            } else { count++;}
        }
        System.out.println(count+4);
    }
}
