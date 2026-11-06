import elements.Exercise;
import elements.StrengthExercise;
import elements.CardioExercise;
import visitors.CalorieCalculatorVisitor;
import visitors.WorkoutReportVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Exercise> exercises = new ArrayList<>();

        exercises.add(new StrengthExercise("Bench Press", 80, 10));
        exercises.add(new CardioExercise("Running", 30, 5.0));
        exercises.add(new StrengthExercise("Squats", 60, 12));
        exercises.add(new CardioExercise("Cycling", 40, 12.0));

        System.out.println("=== CALORIE CALCULATOR ===");

        CalorieCalculatorVisitor calorieVisitor =
                new CalorieCalculatorVisitor();

        for (Exercise exercise : exercises) {
            exercise.accept(calorieVisitor);
        }

        System.out.println("\n=== WORKOUT REPORT ===");

        WorkoutReportVisitor reportVisitor =
                new WorkoutReportVisitor();

        for (Exercise exercise : exercises) {
            exercise.accept(reportVisitor);
        }
    }
}
