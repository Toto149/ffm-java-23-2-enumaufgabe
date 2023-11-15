package org.example;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String day;

     DaysOfWeek(String day){
        this.day = day;
    }
    public String weekDayAsString(){
        switch (this){
            case MONDAY -> {
                return "Monday";
            }
            case TUESDAY -> {
                return "Tuesday";
            }
            case WEDNESDAY -> {
                return "Wednesday";
            }
            case THURSDAY -> {
                return "Thursday";
            }
            case FRIDAY -> {
                return "Friday";
            }
        }
        return "Weekend";
    }

    public String getWeekday(){
         if(this.day=="Saturday"||this.day=="Sunday") return "Weekend";
         return this.day;
    }
}
