

package model;

import java.util.Calendar;

/**
 *
 * @author schereja
 */
public final class WelcomeService {
    private Calendar date = Calendar.getInstance();
    private String timeOfDay;
    private String welcomeMsg;
    public WelcomeService(String name){
        timeOfDay(Calendar.getInstance());
        welcomeMsg(name);
    }
    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
    
    
    public void timeOfDay(Calendar date){
        if(date.get(Calendar.HOUR_OF_DAY) < 12 && date.get(Calendar.MINUTE) >0){
            timeOfDay = "Good Morning, ";
        } else if(date.get(Calendar.HOUR_OF_DAY) >12 && date.get(Calendar.HOUR_OF_DAY) <16){
            timeOfDay = "Good Afternoon, ";
        } else
            timeOfDay = "Good Evening, ";
        
    }
    public String welcomeMsg(String name){
        welcomeMsg = timeOfDay + name + ". Welcome";
        return welcomeMsg;
    }
    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
    
//    public static void main(String[] args) {
//        WelcomeService ws = new WelcomeService("Jason");
//        Calendar date = Calendar.getInstance();
//        ws.timeOfDay(date);
//        
//        System.out.println(ws.welcomeMsg);
//    }
}
