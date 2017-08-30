public class TestBread {
    public static void main(String[] args) {
        Bread bread1 = new Bread("rye", 120);
        Display(bread1);
    }
    public static void Display(Bread bread)
    {
        System.out.println("the bread type is " + bread.getBreadType() + " and has " + bread.getCaloriesPerSlice() + " calories");
        System.out.println("our motto is " + bread.MOTTO);
    }
}
