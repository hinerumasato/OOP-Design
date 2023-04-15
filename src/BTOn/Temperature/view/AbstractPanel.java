package BTOn.Temperature.view;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BTOn.Temperature.controller.ButtonController;
import BTOn.Temperature.controller.TextFieldController;
import BTOn.Temperature.model.Observer;
import BTOn.Temperature.model.WeatherData;

public abstract class AbstractPanel extends JPanel implements Observer {

    protected String ABSTRACT_PANEL_TITLE = "Abstract Temperature";
    protected JTextField temperatureTextField;
    protected JButton raiseButton;
    protected JButton lowerButton;
    protected ButtonController buttonController;
    protected TextFieldController textFieldController;
    protected WeatherData weatherData;

    public AbstractPanel() {
        awake();
        init();
        addEvents();
    }

    public AbstractPanel(WeatherData weatherData, String title) {
        this.ABSTRACT_PANEL_TITLE = title;
        this.weatherData = weatherData;
        awake();
        init();
        addEvents();
    }
    
    public void awake() {
        this.temperatureTextField = new JTextField(10);
        this.raiseButton = new JButton("Raise");
        this.lowerButton = new JButton("Lower");
    }
    
    public void addEvents() {
        this.raiseButton.addActionListener(buttonController);
        this.lowerButton.addActionListener(buttonController);
        this.temperatureTextField.addActionListener(textFieldController);
    }
    
    public void init() {
        setBorder(BorderFactory.createTitledBorder(ABSTRACT_PANEL_TITLE));
        setLayout(new GridLayout(2, 1));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(raiseButton);
        buttonPanel.add(lowerButton);
        
        this.weatherData.registerObserver(this);
        add(temperatureTextField);
        add(buttonPanel);
    }

    public void setTemperatureTextFieldContent(String content) {
        this.temperatureTextField.setText(content);
    }
}
