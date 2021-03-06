package lab;

public class MyQueue <E>{
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public MyQueue(E[]e){
    }

    public MyQueue(){
    }

    public void enqueue(E e){
        list.addLast(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public E getElement(int i){
        return list.get(i);
    }

    public E peek(){
        return list.getFirst();
    }

    public int getSize(){
        return list.size();
    }

    public boolean contains(E e){
        return list.contains(e);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }
}

















