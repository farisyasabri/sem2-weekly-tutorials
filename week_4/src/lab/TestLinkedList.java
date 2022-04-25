package lab;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.print();
        list.reverse();
        System.out.println(list.size);
        System.out.println("first value: "+ list.getFirst());
        System.out.println("last value: " + list.getLast());
        int half = list.size/2;
        list.remove(half);
        System.out.println(list.indexOf('b'));
        System.out.println(list.indexOf('d'));
        System.out.println(list.contains('c'));
        System.out.println(list.set(0,'h'));
        System.out.println(list.set(1,'e'));
        System.out.println(list.set(2,'l'));
        System.out.println(list.set(3,'l'));
        System.out.println(list.set(4,'o'));
    }
}
