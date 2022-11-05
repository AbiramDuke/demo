public class QueueUsingStack {
    private Stack s1;
    private Stack s2;
    private int count = 0;

    public QueueUsingStack(int size) {
        this.s1 = new Stack(size);
        this.s2 = new Stack(size);
    }

    public void enqueue(int value) {
        if (s1.isFull())
            throw new IllegalStateException();
        s1.push(value);
        count++;
    }

    public int dequeue() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        if (s2.isEmpty())
            throw new IllegalStateException();
        count--;
        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public boolean isFull() {
        return s1.isFull() || s2.isFull();
    }

    public int count() {
        return count;
    }

}