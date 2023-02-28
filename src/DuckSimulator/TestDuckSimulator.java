package DuckSimulator;

public class TestDuckSimulator {
	public static void main(String[] args) {

		Duck marllard = new MarllardDuck();
		Duck rubber = new RubberDuck();
		Duck redhead = new RedHeadDuck();
		Duck decoy = new DecoyDuck();
		
		marllard.performFly();
		marllard.performQuack();
		marllard.display();
		
		rubber.performFly();
		rubber.performQuack();
		rubber.display();
		
		redhead.performFly();
		redhead.performQuack();
		redhead.display();
		
		decoy.performFly();
		decoy.performQuack();
		decoy.display();
	
	}
}
