import lab.MyQueue;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        MyQueue<Character> list = new MyQueue<>();
        Scanner s = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word = s.nextLine();

        for (int i=word.length()-1;i>=0;i--){
            list.enqueue(word.charAt(i));
        }

        for (int i=0;i<word.length();i++){
            if (word.charAt(i)==list.dequeue()){
                System.out.print(word.charAt(i));
                if (i==word.length()-1)
                    System.out.println("\nthis is palindrome");
                else
                    System.out.println("this is not palindrome");
            }
            else
                System.out.println("this is not palindrome");
        }
    }
}
