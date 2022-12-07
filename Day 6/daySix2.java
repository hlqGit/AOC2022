import java.util.*;
import java.io.*;


public class daySix2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("daySix.dat"));
        String thing = input.nextLine(), temp = "";
        int count = 0;
        for(int i = 0; i < thing.length(); i ++){
            temp = thing.substring(i, i+14);
            for(int x = 0; x < 14; x++){
                String check = temp.substring(x, x+1);
                for(int z = 0; z < 14; z++){
                    if(!(check.equals(temp.substring(z, z+1))) && x != z){
                        System.out.println(count);
                        break;
                        
                    } else { count++;}
                }
            }
        }
    }
}
