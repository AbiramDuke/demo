public class StackUsingQueue {
    Queue q1;
    Queue q2;
    private int count = 0;

    public StackUsingQueue(int size) {
        this.q1 = new Queue(size);
        this.q2 = new Queue(size);
    }

    public void push(int value) {
        if (q2.isFull())
            throw new IllegalStateException();

        count++;
        if (q1.isEmpty()) {
            q1.enqueue(value);
            return;
        }

        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }

        q1.enqueue(value);

        while (!q2.isEmpty()) {
            q1.enqueue(q2.dequeue());
        }

    }

    public int pop() {
        if (q1.isEmpty())
            throw new IllegalStateException();
        return q1.dequeue();
    }

    public int count() {
        return count;
    }
}