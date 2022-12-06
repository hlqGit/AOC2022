import java.util.*;
import java.io.*;

public class dayFour2{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("dayFour.dat"));
        int total = 0;
        while(input.hasNextLine()){
            String[] a = new String[4];
            a = input.nextLine().split("[-,]");
            System.out.println(Arrays.toString(a));
            int p1s1 = Integer.parseInt(a[0]), p1s2 = Integer.parseInt(a[1]), p2s1 = Integer.parseInt(a[2]), p2s2 = Integer.parseInt(a[3]);
            System.out.println(p1s1 + " " + p1s2 + " " + p2s1 + " " + p2s2 + " ");
            if(((p2s1 >= p1s1) && (p2s1 <= p1s2)) || ((p1s1 >= p2s1) && (p1s1 <= p2s2))) { total++; }
            System.out.println(total);
        }
    }
}