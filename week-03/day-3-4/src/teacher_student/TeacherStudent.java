package teacher_student;

public class TeacherStudent {
    public static void main(String[] args) {
//        Create Student and Teacher classes
//                Student
//        learn() -> prints the student is learning something new
//                question(teacher) -> calls the teachers answer method
//                Teacher
//        teach(student) -> calls the students learn method
//        answer() -> prints the teacher is answering a question
//        Instantiate a Student and Teacher object
//        Call the student's question() method and the teacher's teach() method

        Student jozsika = new Student();
        Teacher mathTeacher = new Teacher();

        jozsika.question(mathTeacher);
        mathTeacher.teach(jozsika);


    }
}
