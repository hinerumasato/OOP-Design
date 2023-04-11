package BTOn.ComponentEncryption;

public class TestDrive {
    public static void main(String[] args) {
        Component component = new MyComponent();
        component.setEncryptComponent(new CaesarCipherEncrypt(), new ReverseEncrypt());

        component.input("I'm a student");
        System.out.println(component.getResult());
    }
}
