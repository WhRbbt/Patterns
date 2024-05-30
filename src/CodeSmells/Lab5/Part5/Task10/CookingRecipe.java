package CodeSmells.Lab5.Part5.Task10;

public class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    public void addIngredients() {
        System.out.println("Adding ingredients");
    }

    public void cook() {
        System.out.println("Cooking");
    }

    public void serve() {
        System.out.println("Serving");
    }
}
