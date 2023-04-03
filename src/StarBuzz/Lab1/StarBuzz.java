package StarBuzz.Lab1;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage decafWithMilk = new Decaf();
        decafWithMilk.setMilk();
        System.out.println(decafWithMilk.cost());
    }
}
