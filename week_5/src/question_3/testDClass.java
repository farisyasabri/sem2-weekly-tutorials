package question_3;

public class testDClass {
    public static void main(String[] args) {

        DLinkedList<Integer> list = new DLinkedList<>();
        list.addFirst(1);
        list.addLast(100);
        list.add(2,2);
//        list.remove(3);
        list.iterateForward();
        list.iterateBackward();
        System.out.println("size of current Double Linked List: "+ list.size);
        list.clear();
        System.out.println("size of current Double Linked List: "+ list.size);
    }
}
