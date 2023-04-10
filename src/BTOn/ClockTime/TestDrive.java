package BTOn.ClockTime;

import java.util.Date;

import javax.swing.JFrame;

public class TestDrive {
   public static void main(String[] args) {
      JFrame frame1 = new JFrame("Digital Clock");
      JFrame frame2 = new JFrame("Analog Clock");
      Date date = new Date();
      ClockTime clock = new ClockTime(date.getHours(), date.getMinutes(), date.getSeconds());
      DigitalClock digitalClock = new DigitalClock(clock);
      AnalogClock analogClock = new AnalogClock(clock);
      
      frame1.setSize(100, 70);
      frame1.setContentPane(digitalClock);
      frame1.setLocationRelativeTo(null);
      frame2.setSize(100, 150);
      frame2.setContentPane(analogClock);
      frame1.setVisible(true);
      frame2.setVisible(true);

      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
