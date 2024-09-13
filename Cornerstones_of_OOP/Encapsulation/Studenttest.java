package Cornerstones_of_OOP.Encapsulation;

public class Studenttest {
    public static void main(String[] args) {
        Student student1 = new Student("Stacy June Munene", 400596);

        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentID());

        student1.addGrade(78);
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(95);
        student1.addGrade(88);

        student1.avgGrade();
        student1.displayGrades();


        Student student2 = new Student("Declan Munene", 4000560);

        System.out.println(student2.getStudentID());
        System.out.println(student2.getStudentName());

        student2.addGrade(67);
        student2.addGrade(90);
        student2.addGrade(85);
        student2.addGrade(95);
        student2.addGrade(88);

        student2.avgGrade();
        student2.displayGrades();
    }
}
