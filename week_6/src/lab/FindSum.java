package lab;

public class FindSum {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        int sum =0;
        while (!stack.isEmpty()){
            sum = sum + stack.pop();
        }

        System.out.println("total sum: " + sum);
    }
}
