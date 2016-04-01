package Module_6.HomeWork;

import java.util.Scanner;

public class EnginePower {
    public static void main (String [] args) {
        System.out.print ("What is the power of your engine? (kW)");
        Scanner scan = new Scanner(System.in);

        final String inputField = scan.next ();

        try {
            final double power = Double.parseDouble(inputField);
            System.out.println ("The power of your engine is: " + power);
            if ( power <= 0) {
                throw new PowerNonValidException(power);
            }
        }
        catch (NumberFormatException exeption) {
            System.out.println ("Error: power should be a double/integer number");
        } catch (PowerNonValidException e) {
            System.out.println ("Error: Entered power of engine is: " + e.getPowerValue() + " Power should be > 0");
        }


    }
}
