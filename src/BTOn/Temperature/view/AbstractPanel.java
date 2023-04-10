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
    protected Temperature temperature;
    protected WeatherData weatherData;

    public AbstractPanel() {
        awake();
        init();
        addEvents();
        this.weatherData.registerObserver(this);
    }

    public AbstractPanel(WeatherData weatherData, String title) {
        this.ABSTRACT_PANEL_TITLE = title;
        this.weatherData = weatherData;
        awake();
        init();
        addEvents();
        this.weatherData.registerObserver(this);
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

        add(temperatureTextField);
        add(buttonPanel);
    }

    public void setTemperatureTextFieldContent(String content) {
        this.temperatureTextField.setText(content);
    }

    public String getABSTRACT_PANEL_TITLE() {
        return ABSTRACT_PANEL_TITLE;
    }

    public void setABSTRACT_PANEL_TITLE(String aBSTRACT_PANEL_TITILE) {
        ABSTRACT_PANEL_TITLE = aBSTRACT_PANEL_TITILE;
    }

    public JTextField getTemperatureTextField() {
        return temperatureTextField;
    }

    public void setTemperatureTextField(JTextField temperatureTextField) {
        this.temperatureTextField = temperatureTextField;
    }

    public JButton getRaiseButton() {
        return raiseButton;
    }

    public void setRaiseButton(JButton raiseButton) {
        this.raiseButton = raiseButton;
    }

    public JButton getLowerButton() {
        return lowerButton;
    }

    public void setLowerButton(JButton lowerButton) {
        this.lowerButton = lowerButton;
    }

    public ButtonController getButtonController() {
        return buttonController;
    }

    public void setButtonController(ButtonController buttonController) {
        this.buttonController = buttonController;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
