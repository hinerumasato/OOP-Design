package BTOn.ClockTime;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

public class ClockTime implements Observable {
   private Timer timer;
   private int hour;
   private int minute;
   private int second;
   private List<Observer> observers;

   public ClockTime(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
      timer = new Timer(1000, new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            tick();
         }
      });
      this.observers = new ArrayList<Observer>();
      timer.start();
   }

   public void tick() {
      second++;
      if ((second %= 60) == 0)
         minute++;
      if ((minute %= 60) == 0)
         hour++;
      hour %= 24;

      notifyAllObserver();
   }

   public int getHour() {
      return hour;
   }

   public int getMinute() {
      return minute;
   }

   public int getSecond() {
      return second;
   }

   @Override
   public void registerObserver(Observer o) {
      if(!observers.contains(o))
         observers.add(o);
   }
   
   @Override
   public void removeObserver(Observer o) {
      if(observers.contains(o))
         observers.remove(o);
   }
   
   @Override
   public void notifyAllObserver() {
      for(Observer observer : observers)
         observer.update(this);
   }
}
