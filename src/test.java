

class Vehicle {

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
    public void honk1() {
        System.out.println("Tussxut, tuut!");
    }
    public void honk2() {
        System.out.println("Tuut, tuut!");
    }
    class Child extends Vehicle{
        public void honk1() {
            System.out.println("Tuut, tuut!");
        }
        public void honk4() {
            System.out.println("Tuut, tuut!");
        }
    }



public class test {
    public static void main(String[] args) {
        Vehicle my = new Vehicle();
        my.honk1();
    }
}
}
