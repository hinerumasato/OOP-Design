package Pizza.Method;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if(item.equals("clam"))
            return new ChicagoStyleClamPizza();
        else if(item.equals("peperoni"))
            return new ChicagoStylePepperoniPizza();
        else if(item.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        else return null;
    }
    
}
