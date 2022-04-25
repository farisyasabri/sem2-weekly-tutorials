package tutorial;

public class tutorial1_1 {
    public static void main(String[] args){

        Telephone no1 = new Telephone(03,79676300);
        Telephone no2 = new Telephone(03,79676301);
        Telephone no3 = new Telephone(03,79676302);
        Telephone no4 = new Telephone(03,79676303);
        Telephone no5 = new Telephone(03,79676304);

        String[] phoneNumber = {no1.makeFullNumber(),no2.makeFullNumber(),no3.makeFullNumber(),no4.makeFullNumber(),no5.makeFullNumber()};
        for (int i=0;i<5;i++){
            System.out.println(phoneNumber[i]);
        }
    }
}

class Telephone{
    private int areaCode, number;
    static int numberOfTelephoneObject;

    public Telephone(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String makeFullNumber(){
        return getAreaCode() + "-" + getNumber();
    }
}
