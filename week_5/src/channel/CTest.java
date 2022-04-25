package channel;

import java.util.Scanner;

public class CTest {
    public static void main(String[] args) {
        CList<Integer> volume = new CList<>();
        Scanner s = new Scanner(System.in);
        String instruction = "- to previous channel \n+ to next channel";
        System.out.println(instruction);
        String ans = s.nextLine();
        while (true){
            if (ans.equals("+"))
                volume.addLast(1);
            else
                volume.delete();
            System.out.println(instruction);
            ans = s.nextLine();
        }
    }
}
