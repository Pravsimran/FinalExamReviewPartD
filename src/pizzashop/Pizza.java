public class Pizza {
    public int bakeTemp = 100; // Temp to bake at
    private ArrayList<String> ingredients = new ArrayList<>();

    public void bake(int temp) {
        bakeTemp = temp;
        // Common baking functionality here
    }

    public void addTopping(String topping) {
        ingredients.add(topping);
    }
}
