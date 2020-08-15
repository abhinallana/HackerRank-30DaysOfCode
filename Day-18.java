public class Solution {
    // Write your code here.
    //instances for stack and queue....
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();
    
    //pushes the charcter onto the stack.
    private void pushCharacter(char c) {
        stack.push(c);
        
    }
    //enquing the queue....
    private void enqueueCharacter(char c) {
        queue.add(c);
        
    }
    //dequing the character....
    private Object dequeueCharacter() {
        return queue.remove();
    }    
    //remove the character from the String

        private Object popCharacter() {
        return stack.pop();
    }

