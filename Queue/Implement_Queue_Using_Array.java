public class Queue {
    int[] queue = new int[5];
    int size;
    int front = 0;
    int rear = 0;

    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear = (rear + 1) % 5] = data;
            size++;
        } else {
            System.out.println("Overflow");
        }
    }
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int data = queue[front=(front+1)%5];
            size--;
            return data;
        }
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return getSize() == 0;
    }
    public boolean isFull() {
        return getSize() == 5;
    }
    public void show() {
        for (int i = 0; i < size; ++i)
            System.out.print(queue[(front + i)%5] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(7);
        q.enQueue(7);
        q.show();
        System.out.println(q.deQueue());
        q.enQueue(8);
        q.show();
        q.enQueue(10);
        q.show();
        System.out.println(q.deQueue());
        q.show();
    }
}
