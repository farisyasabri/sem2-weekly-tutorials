package volume;

public class VNode<E> {
    E element;
    VNode<E> next;
    VNode<E> prev;

    public VNode(){
        element = null;
        next = null;
        prev = null;
    }

    public VNode(E element, VNode<E> next, VNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
