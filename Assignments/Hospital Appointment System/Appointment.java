import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private LocalDateTime dateTime;
    private Doctor doctor;
    private Patient patient;

    public Appointment(String appointmentId, LocalDateTime dateTime, Doctor doctor, Patient patient) {
        this.appointmentId = appointmentId;
        this.dateTime = dateTime;
        this.doctor = doctor;
        this.patient = patient;
    }

    // Getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }
}