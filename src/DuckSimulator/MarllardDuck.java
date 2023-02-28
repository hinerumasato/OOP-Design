package DuckSimulator;

public class MarllardDuck extends Duck {

	public MarllardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	public MarllardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Marllard Duck");
	}
	
}
