import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   
        public static void main(String[] args) 
        { 
            int a=0;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            for(int input : arr) {
                for(int i =1;i<n;i++) {
                    if(input%i==0)a++;
                }if(a==2)System.out.println("Not prime");
                else System.out.println("Prime");
                
            }
        } 
    } 