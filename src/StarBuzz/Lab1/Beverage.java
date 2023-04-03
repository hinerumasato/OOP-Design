package StarBuzz.Lab1;

public abstract class Beverage {
    protected String description;
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk() {
        this.milk = true;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy() {
        this.soy = true;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha() {
        this.mocha = true;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip() {
        this.whip = true;
    }

    public double cost() {

        double cost = 0;

        if(isMilk()) cost += 0.1;
        if(isMocha()) cost += 0.15;
        if(isSoy()) cost += 0.2;
        if(isWhip()) cost += 0.1;

        return cost;
    }

}
