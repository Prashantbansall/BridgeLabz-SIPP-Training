// package Generics.AI-Driven-Resume-Screening-System;

import java.util.*;

// Abstract base class
abstract class JobRole {
    String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public abstract void evaluate();
}

// Concrete job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(candidateName + " evaluated for Software Engineer role.");
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(candidateName + " evaluated for Data Scientist role.");
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(candidateName + " evaluated for Product Manager role.");
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void process() {
        jobRole.evaluate();
    }

    public T getJobRole() {
        return jobRole;
    }
}

// Main class
public class ResumeScreeningSystem {

    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.evaluate();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

        System.out.println("=== AI-Driven Resume Screening System ===");

        while (true) {
            System.out.print("\nEnter candidate name (or type 'exit' to stop): ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) break;
            if (name.isEmpty()) {
                System.out.println("❌ Name cannot be empty. Try again.");
                continue;
            }

            System.out.println("Select job role:");
            System.out.println("1. Software Engineer");
            System.out.println("2. Data Scientist");
            System.out.println("3. Product Manager");
            System.out.print("Enter choice (1-3): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid number. Try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    resumeList.add(new Resume<>(new SoftwareEngineer(name)));
                    break;
                case 2:
                    resumeList.add(new Resume<>(new DataScientist(name)));
                    break;
                case 3:
                    resumeList.add(new Resume<>(new ProductManager(name)));
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please select between 1 and 3.");
            }
        }

        if (resumeList.isEmpty()) {
            System.out.println("\n⚠️ No resumes to process.");
        } else {
            System.out.println("\n✅ Processing Resumes:");
            for (Resume<? extends JobRole> resume : resumeList) {
                resume.process();
            }

            System.out.println("\n📋 Screening via wildcard method:");
            List<JobRole> jobRoles = new ArrayList<>();
            for (Resume<? extends JobRole> resume : resumeList) {
                jobRoles.add(resume.getJobRole());
            }
            screenResumes(jobRoles);
        }

        scanner.close();
    }
}
