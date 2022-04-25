package volume;

public class VList<E> {
    int size;
    VNode<E> head;
    VNode<E> tail;

    public VList(){
        size = 0;
        head = null;
        tail = null;
    }

    public void addFirst(E e){
        VNode<E> newNode = new VNode<>(e,head,null);
        if (head!=null)
            head.prev = newNode;
        head = newNode;
        if (tail==null)
            tail = newNode;
        size++;
        System.out.println("volume: "+ size);
    }

    public void addLast(E e){
        if (size==5)
            System.out.println("volume: "+size);
        else if (size==0)
            addFirst(e);
        else {
            VNode<E> newNode = new VNode<>(e, null, tail);
            tail.next = newNode;
            tail = newNode;
            size++;
            System.out.println("volume: " + size);
        }
    }

    public void delete(){
        if (size==1)
            System.out.println("volume: "+size);
        else {
            VNode<E> temp = tail;
            tail = tail.prev;
            temp.prev.next = null;
            temp.prev = null;
            size--;
            System.out.println("volume: " + size);
        }
    }
}
