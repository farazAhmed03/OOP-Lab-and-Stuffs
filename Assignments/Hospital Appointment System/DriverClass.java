import java.time.LocalDateTime;
import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        System.out.println("***************  \t\t Enter Doctor details     \t\t  ************************");
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();
        System.out.print("Enter Doctor Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter Doctor Specialization: ");
        String doctorSpecialization = scanner.nextLine();

        Doctor doctor1 = new Doctor(doctorId, doctorName, doctorSpecialization);
        hospital.addDoctor(doctor1);

        System.out.println("\nEnter Patient details:");
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int patientAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Patient Gender: ");
        String patientGender = scanner.nextLine();

        Patient patient1 = new Patient(patientId, patientName, patientAge, patientGender);
        hospital.registerPatient(patient1);

        System.out.println("\nEnter Appointment details:");
        System.out.print("Enter Appointment ID: ");
        String appointmentId = scanner.nextLine();
        LocalDateTime appointmentTime = LocalDateTime.now(); // Assuming appointment time is current time
        Appointment appointment1 = new Appointment(appointmentId, appointmentTime, doctor1, patient1);
        hospital.createAppointment(appointment1);

        System.out.println("\nList of Appointments:");
        hospital.listAppointments();

        scanner.close();
    }
}
