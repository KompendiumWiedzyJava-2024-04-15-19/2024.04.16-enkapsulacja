package pl.comarch.szkolenia.stringi;

import pl.comarch.szkolenia.enkapsulacja.Client;
import pl.comarch.szkolenia.enkapsulacja.Square;

public class App {
    public static void main(String[] args) {
        Square square = new Square(2,4,8);
        Square square2 = new Square(2,4,8);

        System.out.println(square == square2);

        String s1 = "ABC";
        String s2 = new String("ABC");
        //s1 = s1+"XYZ";

        System.out.println(s1.equals(s2));
    }
}
