package question_2;

public class Node<E> {
    E element;
    Node<E> next;

    public Node(){
        element = null;
        next = null;
    }

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

}
