public class QueueTest {
    public static void main(String[] args) {
        Queue n = new Queue();
        n.enQueue(5);
        n.enQueue(10);
        n.enQueue(15);
        n.enQueue(20);
        n.enQueue(25);
        n.enQueue(30);
        n.enQueue(35);
        n.print();
        n.dQueue();
        n.print();
        System.out.println(n.contains(1000));
        System.out.println(n.peek());
        System.out.println(n.empty());
    }
}
