package lab;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> FirstStack = new MyStack<>();
        FirstStack.push('a');
        FirstStack.push('b');
        FirstStack.push('c');
        System.out.println(FirstStack.toString());
        System.out.println(FirstStack.search('b'));
        System.out.println(FirstStack.search('k'));

        MyStack<Integer> SecondStack = new MyStack<>();
        SecondStack.push(1);
        SecondStack.push(2);
        SecondStack.push(3);
        System.out.println(SecondStack.toString());
        System.out.println(SecondStack.search(6));
    }
}
