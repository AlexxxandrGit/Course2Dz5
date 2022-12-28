package product;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        // 2.8 Коллекции.2 урок.
        //Домашнее задание - 1.
        System.out.println("Домашнее задание - 1.");
        System.out.println();

        Set<Product> productsList1 = new HashSet<Product>();
        Product apple = new Product("Яблоко", 5000, 54);
        Product orange = new Product("Апельсин", 5000, 54);
        Product mango = new Product("Манго", 5000, 54);


        Set<Product> productsList2 = new HashSet<Product>();
        Product apple2 = new Product("Яблоко2", 5000, 54);
        Product orange2 = new Product("Апельсин2", 5000, 54);
        Product mango2 = new Product("Манго2", 5000, 54);


        productsList1.add(apple);
        productsList1.add(mango);
        productsList1.add(mango);
        productsList1.add(apple);

        productsList2.add(apple2);
        productsList2.add(mango2);
        productsList2.add(mango2);
        productsList2.add(apple2);


        System.out.println(productsList2);


        //Домашнее задание - 2.1
        System.out.println("Домашнее задание - 2.1");
        System.out.println();

        Set<Recipe> recipes = new HashSet<Recipe>();
        recipes.add(
                new Recipe(apple, 2000, "Сок")
        );
        recipes.add(
                new Recipe(apple, 200, "Джем")
        );

        RecipeList recipeList = new RecipeList(recipes);

        System.out.println(recipeList);


        //Домашнее задание - 2.2
        System.out.println("Домашнее задание - 2.2");
        System.out.println();


        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 20) {
            numbers.add((random.nextInt(999 + 1) + 1));
        }

        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);


    }


}