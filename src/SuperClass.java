
class Super{
    int Speed(){
        return 300;
    }
}
class Child1 extends Super{
    int Speed(){
        return 500;
    }
}
public class SuperClass {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.Speed();
    }
}
