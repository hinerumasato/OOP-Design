package DuckSimulator;

public class RubberDuck extends Duck {
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squick();
	}

	@Override
	public void display() {
		System.out.println("Rubber Duck");
	}

}
