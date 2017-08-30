
import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String[] args)
    {
        int num;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number >>> ");
        num = userInput.nextInt();
        displayTwiceTheNumber(num);
        displayNumberPlusFive(num);
        displayNumberSquared(num);
    }

    public static void displayTwiceTheNumber(int num) {
        System.out.println(num + " times two is " + (num * 2));
    }

    public static void displayNumberPlusFive(int num) {
        System.out.println(num + " times five is " + (num * 5));
    }

    public static void displayNumberSquared(int num) {
        System.out.println(num + " squared " + (num * num));
    }
}

