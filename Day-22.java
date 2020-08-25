public static int getHeight(Node root){
      //Write your code here
      int HLeft = 0;
        int HRight = 0;

    if (root.left != null) {
       HLeft = getHeight(root.left) + 1;
    }
    if (root.right != null) {
        HRight = getHeight(root.right) + 1;
    }
    if(HLeft>HRight) return HLeft;
    else return HRight;

}
    