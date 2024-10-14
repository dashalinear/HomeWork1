import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HabitTracker {
    private Map<User, List<Habit>> userHabits = new HashMap<>();
    private String habit;

    public void registerUser (User user) {
        userHabits.putIfAbsent(user, new ArrayList<>());
    }

    public void createUser Habit(User user, Habit habit) {
        List<Habit> habits = userHabits.get(user);
        if (habits != null) {
            habits.add(habit);
        }
    }

}

    public void trackHabitCompletion(User user, Habit habit, boolean completed) {
    }

    public void generateStatistics(User user) {
    }
}
