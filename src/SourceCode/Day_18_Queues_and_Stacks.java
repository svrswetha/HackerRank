import java.io.*;
import java.util.*;

public class Day_18_Queues_and_Stacks {
    // Write your code here.
     Stack<Character> myStack = new Stack<Character>();
     private LinkedList list = new LinkedList();
    // Queue<String> myQueue = new LinkedList<String>();
     
     void pushCharacter(char ch) {
       myStack.push((Character) ch);
       System.out.println("push(" + ch+ ")");
       System.out.println("stack: " + myStack);
       }  
     
      void enqueueCharacter(Object item)  {
           list.addLast(item);
           System.out.println("Added(" + item+ ")");
           System.out.println("list: " + list);
        }
      
      char popCharacter() {
      System.out.print("pop -> ");
      char a = (char) myStack.pop();
      System.out.println(a);
      System.out.println("stack: " + myStack);      
      return a;
     }
      char dequeueCharacter() {
        char k = (char) list.poll();
        return k;
      }

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day_18_Queues_and_Stacks p = new Day_18_Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );  
    }
}