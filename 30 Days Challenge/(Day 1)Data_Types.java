import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int iu = scan.nextInt();
        double du = scan.nextDouble();
        String st=scan.nextLine();
         st = scan.nextLine();
      
       
        System.out.println(i+iu);
        System.out.println(d+du);
        System.out.println(s+st);

       

        scan.close();
    }
}