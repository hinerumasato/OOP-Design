package BTOn.ComponentValidation;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    protected Object data;
    protected List<Validator> rules;

    public Component(Object data) {
        this.data = data;
        this.rules = new ArrayList<Validator>();
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void addRule(Validator rule) {
        this.rules.add(rule);
    }

    public void setComponentRules(Validator... rules) {
        for (Validator rule : rules)
            this.addRule(rule);
    }

    public void validate() {
        for (Validator rule : this.rules) {
            System.out.println(rule.getClass().getName() + ": " + rule.validate(this.data));
        }
    }

}