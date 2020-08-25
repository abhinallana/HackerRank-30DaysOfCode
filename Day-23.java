
//implementing linkedlist through queue......
static Queue<Node> q = new LinkedList<Node>();

	static void levelOrder(Node root){
      //Write your code here

//enqueue the current root...
    
 if(root!=null){
         q.add(root);
     }

//while processing the nodes....
     while(!q.isEmpty()){		//if queue is not empty...
         Node tree = q.remove();
         System.out.print(tree.data + " ");

	//now traversing through next level inorder..through left subtree...

         if(tree.left!=null)q.add(tree.left);

	//now traversing through next level inorder..through right subtree...

         if(tree.right!=null)q.add(tree.right);
     }
      
      
    }

