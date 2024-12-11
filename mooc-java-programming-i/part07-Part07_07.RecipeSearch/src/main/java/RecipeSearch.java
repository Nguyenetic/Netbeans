import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {
    private List<Recipe> recipes;

    public RecipeSearch() {
        this.recipes = new ArrayList<>();
    }

    public void readRecipesFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }
                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                List<String> ingredients = new ArrayList<>();
                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findByName(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(recipe);
            }
        }
    }

    public void findByCookingTime(int maxCookingTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeSearch recipeSearch = new RecipeSearch();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        recipeSearch.readRecipesFromFile(fileName);

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipeSearch.listRecipes();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                recipeSearch.findByName(name);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.parseInt(scanner.nextLine());
                recipeSearch.findByCookingTime(maxTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeSearch.findByIngredient(ingredient);
            } else {
                System.out.println("Unknown command");
            }
        }

        scanner.close();
    }
}
