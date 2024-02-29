public class LinkedListNode<T> {
    public LinkedListNode<T> next;
    public T value;

    public LinkedListNode(T value, LinkedListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public void append(T value) {
        if (this.next != null) {
            this.next.append(value);
        } else {
            this.next = new LinkedListNode<>(value, null);
        }
    }

    public boolean contains(T value) {
        if (this.value.equals(value)) {
            return true;
        } else if (this.next != null) {
            return this.next.contains(value);
        } else {
            return false;
        }
    }

    public LinkedListNode<T> prepend(T value) {
        LinkedListNode<T> newNode = new LinkedListNode<>(value, this);

        return newNode;
    }
}
