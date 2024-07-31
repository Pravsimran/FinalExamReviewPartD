public class PizzaCutter {
    private static PizzaCutter instance;
    public int numSlices = 0;

    private PizzaCutter() {
        // Private constructor to prevent instantiation
    }

    public static PizzaCutter getInstance() {
        if (instance == null) {
            instance = new PizzaCutter();
        }
        return instance;
    }
}
