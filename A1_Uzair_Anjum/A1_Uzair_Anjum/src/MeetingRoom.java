/**
 * Represents a meeting room in a specific format.
 */
public class MeetingRoom implements Cloneable, Comparable<MeetingRoom> {
    private String room; // Room in String format, e.g., "B1-05" or "C2-08" or "T4-34"

    // Default constructor
    public MeetingRoom() {
        this.room = "Unassigned"; // Default to "Unassigned" if not specified
    }

    /**
     * Parameter constructor.
     *
     * @param room The room in a specific format.
     */
    public MeetingRoom(String room) {
        this.room = room;
    }

    // ... (Other methods and constructors)

    // toString method to return the room string
    @Override
    public String toString() {
        return room;
    }

    // Clone method for deep copying
    @Override
    public MeetingRoom clone() {
        try {
            return (MeetingRoom) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen
        }
    }

    // Compare meeting rooms for natural ordering (room names as strings)
    @Override
    public int compareTo(MeetingRoom otherRoom) {
        return this.room.compareTo(otherRoom.room);
    }

    /**
     * Split the room string into parts.
     *
     * @param string The room string to split.
     * @return An array of strings containing the split parts.
     */
    public String[] split(String string) {
        return null;
    }

    }

