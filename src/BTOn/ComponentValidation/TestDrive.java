package BTOn.ComponentValidation;

public class TestDrive {
    public static void main(String[] args) {
        Component textComponent = new TextComponent("0838182039");
        textComponent.setComponentRules(new EmailValidation(), new PhoneValidation(), new NumberValidation());
        textComponent.validate();

        Component numberComponent = new NumberComponent(236);
        numberComponent.setComponentRules(new MinMaxValidation(100, 300));
        numberComponent.validate();
    }
}
