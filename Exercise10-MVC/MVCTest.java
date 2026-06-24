public class MVCTest {

    public static void main(String[] args) {

        Student student =
                new Student(
                        "Indu",
                        101,
                        "A"
                );

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(
                        student,
                        view
                );

        controller.updateView();

        System.out.println();

        controller.setStudentName("Parimala");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}