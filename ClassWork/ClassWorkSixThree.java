package Module_6.ClassWork;

import java.util.Scanner;

public class ClassWorkSixThree {
    public static void main (String [] args) {
        System.out.println("Hello ! Please enter your age:");
        final Scanner scanner = new Scanner (System.in);

        final String userInput = scanner.next();

        try {
            final int age = Integer.parseInt(userInput);
            if (age <0){
                throw new NegativeAgeExeption(age);
            }

            System.out.println ("Your age is:" + age);
        } catch (NumberFormatException ex) {
            System.out.println ("(Error): Age should be an integer number !");

        } catch (NegativeAgeExeption e) {
           System.out.println("(Error): Entered age is: " + e.getAgeValue() +
                   " Age should be >=0 !");
        }


    }
}
