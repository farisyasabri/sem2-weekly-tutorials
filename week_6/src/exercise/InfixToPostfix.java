package exercise;

import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter infix");
        String infix = s.nextLine();
        System.out.println(change(infix));
    }

    public static String change(String infix){
        Stack<Character> stack1 = new Stack<>();
        String result = "";
        for (int i=0;i<infix.length();++i){
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)){
                result += c;
            }

            else if (c=='('){
                stack1.push(c);
            }

            else if (c==')'){
                while (!stack1.isEmpty()&&stack1.peek()!='('){
                    result += stack1.pop();
                }
                stack1.pop();
            }

            else {
                while (!stack1.isEmpty() && operator(c)<operator(stack1.peek()))
                    result+=stack1.pop();
            }
            stack1.push(c);
        }
        return result;
    }

    public static int operator(Character c){
        switch (c){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }
}
