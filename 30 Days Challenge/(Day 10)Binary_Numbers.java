import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count=0;
        int b=0;
        int rest = 0;
        while (n != 0){
            n = n/2;
            rest = n%2;
        if (rest == 1){
        count++;
        if (count >= b) b = count;
        }
            else count = 0;
        
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        System.out.println(b);
    }
}