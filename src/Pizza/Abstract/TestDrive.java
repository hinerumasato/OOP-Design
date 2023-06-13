package Pizza.Abstract;

public class TestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        System.out.println(pizzaStore.orderPizza("cheese").toString());
    }
}
