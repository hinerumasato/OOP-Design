package DuckSimulator;

public class DecoyDuck extends Duck {
	
	public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("Decoy Duck");
	}

}
