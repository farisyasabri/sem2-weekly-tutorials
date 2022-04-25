package lab;

public class ArrayBag<T> implements BagInterface<T>{

    private T[] bag;
    private int DEFAULT_CAPACITY, numberOfEntries;

    public int getCurrentSize(){
        return numberOfEntries;
    }

    public boolean isFull(){
        if (bag.length==DEFAULT_CAPACITY)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if (bag.length==0)
            return true;
        else
            return false;
    }

    public boolean add(T newEntry){
        if (add(newEntry))
            return true;
        else
            return false;
    }

    @Override
    public T remove() {
        return null;
    }


    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    public void clear(){

    }

    public int getFrequencyOf(T anEntry){
        return 0;
    }

    public boolean contains(T anEntry){
        return true;
    }

    @Override
    public T[] toArray() {

        for (int i=0;i<numberOfEntries;i++)
        return T[0];
    }


}
