package method;

public class Varargs {

    // method use for sum the value
    public  static  int sumAnInteger (int ... number)
    {
        int sum = 0;
        // the value that passing  is the array [number 's elements];
      for( var i : number) sum += i;

      return sum;
    }
    public static void main(String[] args) {
        //print the result
        System.out.println(sumAnInteger(1,2));
        System.out.println(sumAnInteger(1,2,3,4,5));
    }
}












