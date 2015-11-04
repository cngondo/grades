import java.util.Scanner;

/**
 * Created by ngondo on 11/2/15.
 */
/*
* Program that shows Month of the year depending on the number input by
* the user
* */
public class Switch {
//    Generated constructor
    public Switch() {
        int grade = 0;
        System.out.println("Please enter the number of month: ");
//        Takes user's input
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid entry");

        }
    }
}
