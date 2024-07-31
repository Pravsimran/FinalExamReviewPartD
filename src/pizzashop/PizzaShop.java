public class PizzaShop {

    public static PizzaCutter pizzaCutter = PizzaCutter.getInstance(); // Singleton instance
    private static PizzaFactoryInterface pizzaFactory = new PizzaFactory(); // Use interface

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the pizza shop");
        System.out.println("What kind of pizza do you want?");
        System.out.println("Please enter exactly cheese or pepperoni");
        String type = sc.nextLine();
        Pizza pizza = pizzaFactory.createPizza(type); // Use factory interface
        System.out.println("how many slices would you like?");
        int numSlices = sc.nextInt();
        pizzaCutter.numSlices = numSlices;
        if (pizza != null) {
            System.out.println("Great job, here is your pizza in " + numSlices + " slices");
        } else {
            System.out.println("Enter a valid pizza type so we can cut it next time!");
        }
    }
}
