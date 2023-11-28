import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        String str = "xcodex";
        if (str.charAt(0)=='x'){

            str=str.replaceFirst("x", "a");

        }
        System.out.println(str);

        System.out.println("--------------------------------");

        String Gul = "Egul";
        if (Gul.charAt(0)=='E'){

            Gul=Gul.replaceFirst("E", "A");

        }
        System.out.println(Gul);










        /*
         Create a class named StartsWithX and write a program that
         asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */
    }
}
