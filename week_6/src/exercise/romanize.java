package exercise;

public class romanize {
    public static int romanToInt(String s) {
        int total = 0;
        int num = 0;
        int num2 = 0;

        if( s.length() < 0 || s.length()>=16) {
            System.out.println("test");
            System.out.println(s.length());
            return -1;
        }

        for(int i = s.length()-1 ; i>0 ; i--){
            char c = s.charAt(i);
            char prev = s.charAt(i-1);
            int n = 0;

            switch(c){
                case 'I' : num = 1;
                    break;
                case 'V' : num = 5;
                    break;
                case 'X' : num = 10;
                    break;
                case 'L' : num = 50;
                    break;
                case 'C' : num = 100;
                    break;
                case 'D' : num = 500;
                    break;
                case 'M' : num = 1000;
                    break;
            }

            switch(prev){
                case 'I' : num2 = 1;
                    break;
                case 'V' : num2 = 5;
                    break;
                case 'X' : num2 = 10;
                    break;
                case 'L' : num2 = 50;
                    break;
                case 'C' : num2 = 100;
                    break;
                case 'D' : num2 = 500;
                    break;
                case 'M' : num2 = 1000;
                    break;
            }

            if(c > prev ){ // c = 10 , prev = 1
                System.out.println("in");
                total = total-num;
            }
            else{
                total = total+num;
            }
//            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "VIII"; // 8
        System.out.println(romanToInt(s));
    }

}
