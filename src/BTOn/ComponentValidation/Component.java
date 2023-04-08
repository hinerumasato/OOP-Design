package BTOn.ComponentValidation;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    
    protected Object data;
    protected List<Validation> rules;

    public Component(Object data) {
        this.data = data;
        this.rules = new ArrayList<Validation>();
    }

    public void addRule(Validation rule) {
        this.rules.add(rule);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setComponentRules(Validation ...rules) {
        for(Validation rule : rules)
            this.addRule(rule);
    }

    public void validate() {
        for(Validation rule : this.rules) {
            System.out.println(rule.getClass().getName() + ": " + rule.validate(this.data));
        }
    }

}