public class Stack {
 private int maxSize;
 private int[] stackArray;
 private int top;
 public Stack(int size) {
 maxSize = size;
 stackArray = new int[maxSize];
 top = -1;
 }
 public void push(int value) {
 if (!isFull()) {
 top++;
 stackArray[top] = value;
 } else {
 System.out.println("Stack is full!");
 }
 }
 public int pop() {
 if (!isEmpty()) {
 int value = stackArray[top];
 top--;
 return value;
 } else {
 System.out.println("Stack is empty!");
 return -1;
 }
 }
 public int peek() {
 if (!isEmpty()) {
 return stackArray[top];
 } else {
 System.out.println("Stack is empty!");
 return -1;
 }
 }
 public boolean isEmpty() {
 return (top == -1);
 }
 public boolean isFull() {
 return (top == maxSize - 1);
 }
 public static void main(String[] args) {
 Stack myStack = new Stack(5);
 myStack.push(1);
 myStack.push(2);
 myStack.push(3);
 System.out.println(myStack.peek()); // Output: 3
 myStack.pop();
 myStack.pop();
 System.out.println(myStack.peek()); // Output: 1
 System.out.println(myStack.isEmpty()); // Output: false
 System.out.println(myStack.isFull()); // Output: false
 }
}