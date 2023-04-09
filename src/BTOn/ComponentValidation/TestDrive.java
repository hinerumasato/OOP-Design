package BTOn.ComponentValidation;

public class TestDrive {
    public static void main(String[] args) {
        Component textComponent = new TextComponent("0838182039");
        textComponent.setComponentRules(new EmailValidator(), new PhoneValidator(), new NumberValidator());
        textComponent.validate();
    }
}
