import java.io.*;
import java.util.*;

public class Solution {

     

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        scan.nextLine();
        for(int i=0;i<a;i++){
            String s = scan.nextLine();
            for(int j=0;j<s.length();j++){
            if (j%2 == 0) System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for(int j=0;j<s.length();j++){
            if (j%2 != 0) System.out.print(s.charAt(j));
            }
            System.out.println();
        }
       
    }
}