package lab;

public class MyLinkedList <E> {

    Node<E> head;
    Node<E> tail;
    int size;   //global variable

    //visualgo.net

    //default constructor
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    //use this if didn't use var size
    public int getSize(){
        Node<E> current = head;
        int size = 0;   //local variable
        while(current !=null){  // to traverse through the linked list no need to
            size++;                 // if the current is not null that's mean the list is still there
            current = current.next;
        }
        return size;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail==null)
            tail = head;
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if (tail==null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void add(int index,E e){
        Node<E> newNode = new Node<>(e);
        if (index==0)
            addFirst(e);
        else if (index>=size)
            addLast(e);
        else {
            Node<E> current = head;
            for (int i=0;i<index;i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = newNode;
            newNode.next = temp;
            size++;
        }
    }

    public E removeFirst(){
        if (size==0)
            return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head==null)
                tail = null;
            return temp.element;
        }
    }

    public E removeLast(){
        if (size==0)
            return null;
        else if (size==1) {
            Node<E> temp = head;
            head = tail = null;
            size--;
            return temp.element;
        }
        else {
            Node<E> temp = tail;
            Node<E> current = head;
            for (int i=0;i<size-2;i++){
                current = current.next;
            }
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index){
        if (index==0)
            return removeFirst();
        else if (index>=size)
            return removeLast();
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
    }

    public void add(E e){
        addLast(e);
    }

    public boolean contains(E e){
        Node<E> current = head;
        for (int i=0;i<size;i++){
            if (current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }

    public E get(int index){
        Node<E> current = head;
        for (int i=0;i<=index;i++){
            if (i==index)
                return current.element;
            else
                current = current.next;
        }
        return null;
    }

    public E getFirst(){
        return head.element;
    }

    public E getLast(){
        return tail.element;
    }

    public int indexOf(E e){
        Node<E> current = head;
        if (contains(e)) {
            for (int i = 0; i < size; i++) {
                if (current.element.equals(e)) {
                    return i;
                }
                current = current.next;
            }

        }
        return -1;
    }

    public int lastIndexOf(E e){
        Node<E> current = head;
        int index=0;
        if (contains(e)) {
            for (int i = 0; i < size; i++) {
                if (current.element.equals(e))
                    index = i;
                current = current.next;
            }
            return index;
        }
        return -1;
    }

    public E set(int index,E e){
        Node<E> newNode = new Node<>(e);

        Node<E> current = head;
        for (int i=0;i<index;i++){
            if (i==index-1){
                Node<E> temp = current.next;
                current.next = newNode;
                return temp.element;
            }
            current = current.next;
        }
        return null;
    }

    public void clear(){
        Node<E> current = head;
        for (int i=0;i<size;i++){
            current.next = null;
        }
    }

    public void print(){
        Node<E> current = head;
        for (int i=0;i<size;i++){
            System.out.print(current.element+" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse(){
        Node<E> current = head;
        Node<E> prev;
//        Node<E> temp = head;
        for (int i=0;i<size;i++){

            current = current.next;
        }
        System.out.println();
    }
}










