package SList;

public class SNode<E> {

    E element;
    SNode<E> next;
    SNode<E> previous;

    //default constructor
    public SNode() {
        element = null;
        next = null;
        previous = null;
    }

    //constructor with two parameter
    public SNode(E element, SNode<E> next, SNode<E> previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

}
