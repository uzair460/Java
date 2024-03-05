/**
 * Represents a date with day, month, and year components.
 */
public class Date implements Cloneable, Comparable<Date> {
    private int day;   // day of the month (1-31)
    private int month; // month of the year (1-12)
    private int year;  // year (e.g., 2008)

    /**
     * Default constructor for creating a Date object.
     * Initializes the date to January 1, 2000.
     */
    public Date() {
        this.day = 1;     // Default day is 1
        this.month = 1;   // Default month is January (1)
        this.year = 2000; // Default year is 2000
    }

    /**
     * Parameterized constructor for creating a Date object.
     *
     * @param day   The day of the month (1-31).
     * @param month The month of the year (1-12).
     * @param year  The year (e.g., 2008).
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Copy constructor for creating a Date object as a shallow copy of another Date object.
     *
     * @param other Another Date object to copy.
     */
    public Date(Date other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    /**
     * Setter method for setting the day of the month.
     *
     * @param day The day to set (1-31).
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Getter method for retrieving the day of the month.
     *
     * @return The day component of the Date object.
     */
    public int getDay() {
        return day;
    }

    /**
     * Setter method for setting the month of the year.
     *
     * @param month The month to set (1-12).
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Getter method for retrieving the month of the year.
     *
     * @return The month component of the Date object.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Setter method for setting the year.
     *
     * @param year The year to set (e.g., 2008).
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter method for retrieving the year.
     *
     * @return The year component of the Date object.
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns a formatted string representation of the date in "dd/MM/yyyy" format.
     *
     * @return A string representing the date in the specified format.
     */
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    /**
     * Creates a deep copy (clone) of the Date object.
     *
     * @return A new Date object with a deep copy of the day, month, and year.
     */
    @Override
    public Date clone() {
        try {
            return (Date) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen
        }
    }

    /**
     * Compares dates for natural ordering based on years, months, and days.
     *
     * @param otherDate Another Date object to compare to.
     * @return A negative integer, zero, or a positive integer as this date is earlier than, equal to, or later than the other date.
     */
    @Override
    public int compareTo(Date otherDate) {
        // Compare years, months, and days
        if (this.year != otherDate.year) {
            return this.year - otherDate.year;
        }
        if (this.month != otherDate.month) {
            return this.month - otherDate.month;
        }
        return this.day - otherDate.day;
    }
}
