package lab;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        MyStack<Character> letter = new MyStack<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter one word: ");
        String input = s.nextLine();
        int i=0;
        int length = input.length();

        /*
        for(int i=0;i<str.length;i++)
        character c = str.charAt(i)

        same as:
        for(Character c: str){
            letter.push(c); }
         */


        while (length!=0){
            letter.push(input.charAt(i));
            i++;
            length--;
        }
        System.out.println(letter.toString());

        String reverse ="";

        while(!letter.isEmpty()){
            reverse = letter.pop() + reverse;
        }

        if (input.equals(reverse))
            System.out.println("this is palindrome");
        else
            System.out.println("this is not palindrome");
    }
}
