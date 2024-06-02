package part5.task10;

public abstract class CookingRecipe {
    public final void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void addIngredients();

    protected abstract void cook();

    private void serve() {
        System.out.println("Serving");
    }
}
