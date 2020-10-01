package programminglanguage2september;


/**
 *
 * @author cacousins
 */
public class Date {

    private int year;
    private int month;
    private int day;

    //create constructor
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //create getters/setters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%4d", month, day, year);
         // MM/DD/YYY -01/01/2020
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

}
