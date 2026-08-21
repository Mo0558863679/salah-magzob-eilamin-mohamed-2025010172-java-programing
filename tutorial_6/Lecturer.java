public class Lecturer extends Employee {

    private String subject;

    public Lecturer(String id, String name, String subject, String department) {
        super(id, name, department);
        this.subject = subject;
    }

    public void displaySubject() {
        System.out.println("Subject     : " + subject);
    }
}