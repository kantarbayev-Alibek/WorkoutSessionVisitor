
package visitors;

import elements.StrengthExercise;
import elements.CardioExercise;

public class WorkoutReportVisitor implements ExerciseVisitor {

    @Override
    public void visitStrengthExercise(StrengthExercise exercise) {
        System.out.println("Strength Exercise: " + exercise.getName());
        System.out.println("Weight: " + exercise.getWeight() + " kg");
        System.out.println("Repetitions: " + exercise.getRepetitions());
    }

    @Override
    public void visitCardioExercise(CardioExercise exercise) {
        System.out.println("Cardio Exercise: " + exercise.getName());
        System.out.println("Duration: " + exercise.getDuration() + " minutes");
        System.out.println("Distance: " + exercise.getDistance() + " km");
    }
}
