package lab;

public class Node <E> {
    E element;
    Node<E> next;   //pointer of the class

    //default constructor didn't accept any parameter
    public Node(){
        element = null;
        next = null;    //assign smth to var
    }

    //single parameterized constructor
    public Node(E element) {
        this.element = element;
    }

    //double parameterized constructor
    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }
}
