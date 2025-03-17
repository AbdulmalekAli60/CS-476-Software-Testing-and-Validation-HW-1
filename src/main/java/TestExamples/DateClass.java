package TestExamples;

import java.time.LocalDate;
import java.util.Date;

public class DateClass {

    int year = 0;
    int month = 0;
    int day = 0;

    public DateClass(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void Date(){ // today
        LocalDate localDate = LocalDate.now();
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public  void addDays(int days){
        if (days == 0) {
            return;
        }

        LocalDate localDate = LocalDate.of(year, month, day);
        localDate = localDate.plusDays(days);

        this.day = localDate.getDayOfMonth();
        this.month = localDate.getMonthValue();
        this.year = localDate.getYear();
    }
    

    public int daysInMonth(){
        LocalDate localDate = LocalDate.now();
        return localDate.lengthOfMonth();
    }

    public String dayOfWeek(){
        LocalDate localDate = LocalDate.of(year,month,day);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; // 0-6
        int day = localDate.getDayOfWeek().getValue() % 7;
        return days[day];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Date otherDate = (Date) obj;
        return year == otherDate.getYear() &&
                month == otherDate.getMonth() &&
                day == otherDate.getDay();
    }

    public boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public void nextDay() {
        day++;
        if (day > daysInMonth()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    @Override
    public String toString() {
        return "DateClass{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
