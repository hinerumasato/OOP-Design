package BTOn.EncryptComponent;

import java.util.ArrayList;
import java.util.List;

public class MyComponent implements Component {

    private String data;
    private List<Enryptable> enryptables;
    

    public MyComponent() {
        this.enryptables = new ArrayList<Enryptable>();
    };

    @Override
    public void setEncryptComponent(Enryptable ... encrypts) {
        this.enryptables = new ArrayList<Enryptable>();
        for(Enryptable encrypt : encrypts)
            this.enryptables.add(encrypt);
    }

    @Override
    public void input(String data) {
        this.data = data;
        process();
    }

    @Override
    public void process() {
        for(Enryptable encrypt : enryptables)
            data = encrypt.encrypt(data);
    }

    @Override
    public String getResult() {
        return data;
    }
    
}
