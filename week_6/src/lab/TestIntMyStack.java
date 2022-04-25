package lab;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack1 = new MyStack<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer value:");
        int ans = s.nextInt();
        stack1.push(ans);
        stack1.push(1);
        System.out.println("size: "+ stack1.getSize());
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }
}