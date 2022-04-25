package channel;

public class CList<E> {
    int size;
    CNode<E> head;
    CNode<E> tail;

    public CList(){
        size = 0;
        head = null;
        tail = null;
    }

    public void addFirst(E e){
        CNode<E> newNode = new CNode<>(e,head,tail);
        if (head!=null)
            head = newNode;
        head = newNode;
        if (tail==null)
            tail = newNode;
        size++;
        System.out.println("channel: "+ size);
    }

    public void addLast(E e){
        if (size==5) {
            size = 1;
            System.out.println("channel: " + size);
        }
        else if (size==0)
            addFirst(e);
        else {
            CNode<E> newNode = new CNode<>(e, head, tail);
            tail.next = newNode;
            tail = newNode;
            size++;
            System.out.println("channel: " + size);
        }
    }

    public void delete(){
        if (size==1) {
            size=5;
            System.out.println("channel: " + size);
        }
        else {
            CNode<E> temp = tail;
            tail = tail.prev;
            temp.prev.next = head;
            temp.prev = null;
            size--;
            System.out.println("channel: " + size);
        }
    }
}
