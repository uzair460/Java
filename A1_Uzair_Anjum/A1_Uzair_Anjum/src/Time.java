/**
 * Represents a time of day in the format of hours and minutes.
 */
public class Time implements Cloneable, Comparable<Time> {
    private int hour;    // hour in the day (0-23)
    private int minute;  // minute within the hour (0-59)

    /**
     * Default constructor for a Time object.
     * Initializes the time with 0 hours and 0 minutes.
     */
    public Time() {
        this.hour = 0;     // Default hour is 0
        this.minute = 0;   // Default minute is 0
    }

    /**
     * Parameterized constructor for a Time object.
     *
     * @param hour   The hour (0-23).
     * @param minute The minute (0-59).
     */
    public Time(int hour, int minute) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0; // Default to 0 if the provided hour is out of range
        }

        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0; // Default to 0 if the provided minute is out of range
        }
    }

    /**
     * Copy constructor for a Time object (shallow copy).
     *
     * @param other Another Time object to copy.
     */
    public Time(Time other) {
        this.hour = other.hour;
        this.minute = other.minute;
    }

    /**
     * Setter method for the hour.
     *
     * @param hour The hour to set (0-23).
     */
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    /**
     * Getter method for the hour.
     *
     * @return The hour of the Time object.
     */
    public int getHour() {
        return hour;
    }

    /**
     * Setter method for the minute.
     *
     * @param minute The minute to set (0-59).
     */
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    /**
     * Getter method for the minute.
     *
     * @return The minute of the Time object.
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Returns a formatted string representation of the time in "hh:mm" format.
     *
     * @return A string representing the time.
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    /**
     * Creates a deep copy (clone) of the Time object.
     *
     * @return A new Time object with a deep copy of the hour and minute.
     */
    @Override
    public Time clone() {
        try {
            return (Time) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen
        }
    }

    /**
     * Compares times for natural ordering based on hours and minutes.
     *
     * @param otherTime Another Time object to compare to.
     * @return A negative integer, zero, or a positive integer as this time is less than, equal to, or greater than the other time.
     */
    @Override
    public int compareTo(Time otherTime) {
        // Compare hours and minutes
        if (this.hour != otherTime.hour) {
            return this.hour - otherTime.hour;
        }
        return this.minute - otherTime.minute;
    }
}
