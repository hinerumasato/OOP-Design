package Pizza.Method;

public class TestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        System.out.println(pizzaStore.createPizza("cheese").toString());

        pizzaStore = new ChicagoStylePizzaStore();
        System.out.println(pizzaStore.createPizza("cheese").toString());
    }
}
