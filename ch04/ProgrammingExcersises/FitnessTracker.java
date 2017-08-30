import java.time.*;
public class FitnessTracker
{
    String activity;
    int minutes;
    LocalDate date;
    public FitnessTracker()
    {
        activity = "running";
        minutes = 1;
        date = LocalDate.of(2016, 1, 1);
    }
    public FitnessTracker(String activity, int minutes, LocalDate date)
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }
    public String getActivity()
    {
        return activity;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public LocalDate getDate()
    {
        return date;
    }
}
