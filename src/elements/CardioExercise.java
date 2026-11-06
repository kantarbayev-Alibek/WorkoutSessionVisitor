
package elements;

import visitors.ExerciseVisitor;

public class CardioExercise implements Exercise {
    private final String name;
    private final int duration;
    private final double distance;

    public CardioExercise(String name, int duration, double distance) {
        this.name = name;
        this.duration = duration;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void accept(ExerciseVisitor visitor) {
        visitor.visitCardioExercise(this);
    }
}
