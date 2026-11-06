
package visitors;

import elements.StrengthExercise;
import elements.CardioExercise;

public class CalorieCalculatorVisitor implements ExerciseVisitor {

    @Override
    public void visitStrengthExercise(StrengthExercise exercise) {
        double calories = exercise.getWeight() * exercise.getRepetitions() * 0.1;
        System.out.println(exercise.getName() + ": " + calories + " calories burned");
    }

    @Override
    public void visitCardioExercise(CardioExercise exercise) {
        double calories = exercise.getDuration() * 8.0;
        System.out.println(exercise.getName() + ": " + calories + " calories burned");
    }
}
