package day_40;

public class StudentObject {
    public static void main(String[] args) {

        Student student = new Student("Cornelia", 18);
        student.display();
        student.callDisplay();

        Student student2 = new Student(25);
        System.out.println(student.name);
        System.out.println(student.age);


    }
}
