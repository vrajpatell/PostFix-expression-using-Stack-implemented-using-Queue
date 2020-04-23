package postfix;
import java.util.Scanner;

public class SinglyLinkedListTest 
{
    public static void main(String[] args)
    {
        double num1, num2, answer;
        char c;

        Stack<Double> b = new postfix.LinkedStack<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the expression you would like to evaluate: ");
        String someString = input.nextLine();

        for (int index = 0; index < someString.length(); index++)
        {
            c = someString.charAt(index);

            if (Character.isDigit(c))
            {
                b.push((double)Character.digit(c, 10));
            }
            else if (c == '+')
            {
                num2 = b.pop();
                num1 = b.pop();
                answer = num1+num2;
                b.push(answer);
            }
            else if (c == '-')
            {
                num2 = b.pop();
                num1 = b.pop();
                answer = num1-num2;
                b.push(answer);
            }
            else if (c == '*')
            {
                num2 = b.pop();
                num1 = b.pop();
                answer = num1*num2;
                b.push(answer);
            }
            else if (c == '/')
            {
                num2 = b.pop();
                num1 = b.pop();
                answer = num1/num2;
                b.push(answer);
            }     
        }
        System.out.println("The result is: " + b.pop());
    }
}