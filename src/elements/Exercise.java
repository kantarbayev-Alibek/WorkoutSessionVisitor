
package elements;

import visitors.ExerciseVisitor;

public interface Exercise {
    void accept(ExerciseVisitor visitor);
}
