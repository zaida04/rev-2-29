public class Stack<T> {
    public LinkedListNode<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T value) {
        if(this.top == null) {
            this.top = new LinkedListNode(value, null);
        } else {
            this.top = this.top.prepend(value);
        }
    }

    public T pop() {
        if(this.top == null) {
            return null;
        } else {
            LinkedListNode<T> oldHead = this.top;
            this.top = oldHead.next;

            return oldHead.value;
        }
    }

    public T peek() {
        if (this.top == null) {
            return null;
        } else {
            return this.top.value;
        }
    }
}
