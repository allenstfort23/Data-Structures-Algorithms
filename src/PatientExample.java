import java.util.PriorityQueue;
public class PatientExample {
    public static void main(String[] args) {
        Patient er1 = new Patient(4, "Vinnie Pinatino", "Broken Nose");
        Patient er2 = new Patient(1, "Gabe Scholamachia", "Chest Pain");
        Patient er3 = new Patient(3, "Margaret Sinpliny", "Broken Leg");
        Patient er4 = new Patient(5, "Walter Comettenin", "Broken Finger");
        Patient er5 = new Patient(2, "Cynthia Bittonnia", "Shortness of Breath");

        PriorityQueue<Patient> theER = new PriorityQueue<>();

        theER.add(er1);
        theER.add(er2);
        theER.add(er3);
        theER.add(er4);
        theER.add(er5);

        for (Patient iterate: theER) { System.out.println(iterate); }

        System.out.println(theER.remove() + " Was Seen and removed");
        System.out.println("There are " + theER.size() + " patients in queue.");
    }
}
