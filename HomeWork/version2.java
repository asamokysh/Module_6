//нет ексепшена когда 2 и 3 радиус минусовіе

 package Module_6.HomeWork;

import java.util.Scanner;

public class version2 {
    public static void main (String [] args) {
        Scanner inputtedRadius = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        final String R = inputtedRadius.next();
        Scanner inputtedRadius2 = new Scanner(System.in);
        System.out.println("Enter radius2 of circle:");
        final String R2 = inputtedRadius2.next();
        Scanner inputtedRadius3 = new Scanner(System.in);
        System.out.println("Enter radius3 of circle:");
        final String R3 = inputtedRadius3.next();

        try {
            final int radius = Integer.parseInt(R);
            final int radius2 = Integer.parseInt(R2);
            final int radius3 = Integer.parseInt(R3);
            double CircleSquare;
            double CircleSquare2;
            double CircleSquare3;
            double Pi = 3.14d;
            CircleSquare = Pi * radius * radius;
            if (CircleSquare <=0) {
                throw new VVersion2NotValid(CircleSquare);
            }
            CircleSquare2 = Pi * radius2 * radius2;
            if (CircleSquare2 <=0) {
                throw new VVersion2NotValid(CircleSquare2);
            }
            CircleSquare3 = Pi * radius3 * radius3;
            if (CircleSquare3 <=0) {
                throw new VVersion2NotValid(CircleSquare3);
            }
            System.out.println("Circle Square is = " + CircleSquare);
            System.out.println("Circle Square 2 is = " + CircleSquare2);
            System.out.println("Circle Square 3 is = " + CircleSquare3);

        } catch (VVersion2NotValid vVersion2NotValid) {
            System.out.println ("Error: Entered radius is: " + vVersion2NotValid.getCircleSquareValue() + " Radius should be > 0");
            System.out.println("Plese restart the programm and enter a valid values");
        }
        catch (NumberFormatException ex) {
            System.out.println("Radius should be a number! Plese restart the programm and enter a valid values");







        }
    }
}
