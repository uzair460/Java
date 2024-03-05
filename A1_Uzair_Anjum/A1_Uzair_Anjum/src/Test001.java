/**
 * Test class for creating and manipulating Appointment objects.
 */
public class Test001 {
    /**
     * The main method for demonstrating the creation and manipulation of Appointment objects.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a MeetingRoom object
        MeetingRoom meetingRoomA = new MeetingRoom("B1-05");

        // Create an original Appointment object
        Appointment originalAppointment = new Appointment("John Doe", "Discuss project", new Date(16, 10, 2023), new Time(14, 30), meetingRoomA);

        // Display the original appointment
        System.out.println("Original Appointment:");
        System.out.println(originalAppointment);

        // Perform shallow copying by creating a new appointment with the same reference to the meeting room
        Appointment copiedAppointment = new Appointment(originalAppointment);

        // Update the copied appointment's attributes
        copiedAppointment.setName("Jane Smith");
        copiedAppointment.setPurpose("Review documents");
        copiedAppointment.getDate().setDay(17);
        copiedAppointment.getTime().setHour(10);

        // Change the room in the copied appointment (shallow copy)
        MeetingRoom meetingRoomB = new MeetingRoom("C2-08");
        copiedAppointment.setRoom(meetingRoomB);

        // Display the copied appointment
        System.out.println("\nCopied Appointment (with updated attributes):");
        System.out.println(copiedAppointment);

        // Display the original appointment to show that it remained unchanged
        System.out.println("\nOriginal Appointment (unchanged):");
        System.out.println(originalAppointment);
    }
}

