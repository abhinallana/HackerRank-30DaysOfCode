public class Solution {
     public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    String S = in.next();
    isnumber(S);
}
public static void isnumber(String S){

    try{
     System.out.println(Integer.parseInt(S));
     }
    catch(NumberFormatException e){
        System.out.println("Bad String");
}
}
}
