package Module_6.HomeWork;

import java.util.Scanner;

public class version3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter First side of Triangle");
        final String inputField1 = scan.next();
        System.out.println ("Enter Second side of Triangle");
        final String inputField2 = scan.next();
        System.out.println ("Enter Third side of Triangle");
        final String inputField3 = scan.next();

        try {
            final int a = Integer.parseInt(inputField1);
            System.out.println("Side a of Triangle is: " + a);
            if ( a <= 0) {
                throw new SideOfTriangleNotValid(a);
            }
            final int b = Integer.parseInt(inputField2);
            System.out.println("Side b of Triangle is: " + b);
            if ( b <= 0) {
                throw new SideOfTriangleNotValid(a);
            }
            final int c = Integer.parseInt(inputField3);
            System.out.println("Side c of Triangle is: " + c);
            if ( c <= 0) {
                throw new SideOfTriangleNotValid(a);
            }
            int p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

            System.out.println("Square of Triangle is: " + s);

        } catch (NumberFormatException exeption1) {
            System.out.println("Error: Side a of Triangle should be an integer number");
        } catch (SideOfTriangleNotValid sideOfTriangleNotValid) {
            System.out.println ("Side of Triangle should be > 0");
            System.out.println("Plese restart the programm and enter a valid values");
        }
    }


}
