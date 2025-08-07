import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void registerPatient(Patient patient) {
        patients.add(patient);
    }

    public void createAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void listAppointments() {
        for (Appointment appointment : appointments) {
            System.out.println("Appointment ID: " + appointment.getAppointmentId() +
                    ", Patient: " + appointment.getPatient().getName() +
                    ", Doctor: " + appointment.getDoctor().getName() +
                    ", DateTime: " + appointment.getDateTime());
        }
    }
}