import static jdk.internal.org.jline.utils.InfoCmp.Capability.user1;

public class Main {
    public static void main(String[] args) {
        HabitTracker habitTracker = new HabitTracker();

        // Регистрация пользователей User user1 = new User("user1@example.com", "password1", "User  1");
        User user2 = new User("user2@example.com", "password2", "User  2");
        habitTracker.registerUser (user1);
        habitTracker.registerUser (user2);

        // Создание привычек
        Habit habit1 = new Habit("habit1", "description1", Frequency.DAILY);
        Habit habit2 = new Habit("habit2", "description2", Frequency.WEEKLY);
        habitTracker.createUser Habit(user1, habit1);
        habitTracker.createUser Habit(user2, habit2);

        habitTracker.trackHabitCompletion(user2, habit2, false);

        habitTracker.generateStatistics(user2);
    }
}
