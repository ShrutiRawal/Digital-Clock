import java.util.*;
public class BaseThread extends Thread{ // this will run continuously in background
    Clock clock;
    String time;
    public BaseThread(Clock clock) {
        this.clock = clock;
        start();  //starts execution of thread
    }
    public void run (){
       while(true){
          time =""+new Date();  //sets current date and time 
          clock.digitalClock.setText(time);  
       }       
    }
}