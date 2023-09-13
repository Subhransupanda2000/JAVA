class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Deque {
    private Node front;
    private Node rear;
    private int size;

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFront(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int removeFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int data = front.data;
        if (size == 1) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return data;
    }

    public int removeRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int data = rear.data;
        if (size == 1) {
            front = null;
            rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return data;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFront(1);
        deque.addRear(2);
        deque.addFront(3);

        System.out.println("Deque size: " + deque.size());
        System.out.println("Deque front: " + deque.removeFront());
        System.out.println("Deque rear: " + deque.removeRear());
    }
}
