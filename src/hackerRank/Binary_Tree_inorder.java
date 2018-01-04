package hackerRank;
import java.util.Scanner;
class Nodes {
	Nodes right,left;
	int data;
    Nodes(int data) {
    	this.data = data;
    	right = left =null;
    }
}

public class Binary_Tree_inorder {  
		Nodes root;
	static int recursiveHeight(Nodes node) {
	
		 if ( node == null ) { return -1; }
        
         int right_height = recursiveHeight(node.right);
         int left_height = recursiveHeight(node.left);
         if (right_height > left_height) { return (right_height + 1); }
           return (left_height + 1);
				}
		
	
	 void printLevelOrder()
    {
        int h = recursiveHeight(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
	 void printGivenLevel (Nodes root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
	static void printInorder (Nodes node) {
		if(node != null) {
		printInorder(node.left);
		System.out.print(node.data +" ");
		printInorder(node.right);
				
		}
		else {
			return;
		}
	}
	
	
	
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Nodes root = null;
		while(n > 0) {
			int data = sc.nextInt();
			root = insert(root,data);
			 n = n-1;	
	      }
		printInorder(root);
		int maxHeight = recursiveHeight(root);
		maxHeight = maxHeight-1;
		System.out.println("\n" + maxHeight);
	       
	sc.close();
	}

	public static Nodes insert(Nodes root, int data) {
		// TODO Auto-generated method stub
		if(root == null){
			return new Nodes(data);
		}
		else {
			Nodes cur;
			if(data <= root.data) {
				cur = insert(root.left,data);
				root.left = cur;
			}
			else {
				cur = insert(root.right,data);
				root.right = cur;
			}
		     
			return root;
		
		}
				
	}
	
	

	
}


