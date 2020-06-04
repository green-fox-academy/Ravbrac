package teacher_student;

public class Student {

//    Student
//    learn() -> prints the student is learning something new
//    question(teacher) -> calls the teachers answer method

    public void learn(){
        System.out.println("The student is learning something new");
    }

    public void question(Teacher teacher){
        teacher.answer();
    }
}
