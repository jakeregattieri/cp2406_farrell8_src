public class Bread {

    private String breadType;
    private int caloriesPerSlice;
    public final static String MOTTO = "The staff of life";
    public Bread(String type, int cal)
    {
        breadType = type;
        caloriesPerSlice = cal;
    }
    public Bread()
    {

    }
    public String getBreadType()
    {
        return breadType;
    }
    public int getCaloriesPerSlice()
    {
        return caloriesPerSlice;
    }
}
