package variables;

public class Var4 {
    public static void main(String[] args) {
        //wrapper class
        Character wCharacter;
        Integer wInteger;
        int num = 10;
        wInteger = num; //auto-boxing
        System.out.println("converting to binary:"+Integer.toBinaryString(wInteger));
    }
}
