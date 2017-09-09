import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter number >>>");
        num = userInput.nextInt();
        while (num > 0) {
            if (isEven(num))
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
            System.out.print("enter number >>>");
            num = userInput.nextInt();
        }
    }
    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
}
