package question_3;

public class DLinkedList<E> {

    DNode<E> head;
    DNode<E> tail;
    int size;

    public DLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e){
        DNode<E> newNode = new DNode<>(e,head,null);
        if (head!=null)
            head.prev = newNode;

        head = newNode;

        if (tail==null)
            tail = newNode;

        size++;
        System.out.println("adding: "+ head.element);
    }

    public void addLast(E e){
        DNode<E> newNode = new DNode<>(e,null,tail);
        if (tail!=null)
            tail.next = newNode;
        tail = newNode;
        if (head==null)
            head = newNode;

        size++;
        System.out.println("adding: "+ tail.element);
    }

    public void add(E e,int index){
        if (index==0)
            addFirst(e);
        else if (index == size)
            addLast(e);
        else {
            DNode<E> temp = head;
            for (int i=0;i<index;i++){
                temp = temp.next;
            }
            DNode<E> newNode = new DNode<>(e,temp,temp.prev);
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
        }
    }

    public void iterateForward(){
        System.out.println("iterating forward...");
        DNode<E> temp = head;
        for (int i=0;i<size;i++){
            System.out.print(temp.element+ "  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void iterateBackward(){
        System.out.println("iterating backward...");
        DNode<E> temp = tail;
        while (temp!=null){
            System.out.print(temp.element+ "  ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public E removeFirst(){
        DNode<E> temp = head;
        head = head.next;
        head.prev =null;
        size--;

        return temp.element;
    }

    public E removeLast(){
        DNode<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;

        return temp.element;
    }

    public E remove(int index){
        E element;

        if (index==0)
            element = removeFirst();
        else if (index==size-1)
            element = removeLast();
        else if (index<0||index>=size)
            throw new IndexOutOfBoundsException();
        else {
            DNode<E> temp = head;
            for (int i=0;i<index;i++){
                temp=temp.next;
            }
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
        }

        return element;
    }

    public void clear(){
        int count=0;
        DNode<E> temp = head;
        while (head!=null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
            count++;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
        System.out.println("successfully clear "+count+" node(s)");
    }
}
















