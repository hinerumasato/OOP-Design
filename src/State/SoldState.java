package State;

public class SoldState implements State {

    private GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        if(gumBallMachine.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
        else gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

}
