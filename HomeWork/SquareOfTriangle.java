package Module_6.HomeWork;

import java.util.Scanner;

public class SquareOfTriangle {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter First side of Triangle");

        final String inputField1 = scan.next();
        try {
            final int a = Integer.parseInt(inputField1);
            System.out.println ("Side a of Triangle is: " + a);
             }
        catch (NumberFormatException exeption1) {
            System.out.println ("Error: Side a of Triangle should be an integer number");
        }

        System.out.print ("Enter Second side of Triangle");
                final String inputField2 = scan.next();
        try {
            final int b = Integer.parseInt(inputField2);
            System.out.println ("Side a of Triangle is: " + b);
        }
        catch (NumberFormatException exeption1) {
            System.out.println ("Error: Side a of Triangle should be an integer number");
        }

        System.out.print ("Enter Third side of Triangle");
        final String inputField3 = scan.next();
        try {
            final int c = Integer.parseInt(inputField3);
            System.out.println ("Side a of Triangle is: " + c);
        }
        catch (NumberFormatException exeption1) {
            System.out.println ("Error: Side a of Triangle should be an integer number");
        }

      //  int p = (a+b+c)/2;

    }
}
