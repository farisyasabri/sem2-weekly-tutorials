package lab;

public class HanoiTower {
    public static void main(String[] args) {
        MyStack<Integer> tower1 = new MyStack<>();
        MyStack<Integer> tower2 = new MyStack<>();
        MyStack<Integer> tower3 = new MyStack<>();

//        tower1.push(5);
//        tower1.push(4);
//        tower1.push(3);
//        tower1.push(2);
//        tower1.push(1);
//
//        int countRound = 1;
//
//        while(tower2.getSize()!=5||tower3.getSize()!=5){
//            if (tower2.isEmpty() && tower3.isEmpty()) {
//                tower2.push(tower1.pop());
//                tower3.push(tower1.pop());
//            }
//            else if (tower2.isEmpty()){
//                if (!tower1.isEmpty())
//                    tower2.push(tower1.pop());
//                else
//                    tower2.push(tower3.pop());
//            }
//
//            else if (tower3.isEmpty()){
//                if (!tower1.isEmpty())
//                    tower3.push(tower1.pop());
//                else
//                    tower3.push(tower2.pop());
//            }
//
//            else if (tower2.peek()>tower1.peek())
//                tower2.push(tower1.pop());
//            else if (tower3.peek()>tower1.peek())
//                tower3.push(tower1.pop());
//            else if (tower2.peek()>tower3.peek())
//                tower2.push(tower3.pop());
//            else if (tower3.peek()>tower2.peek())
//                tower3.push(tower2.pop());
//
//            System.out.println("round: "+countRound);
//            System.out.println("tower1: "+tower1.toString());
//            System.out.println("tower2: "+tower2.toString());
//            System.out.println("tower3: "+tower3.toString());
//            countRound++;
//        }
//
//        do {
//            if (tower2.isEmpty())
//                tower2.push(tower1.pop());
//            else if (tower3.isEmpty())
//                tower3.push(tower1.pop());
//
//            else if (!tower2.isEmpty()&&!tower1.isEmpty()) {
//                if (tower2.peek() > tower1.peek())
//                    tower2.push(tower1.pop());
//            }
//
//            else if (!tower3.isEmpty()&&!tower1.isEmpty()) {
//                if (tower3.peek() > tower1.peek())
//                    tower3.push(tower1.pop());
//            }
//
//            else if (!tower2.isEmpty()&&tower3.isEmpty()) {
//                if (tower2.peek() > tower3.peek())
//                    tower2.push(tower3.pop());
//            }
//
//            else if (!tower3.isEmpty()&&!tower2.isEmpty()) {
//                if (tower3.peek() > tower2.peek())
//                    tower3.push(tower2.pop());
//            }
//
//
//            System.out.println("round: "+countRound);
//            System.out.println("tower1: "+tower1.toString());
//            System.out.println("tower2: "+tower2.toString());
//            System.out.println("tower3: "+tower3.toString());
//            countRound++;
//        }while (tower3.getSize()!=3||tower2.getSize()!=3);
//




        tower1.push(5);
        tower1.push(4);
        tower1.push(3);
        tower1.push(2);
        tower1.push(1);

        tower2.push(tower1.pop());
        tower3.push(tower1.pop());
        tower3.push(tower2.pop());
        System.out.println("tower1: "+tower1.toString());
        System.out.println("tower2: "+tower2.toString());
        System.out.println("tower3: "+tower3.toString());

        tower2.push(tower1.pop());
        tower1.push(tower3.pop());
        tower2.push(tower3.pop());
        tower2.push(tower1.pop());
        System.out.println("tower1: "+tower1.toString());
        System.out.println("tower2: "+tower2.toString());
        System.out.println("tower3: "+tower3.toString());

        tower3.push(tower1.pop());
        tower1.push(tower2.pop());
        tower3.push(tower2.pop());
        tower3.push(tower1.pop());
        System.out.println("tower1: "+tower1.toString());
        System.out.println("tower2: "+tower2.toString());
        System.out.println("tower3: "+tower3.toString());


    }
}
