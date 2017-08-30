public class NumbersDemo
{
    public static void main(String[] args)
    {
        int num1 = 3, num2 = 23;
        displayTwiceTheNumber(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num1);
        displayNumberPlusFive(num2);
        displayNumberSquared(num1);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int num)
    {
        System.out.println(num + " times two is " + (num * 2));
    }
    public static void displayNumberPlusFive(int num)
    {
        System.out.println(num + " times five is " + (num * 5));
    }
    public static void displayNumberSquared(int num)
    {
        System.out.println(num + " squared " + (num * num));
    }
}
