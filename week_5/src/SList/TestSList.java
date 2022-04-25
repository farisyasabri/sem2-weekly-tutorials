package SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<String>();
        list.appendEnd("Linked List");
        list.appendEnd("is");
        list.appendEnd("easy");
//        System.out.println(list.contains("is"));
        list.display();
        System.out.println();
        System.out.println("removed: "+list.removeInitial());
        System.out.println(list.contains("difficult"));
        list.clear();
    }
}
