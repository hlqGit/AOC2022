import java.util.*;
import java.io.*;


public class daySix2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("daySix.dat"));
        String a = input.nextLine();
        int count = 0;
        ArrayList<String> all = new ArrayList<>();
        for(int i = 0; i < a.length(); i ++){
            if(!(i+14 > a.length())){
                String b = a.substring(i, i+14);
                char[] sort = b.toCharArray();
                System.out.println(Arrays.toString(sort));
                Arrays.sort(sort);
                String c = new String(sort);
                all.add(c);
            }
        }
        
        System.out.println(all.toString());
        for(int i = 0; i < all.size(); i++){
            count = 0;
            String d = all.get(i);
            System.out.println(all.get(i));
            for(int x = 0; x < d.length()-1; x++){
                System.out.println(d.substring(x, x+1) + " " + d.substring(x+1, x+2));
                if(d.substring(x, x+1).equals(d.substring(x+1,x+2))){
                    System.out.println("fail");
                    count = 0;
                    break;
                } else {
                    count++;
                    if (count > 12){
                       System.out.println(i+14);
                       return;
                    }
                        
                }
            }
        }
    }
}