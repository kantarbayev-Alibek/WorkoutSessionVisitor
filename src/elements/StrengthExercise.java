
package elements;

import visitors.ExerciseVisitor;

public class StrengthExercise implements Exercise {
    private final String name;
    private final int weight;
    private final int repetitions;

    public StrengthExercise(String name, int weight, int repetitions) {
        this.name = name;
        this.weight = weight;
        this.repetitions = repetitions;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getRepetitions() {
        return repetitions;
    }

    @Override
    public void accept(ExerciseVisitor visitor) {
        visitor.visitStrengthExercise(this);
    }
}
