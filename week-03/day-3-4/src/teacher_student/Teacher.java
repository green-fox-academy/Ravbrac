package teacher_student;

public class Teacher {

//    Teacher
//    teach(student) -> calls the students learn method
//    answer() -> prints the teacher is answering a question

    public void teach(Student student){
        student.learn();
    }

    public void answer(){
        System.out.println("The teacher is answering a question");
    }
}
