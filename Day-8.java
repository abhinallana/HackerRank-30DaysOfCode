import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
       Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  Map<String,Integer>myMap = new HashMap<String,Integer>();
  for(int i =0;i<n;i++) {
  String name = sc.next();
  int num = sc.nextInt();
  sc.nextLine();
  
  myMap.put(name,num);
  }
  while(sc.hasNext()) {
    String s = sc.next();
    if(myMap.get(s)== null) {
      System.out.println("Not found");
    }else {
      System.out.println(s+ "=" +myMap.get(s));
    }
  }
  

  }
  }