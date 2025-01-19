package enumJava;

import java.awt.*;

public class enum1 {


        public static void main(String[] args) {
            enum Colors {
                RED,
                BLUE,
                YELLOW,
                GREEN
            }

            Colors red = Colors.RED;
            String a = "RED";
            System.out.println(Colors.RED.compareTo(Colors.GREEN));
//            if(a==red.name()) System.out.println("match");
            Colors blue = Enum.valueOf(Colors.class, "v");
            System.out.println(blue);
//   System.out.println(red.name());
//            Colors[] directions = Colors.values();
//            for(Colors color : directions) System.out.println(color);
            //            System.out.println(directions.toString());
//            System.out.println(red.ordinal());
//            // RED
//            for(Colors c : Colors.values()) System.out.println(c);
        }
    }



//enum Season { WINTER, SPRING, SUMMER, FALL }
//enum Season { WINTER, SPRING, SUMMER, FALL ; }
