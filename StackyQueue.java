
import java.util.Arrays;

public class StackyQueue { 
    // Basic queue implementation using an array
    static class Queue {
        private char[] arr;
        private int head;
        private int tail;

        public Queue(int size) {
            arr = new char[size];
            head = 0;
            tail = 0;
        }

        public boolean isFull() {
            return tail == arr.length;
        }

        public boolean isEmpty() {
            return head == tail;
        }

        public void enqueue(char c) {
            if (!isFull()) {
                arr[tail++] = c;
            } else {
                System.out.println("Queue is full");
            }
        }

        public char dequeue() {
            if (!isEmpty()) {
                char c = arr[head];
                head++;
                return c;
            } else {
                System.out.println("Queue is empty");
                return '\0';
            }
        }
    }

    
    static class Stack {
        private char[] arr;
        private int top;

        public Stack(int size) {
            arr = new char[size];
            top = -1;
        }

        public boolean isFull() {
            return top == arr.length - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(char c) {
            if (!isFull()) {
                arr[++top] = c;
            } else {
                System.out.println("Stack is full");
            }
        }

        public char pop() {
            if (!isEmpty()) {
                char c = arr[top];
                top--;
                return c;
            } else {
                System.out.println("Stack is empty");
                return '\0';
            }
        }
    }

    // Metodo que invierte cadena
    public static String reverseString(String s) {
        Stack stack = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    // metodo que verifica si es palindromo
    public static boolean isPalindrome(String s) {
        Stack stack = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        String reversed = sb.toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.enqueue('a');
        q.enqueue('b');
        q.enqueue('c');
        System.out.println(q.dequeue()); // prints 'a'
        q.enqueue('d');
        q.enqueue('e');
        System.out.println(q.dequeue()); // prints 'b'
        System.out.println(q.dequeue()); // prints 'c'
        System.out.println(q.dequeue()); // prints 'd'
        System.out.println(q.dequeue()); // prints 'e'
        System.out.println(q.dequeue()); // prints 'Queue is empty'

        
        Stack s = new Stack(5);
        s.push('a');
        s.push('b');
        s.push('c');
        //System.out.println(s.pop()); // prints 'c'
        s.push('d');
        s.push('e');
        System.out.println(s.pop()); //prints e
        System.out.println(s.pop()); //prints d
        System.out.println(s.pop()); //prints c
        System.out.println(s.pop()); //prints b
        System.out.println(s.pop()); //prints a
        System.out.println(s.pop()); //prints 'Stack is empty;
        		
    }
}

