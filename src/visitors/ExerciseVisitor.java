
package visitors;

import elements.StrengthExercise;
import elements.CardioExercise;

public interface ExerciseVisitor {
    void visitStrengthExercise(StrengthExercise exercise);
    void visitCardioExercise(CardioExercise exercise);
}
