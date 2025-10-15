import java.util.ArrayList;

public class Class {
    private String name;
    private ArrayList<Student> students;

    public Class(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public void listStudent(){
        for(Student students : students){
            System.out.println(students.getName());
        }
    }
}
