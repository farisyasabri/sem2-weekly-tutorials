package lab;

public class testQ1 {
    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<>();
        fruitQ.enqueue("Durian");
        fruitQ.enqueue("Blueberry");
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        System.out.println("list of all fruits:\n" + fruitQ.toString());
        System.out.println("top item in queue: "+ fruitQ.peek());
        System.out.println("delete Durian: " + fruitQ.dequeue());
        System.out.println("item in index 2: "+ fruitQ.getElement(2));
        System.out.println("is queue consist of Cherry: " + fruitQ.contains("Cherry"));
        System.out.println("is queue consist of Durian: " + fruitQ.contains("Durian"));

        if (!fruitQ.isEmpty())
            System.out.println(fruitQ.toString());
        else
            System.out.println("the queue is empty");
    }
}
