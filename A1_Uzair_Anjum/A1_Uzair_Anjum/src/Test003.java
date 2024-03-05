import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Test class for creating, sorting, and searching Appointment objects in ArrayList and array structures.
 */
public class Test003 {
    /**
     * The main method for demonstrating the creation, sorting, and searching of Appointment objects.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an ArrayList of Appointment objects
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create Appointment objects
        Appointment appointment1 = new Appointment("John Doe", "Discuss project", new Date(16, 10, 2023), new Time(14, 30), new MeetingRoom("B1-05"));
        Appointment appointment2 = new Appointment("Jane Smith", "Review documents", new Date(17, 10, 2023), new Time(10, 15), new MeetingRoom("C2-08"));
        Appointment appointment3 = new Appointment("Alice Johnson", "Team meeting", new Date(16, 10, 2023), new Time(13, 45), new MeetingRoom("A3-12"));

        // Add appointments to the ArrayList
        appointments.add(appointment1);
        appointments.add(appointment2);
        appointments.add(appointment3);

        // Create an array of Appointment objects
        Appointment[] appointmentArray = new Appointment[appointments.size()];

        // Copy appointments from the ArrayList to the array
        appointments.toArray(appointmentArray);

        // Sort the ArrayList in chronological order
        Collections.sort(appointments);

        // Sort the array in chronological order
        Arrays.sort(appointmentArray, 0, appointments.size());

        // Display sorted appointments from the ArrayList using a for-each loop
        System.out.println("Sorted Appointments in ArrayList:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }

        // Display sorted appointments from the array
        System.out.println("\nSorted Appointments in Array:");
        for (Appointment appointment : appointmentArray) {
            System.out.println(appointment);
        }

        // Now, search for objects in both the array and ArrayList
        Appointment searchAppointment = appointment1; // Replace with the actual search object
        Appointment searchAppointmentClone = appointment2; // Replace with the actual search object

        // Search for objects in the ArrayList
        boolean foundInArrayList = appointments.contains(searchAppointment);
        boolean foundCloneInArrayList = appointments.contains(searchAppointmentClone);

        // Search for objects in the array
        boolean foundInArray = false;
        boolean foundCloneInArray = false;

        for (int i = 0; i < appointments.size(); i++) {
            if (appointmentArray[i] == searchAppointment) {
                foundInArray = true;
            }

            if (appointmentArray[i] == searchAppointmentClone) {
                foundCloneInArray = true;
            }
        }

        if (foundInArrayList) {
            System.out.println("searchAppointment found in the ArrayList.");
        } else {
            System.out.println("searchAppointment not found in the ArrayList.");
        }

        if (foundCloneInArrayList) {
            System.out.println("searchAppointmentClone found in the ArrayList.");
        } else {
            System.out.println("searchAppointmentClone not found in the ArrayList.");
        }

        if (foundInArray) {
            System.out.println("searchAppointment found in the array.");
        } else {
            System.out.println("searchAppointment not found in the array.");
        }

        if (foundCloneInArray) {
            System.out.println("searchAppointmentClone found in the array.");
        } else {
            System.out.println("searchAppointmentClone not found in the array.");
        }
    }
}
