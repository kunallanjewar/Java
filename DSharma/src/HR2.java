import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR2 {
static int lonelyinteger(int[] a) {
return 0;

    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int a_size = Integer.parseInt(in.nextLine());
        int[] a = new int[a_size];
        int a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < a_size; _a_i++) {
            a_item = Integer.parseInt(next_split[_a_i]);
            a[_a_i] = a_item;
        }
        
        res = lonelyinteger(a);
        System.out.println(res);
        
    }
}
