package volume;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        VList<Integer> volume = new VList<>();
        Scanner s = new Scanner(System.in);
        String instruction = "- to volume down \n+ to volume up";
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
