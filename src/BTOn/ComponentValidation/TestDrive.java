package BTOn.ComponentValidation;

public class TestDrive {
    public static void main(String[] args) {
        Component textComponent = new TextComponent("0879603547");
        textComponent.setComponentRules(new NumberValidator(), new PhoneValidator());

        Component numberComponent = new NumberComponent(800);

        numberComponent.setComponentRules(new MinMaxValidator(100, 700));
        
        numberComponent.validate();
        textComponent.validate();
    }
}
