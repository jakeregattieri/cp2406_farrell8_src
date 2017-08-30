public class TestSandwich
{
    public static void main(String[] args)
    {
        Sandwich sandwich1 = new Sandwich("rye", 100, "ham", 60);
        Display(sandwich1);
    }
    public static void Display(Sandwich sandwich)
    {
        final int SLICES = 2;
        System.out.println("The " + sandwich.getBread().getBreadType() + " bread has " +
                sandwich.getBread().getCaloriesPerSlice() + " calories per slice");
        System.out.println("  The " + sandwich.getSandwichFilling().getSandwichFilling() + " filling has " +
                sandwich.getSandwichFilling().getCalories() + " calories");
        int total = sandwich.getBread().getCaloriesPerSlice() * SLICES + sandwich.getSandwichFilling().getCalories();
        System.out.println("   The sandwich, with " + SLICES +
                " two slices of bread, has " +
                total + " calories");
    }
}
