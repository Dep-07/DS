public class QueueTest {
    public static void main(String[] args) {
        Queue n = new Queue();
        n.enQueue(100);
        n.enQueue(200);
        n.enQueue(300);
        n.enQueue(400);
        n.enQueue(500);
        n.enQueue(600);
        n.enQueue(700);
        n.print();
        n.dQueue();
        n.print();
    }
}
