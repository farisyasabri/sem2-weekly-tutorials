package lab;

import java.io.*;
import java.util.Scanner;

public class lab1_1 {
     public static void main(String[] args) {

        // 19 MARCH
        String message = "Thursday, 19 March 2021 " +
                "\n\nMy name is farisya with matrix number, 17207720. " +
                "\nI am majoring in Computer Science. This is my first time taking the Data Structure subject. " +
                "\nAt the moment, I am feeling nervous about taking this subject. \nThis is because " +
                "i love this subject. \n\nI acquired B for my previous Programming 1 course. It's not so bad. " +
                "\nSo, I think I can manage to get A for the DS subject this term. " +
                "\nIn order to do well in the subject, I will study hard. Wish me luck!!\n\n";

        try{
            PrintWriter text = new PrintWriter(new FileOutputStream("Farisya_17207720.txt"));
            text.write(message);
            text.close();
        }catch (IOException e){
            System.out.println("problem with the output file");
        }

        //read message
        readMessage();


        // 18 JUNE (REPLY)
        Scanner s = new Scanner(System.in);
        boolean end = true;

        String reply = s.nextLine();
        replyMessage(reply);
        while (end){
            reply = s.nextLine();
            replyMessage(reply);
            if (reply.equalsIgnoreCase("end"))
                end = false;
        }

        //read both message
        readMessage();

    }

    public static void replyMessage(String reply){
        try{
            PrintWriter text = new PrintWriter(new FileOutputStream("Farisya_17207720.txt",true));
            text.write(reply);
            text.close();
        }catch (IOException e){
            System.out.println("problem with the output file");
        }
    }

    public static void readMessage(){
        System.out.println("read the message: ");

        try{
            Scanner read = new Scanner(new FileInputStream("Farisya_17207720.txt"));
            while(read.hasNextLine())
                System.out.println(read.nextLine());
            read.close();
        }catch (FileNotFoundException e){
            System.out.println("Fie not found");
        }

        System.out.println();
        System.out.println();
    }

}

/*
Thursday, 18 June 2021.
        It's me again. Finally, it's the end of the term and the DS class has finished!
        I think I did my best in this course. I am so happy thank you :)
*/