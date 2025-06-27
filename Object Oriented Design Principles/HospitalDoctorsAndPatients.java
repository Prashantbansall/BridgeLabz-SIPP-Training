package objectOrientedDesignPrinciples;
import java.util.ArrayList;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void getConsulted(Doctor doctor) {
        System.out.println(name + " is consulting Dr. " + doctor.name);
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    void consult(Patient p) {
        patients.add(p);
        p.getConsulted(this);
    }

    void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void showHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.name);
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

public class HospitalDoctorsAndPatients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital("CityCare Hospital");

        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Johnson");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.showHospitalInfo();

        d1.showPatients();
        d2.showPatients();
	}

}
