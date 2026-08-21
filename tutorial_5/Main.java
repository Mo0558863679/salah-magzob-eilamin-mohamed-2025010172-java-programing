public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setStudentID("barca56");
        student.setName("salah");
        student.setCGPA(3.75);
        student.setProgramme("BIT");

        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme  : " + student.getProgramme());
    }
}