package Pizza.Abstract;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new CheesePizza();
        else if(type.equals("clam"))
            return new ClamPizza();
        else if(type.equals("peperoni"))
            return new PeperoniPizza();
        else if(type.equals("veggie"))
            return new VeggiePizza();
        else return null;
    }
}
