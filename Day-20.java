import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // count of total swaps
        int total=0;
        //iterating a loop for sorting
for (int i = n-1; i >0; i--) {
    int num = 0;
    for (int j = 0; j <i; j++) { 
        //comparing elements          
        if(a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            num++;
            total++;
        }
    }
    //if returns to 0 the loop terminates....
    if (num == 0) {
        break;
    }
}   
System.out.println("Array is sorted in "+ total +" swaps.");
System.out.println("First Element: "+ a[0]);
System.out.println("Last Element: "+ a[n-1]);
    }
}
