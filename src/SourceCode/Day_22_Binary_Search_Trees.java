import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day_22_Binary_Search_Trees{
  Nodes root;
  public static int getHeight(Node root){
   	
		 if ( root == null ) { return -1; }
        
         int right_height = getHeight(root.right);
         int left_height = getHeight(root.left);
         if (right_height > left_height) { return (right_height + 1); }
           return (left_height + 1);
				}
		
  
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
          
            int height=getHeight(root);
            System.out.println(height);
        }	
}