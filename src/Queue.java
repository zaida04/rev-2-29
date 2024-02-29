public class Queue<T> {
    private LinkedListNode<T> front;
    private LinkedListNode<T> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(T value) {
        if(this.back == null) {
            this.back = new LinkedListNode<>(value, null);
            this.front = this.back;
        } else {
            this.back.append(value);
            this.back = this.back.next;
        }
    }

    public T dequeue() {
        if(this.front == null) {
            return null;
        } else {
            T value = this.front.value;
            this.front = this.front.next;
            if (this.front == null) {
                this.back = null;
            }
            return value;
        }
    }

    public T peek() {
        if (this.front == null) {
            return null;
        } else {
            return this.front.value;
        }
    }
}
