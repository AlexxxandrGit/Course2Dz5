package MultiplicationTable;

import java.util.Objects;

public class Exercise {
    private final int a;
    private final int b;

    public Exercise(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return a == exercise.a && b == exercise.b || a == exercise.b && b == exercise.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a) + Objects.hash(b);
    }

    @Override
    public String toString() {
        return a + " + " + b + " = ?";
    }
}
