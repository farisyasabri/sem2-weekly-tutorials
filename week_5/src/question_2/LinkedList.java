package question_2;

public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;
    int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail==null)
            tail=head;
    }

    public void add(E e){
        if (size==0)
            addFirst(e);
        else {
//            Node<E> temp = head;
//            Node<E> newNode = new Node<>(e);
//            for (int i = 0; i < size; i++) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
            tail.next = new Node<>(e);
            tail = tail.next;
            size++;
        }
    }

    public void removeElement(E e){
        if (size==1){
            head = head.next;
            if (head==null)
                tail=null;
            size--;
        }
        else if (head.element.equals(e)){
            Node<E> temp = head;
            head = head.next;
            temp.next = null;
            size--;
        }
        else {
            Node<E> temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.next.element.equals(e)) {
                    temp.next = temp.next.next;
                    temp = temp.next;
                    size--;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void printList(){
        Node<E> temp = head;
        for (int i=0;i<size;i++){
            System.out.print(temp.element+ " ");
            temp = temp.next;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean contains(E e){
        Node<E> temp = head;
        for (int i=0;i<size;i++) {
            if (temp.element.equals(e))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void replace(E e, E newE){
        Node<E> current = head;
        Node<E> newNode = new Node<>(newE);
        for (int i=0;i<size;i++){
//            if (head.element.equals(e)){
//                re
//            }
            if (current.next.element.equals(e)){
                Node<E> temp = current.next;
//                newNode = current.next;
                current.next = newNode;
//                current.next.next = temp.next;
                newNode.next = temp.next;
                break;
            }
            current = current.next;
        }
    }
}
//if (temp.next.element.equals(e)){
//        newNode = temp.next.next;
//        temp.next = newNode;
//        }









