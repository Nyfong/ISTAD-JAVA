package regex;

public class TestRegex
{
    public static void main(String[] args) {
        String rex = "^\\d+\\.\\s\\p{Lu}+.*";

        System.out.println("1. PTYU fmmflksfkslfsm".matches(rex));
// true
    }
}
