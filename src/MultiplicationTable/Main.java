package MultiplicationTable;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();

        Set<Exercise> exercises = new HashSet<>();

        while (exercises.size() < 15) {
            Exercise exercise = new Exercise((random.nextInt(7 + 1) + 2), (random.nextInt(7 + 1) + 2));


            exercises.add(exercise);
            System.out.println(exercise);

        }

    }


}
