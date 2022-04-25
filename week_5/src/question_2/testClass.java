package question_2;

import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your student list. Enter 'n' to end....");
        String name = s.nextLine();
        list.addFirst(name);
        while (!name.equals("n")){
            name = s.nextLine();
            if (name.equalsIgnoreCase("n"))
                break;
            list.add(name);
        }

        System.out.println("You have entered the following students' name :");
        list.printList();

        System.out.println("The number of students entered is: " + list.getSize());

        System.out.println("All the names are correct? ");
        System.out.println("Enter 'r' to rename the students name, 'n' to proceed");
        String ans = s.nextLine();
        if (ans.equalsIgnoreCase("r")){
            System.out.println("Enter the existing student name that you want to rename");
            String oldName = s.nextLine();
            System.out.println("Enter the new name");
            String newName = s.nextLine();
            list.replace(oldName,newName);
            list.printList();
        }
//        if (ans.equalsIgnoreCase("n")) {
            System.out.println("Do you want to remove any of your students name?");
            System.out.println("Enter 'y' for yes, 'n' to proceed");
//        }

        ans = s.nextLine();
        if (ans.equalsIgnoreCase("y")){
            System.out.println("Enter the student name you want to remove");
            String nameRemove = s.nextLine();
            list.removeElement(nameRemove);
            System.out.println();
            System.out.println("The number of updated students is: "+ list.getSize());
            System.out.println("The updated students list is:");
            list.printList();
        }
        else
            System.out.println("All student data captured complete. Thank you!");





    }
}
