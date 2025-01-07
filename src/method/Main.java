package method;
 interface MethodA{
     default void methoda(){
         System.out.println("methoda");
     }
     static void methodb(){
         System.out.println("methodb");
     }
     void methodc();
 }
 abstract class Abst{
      abstract void methodo();
      static void methodd(){
          System.out.println("Static Abstract Method");
      }
 }
 class MethodB extends Abst implements MethodA {
     @Override
     public void methodc() {
         System.out.println("hhhh");
     }
     public void methoda(){
         System.out.println("hhhh");
     }

      void methodo(){
         System.out.println("methodo");
     }

//    public void methodc(){
//        System.out.println("this is MethodC");
//    };
 }
public class Main {
    public static void main(String[] args) {

    MethodB methodA = new MethodB();
    methodA.methoda();
        methodA.methodc();
        methodA.methodo();
        MethodA.methodb();
        Abst abs = new MethodB();


        Abst abst = new Abst() {
            @Override
            void methodo() {
                System.out.println("main abstract");
            }
        };
        abst.methodd();
        abst.methodo();
    }
}
