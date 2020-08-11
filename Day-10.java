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
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        int a =0;
        String bin = Integer.toString(n,2);
        String str[] = bin.split("0");
        for(int i =0;i<str.length;i++){
          if(a<str[i].length()){
            a= str[i].length();
          }
          
        }
        System.out.println(a); 
    }
}
