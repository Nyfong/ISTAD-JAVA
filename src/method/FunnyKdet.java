package method;

public class FunnyKdet {
    //kdet jren mes
    public  static int sumOfKdet (int ...KdetNakeKlas){
        int sumKdet = 0;
        for (var KdetNake : KdetNakeKlas)  sumKdet += KdetNake;
        return sumKdet;
    }
    public static void main(String[] args) {
        System.out.println(sumOfKdet(8,100,10,20,30)+ " kdets . ");
    }
}
