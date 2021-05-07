

class Queue1 {
    private int[] numbers;

    int swep;

    public void enQueue(int number) {
        if (numbers == null) {
            numbers = new int[1];
            numbers[0] = number;
        } else {
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1] = number;
            numbers = temp;
        }
    }

    public void dQueue() {
        if (numbers == null) {
            System.out.println("null error");
            return;
        } else if (numbers.length == 1) {
            numbers = null;
            return;
        } else {
            int[] revers = new int[numbers.length - 1];
            int v = numbers.length - 1;
            for (int i = revers.length - 1; i >= 0; i--) {
                swep = numbers[i + 1];
                revers[i] = swep;

            }
            numbers = revers;

        }


    }

    public boolean empty() {
        return numbers == null;
    }

    public int peek() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }
        return numbers[numbers.length - 1];
    }

    public void clear() {
        numbers = null;
    }

    public void print() {
        if (empty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("\b]");
    }

    public boolean contains(int number) {
        if (empty()) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                return true;
            }
        }
        return false;
    }


    public int size() {
        if (empty()) {
            return 0;
        } else {
            return numbers.length;
        }
    }


}
public class Deque extends Queue{

}
