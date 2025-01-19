import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String args[]) {
        String regex = "\\w $ "; // Corrected regex
        String input = "Hello to how $ are you welcome to Tutorialspoint";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        int count = 0;

        while (m.find()) {
            count++;
        }

        System.out.println("Number of matches: " + count);
    }
}


