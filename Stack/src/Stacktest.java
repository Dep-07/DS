import java.net.ServerSocket;

public class Stacktest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.empty();
        stack.push(2);
        stack.push(5);
        stack.push(56);
        stack.push(46);
        stack.print();
        stack.pop();
        stack.print();
        stack.contains(100);
        System.out.println(stack.size());
        System.out.println(stack.contains(100));
        System.out.println(stack.peek());


    }
}
