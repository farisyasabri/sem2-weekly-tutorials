package lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args){
        int totalChar = 0;

        String[] alpha;
        try{
            Scanner s = new Scanner(new FileInputStream("text1.txt"));
            while (s.hasNext()){
                alpha = s.next().split(",");
                for (int i=0;i<alpha.length;i++){
                    System.out.print(alpha[i]);
                }
                System.out.println();
                totalChar = totalChar+alpha.length;

            }s.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println("total character:"+totalChar);
    }
}
