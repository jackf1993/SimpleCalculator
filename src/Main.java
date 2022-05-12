/* author: Jack Farah
 * level: Easy
 * Description: Simple implementation of a class without constructor. Created basic calculator with Addition,
 *              Subtraction, Multiplication, and Division.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculate = new SimpleCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int in = input.nextInt();

        System.out.println("Enter Operation (+, -, *, /)");
        char operator = input.next().charAt(0);

        System.out.println("Enter Second Number: ");
        int in2 = input.nextInt();

        calculate.setFirstNumber(in);
        calculate.setSecondNumber(in2);

        switch(operator){
            case '+':
                System.out.println(calculate.getAddNumber());
                break;
            case '-':
                System.out.println(calculate.getSubNumber());
                break;
            case '*':
                System.out.println(calculate.getMultiNumber());
                break;
            case '/':
                if(calculate.getSecondNumber()==0) {
                    System.out.println("Cannot Divid by Zero");
                }
                else {
                    System.out.println(calculate.getDivNumber());
                }
                break;
            default:
                break;
        }
        input.close();
    }
}
