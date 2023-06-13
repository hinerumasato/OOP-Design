package Pizza.Abstract;

public class PizzaStore {
    private SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    } 
}
