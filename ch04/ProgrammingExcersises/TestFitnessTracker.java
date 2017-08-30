import java.time.LocalDate;

public class TestFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker exercise = new FitnessTracker();
        System.out.println(exercise.getActivity());
        FitnessTracker exercise2 = new FitnessTracker("Swimming", 2,
                LocalDate.of(2015, 4, 21));
        System.out.println(exercise2.getActivity() + "," + exercise2.getMinutes() + "," + exercise2.getDate());
    }
}
