package method;
public class Method1 {

    //method greeting
    public void greetingFunction(String name) {
        System.out.println("Hello " + name);
    }

    //method calculate sum of an integer

    public  int sumAnInteger(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {

        //creating an instance for using a method of class method1
        Method1 object =  new Method1();

        //sum method
        System.out.println( "The sum of two value is :" + object.sumAnInteger(10,20));

        //devided method
        object.greetingFunction("Pu kdet Thom");
    }
}
