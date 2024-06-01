package part5.task10;

 class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }
    private void boilWater() {
        System.out.println("Boiling water");
    }
    private void addIngredients() {
        System.out.println("Adding ingredients");
    }
    private void cook() {
        System.out.println("Cooking");
    }
    private void serve() {
        System.out.println("Serving");
    }
}