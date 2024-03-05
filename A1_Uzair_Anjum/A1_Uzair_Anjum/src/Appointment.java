/**
 * Represents an appointment with details like name, purpose, date, time, and meeting room.
 */
public class Appointment implements Cloneable, Comparable<Appointment> {
    private String name;          // Who to meet
    private String purpose;       // Purpose of appointment
    private Date date;            // Date of appointment
    private Time time;            // Time of appointment
    private MeetingRoom room;     // Where to meet

    /**
     * Default constructor for an appointment.
     * Initializes the appointment with default values.
     */
    public Appointment() {
        this.name = "Unassigned";   // Default name is "Unassigned"
        this.purpose = "Unassigned"; // Default purpose is "Unassigned"
        this.date = new Date();      // Default date is the current date
        this.time = new Time();      // Default time is 00:00 (midnight)
        this.room = new MeetingRoom();// Default room is "Unassigned"
    }

    /**
     * Parameterized constructor for an appointment.
     *
     * @param name    The name of the person to meet.
     * @param purpose The purpose of the appointment.
     * @param date    The date of the appointment.
     * @param time    The time of the appointment.
     * @param room    The meeting room for the appointment.
     */
    public Appointment(String name, String purpose, Date date, Time time, MeetingRoom room) {
        this.name = name;
        this.purpose = purpose;
        this.date = date;
        this.time = time;
        this.room = room;
    }

    /**
     * Copy constructor for an appointment (shallow copy).
     *
     * @param other Another appointment to copy.
     */
    public Appointment(Appointment other) {
        this.name = other.name;
        this.purpose = other.purpose;
        this.date = new Date(other.date);      // Shallow copy of Date object
        this.time = new Time(other.time);      // Shallow copy of Time object
        this.room = new MeetingRoom();// Shallow copy of MeetingRoom object
    }

    // Setter and Getter methods...

    /**
     * Creates a deep copy (clone) of the appointment.
     *
     * @return A new appointment with a deep copy of the date, time, and room.
     */
    @Override
    public Appointment clone() {
        try {
            Appointment clonedAppointment = (Appointment) super.clone();
            clonedAppointment.date = this.date.clone();       // Deep copy Date
            clonedAppointment.time = this.time.clone();       // Deep copy Time
            clonedAppointment.room = this.room.clone();       // Deep copy MeetingRoom
            return clonedAppointment;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen
        }
    }

    /**
     * Compares appointments for natural chronological order.
     *
     * @param otherAppointment Another appointment to compare to.
     * @return A negative integer, zero, or a positive integer as this appointment is less than, equal to, or greater than the other appointment.
     */
    @Override
    public int compareTo(Appointment otherAppointment) {
        // Compare by date and time
        int dateComparison = this.date.compareTo(otherAppointment.date);
        if (dateComparison == 0) {
            return this.time.compareTo(otherAppointment.time);
        }
        return dateComparison;
    }

    /**
     * Returns a formatted string representation of the appointment.
     *
     * @return A string representing the appointment's details.
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Purpose: " + purpose + "\n" +
               "Date: " + date + "\n" +
               "Time: " + time + "\n" +
               "Room: " + room;
    }
/**
 * Sets the name of the person for this appointment.
 *
 * @param name The name of the person for the appointment.
 */
public void setName(String name) {
    this.name = name;
}

/**
 * Sets the purpose of the appointment.
 *
 * @param purpose The purpose of the appointment.
 */
public void setPurpose(String purpose) {
    this.purpose = purpose;
}

/**
 * Sets the date of the appointment.
 *
 * @param date The date of the appointment.
 */
public void setDate(Date date) {
    this.date = date;
}

/**
 * Sets the time of the appointment.
 *
 * @param time The time of the appointment.
 */
public void setTime(Time time) {
    this.time = time;
}

/**
 * Sets the meeting room for the appointment.
 *
 * @param room The meeting room for the appointment.
 */
public void setRoom(MeetingRoom room) {
    this.room = room;
}

/**
 * Gets the date of the appointment.
 *
 * @return The date of the appointment.
 */
public Date getDate() {
    return date;
}

/**
 * Gets the time of the appointment.
 *
 * @return The time of the appointment.
 */
public Time getTime() {
    return time;
}

}
