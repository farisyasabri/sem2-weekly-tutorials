package SList;

public class SList<E> {
    int size;
    SNode<E> head;
    SNode<E> tail;

    public SList(){
        size = 0;
        head = null;
        tail = null;
    }

    public void addFirst(E e){
        SNode<E> newNode = new SNode<E>(e,head,null);
        if (head!=null)
            head.previous = newNode;
        head = newNode;

        if (tail==null)
            tail = newNode;
        size++;
        System.out.println("adding: "+ e);
    }

    public void appendEnd(E e){
        if (size==0){
            addFirst(e);
        }
        else {
            SNode<E> newNode = new SNode<E>(e, null, tail);
            if (tail != null)
                tail.next = newNode;
            tail = newNode;
            if (head == null)
                head = tail;
            size++;
            System.out.println("adding: " + e);
        }
    }

    public E removeInitial(){
        SNode<E> temp = head;
        head = head.next;
        head.next.previous = null;
        temp.next = null;
        size--;
        return temp.element;
    }

    public boolean contains(E e){
        SNode<E> temp = head;
        for (int i=0;i<size;i++){
            if (temp.equals(e))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void clear(){
        SNode<E> temp = head;
        while (head!=null){
            temp = head.next;
            head.previous = head.next = null;
            head = temp;
        }
        temp = null;
        tail.previous = tail.next = null;
        size = 0;
    }

    public void display(){
        SNode<E> temp = head;
        for (int i=0;i<size;i++){
            System.out.print(temp.element+" ");
            temp = temp.next;
        }
    }
}











