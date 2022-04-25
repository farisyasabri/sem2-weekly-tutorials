package channel;

public class CNode<E> {
    E element;
    CNode<E> next;
    CNode<E> prev;

    public CNode(){
        element = null;
        next = null;
        prev = null;
    }

    public CNode(E element, CNode<E> next, CNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
