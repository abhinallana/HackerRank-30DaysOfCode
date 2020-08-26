import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
 public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int input =sc.nextInt();
       for(int q =0;q<input;q++){
           int a= sc.nextInt();
           int b = sc.nextInt();
           int result =0;
       
       for(int i = 1;i<a;i++){
           for(int j =i+1;j<=a;j++){
               int and = i&j;
               if(and < b && and>result) result = and;
           }
       }
       System.out.println(result);
       }
    }
}