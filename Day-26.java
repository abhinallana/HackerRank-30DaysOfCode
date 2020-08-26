import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            
            int retday=sc.nextInt();
            int retmon=sc.nextInt();
            int retyear=sc.nextInt();
            
           if(year<retyear){
               System.out.println("0");
           }else{
            
             if (year>retyear)System.out.println("10000");
        else if(month>retmon)System.out.println(Math.abs(500*(month-retmon)));
            else if(day>retday)System.out.println(Math.abs(15*(day-retday)));
                else
                System.out.println("0");
               
                 }  
        }
        } 
