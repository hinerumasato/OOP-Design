package BTOn.ComponentEncryption;

public interface Component {
    public void input(String data);
    public void process();
    public void setEncryptComponent(Enryptable ... enryptables);
    public String getResult();
}
