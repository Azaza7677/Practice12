package Practise12;

public class Student {
    String name;
    double currentScholarship;
    double NewScholarship;
    public Student(String name, double currentScholarship, double NewScholarship) {
        this.name = name;
        this.currentScholarship=currentScholarship;
        this.NewScholarship=NewScholarship;
    }

    public String getName() {
        return name;
    }

    public double getCurrentScholarship() {
        return currentScholarship;
    }

    public double getNewScholarship() {
        return NewScholarship;
    }

    public double getScholarshipIncrease(){
        return currentScholarship-NewScholarship;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", currentScholarship=" + currentScholarship + ", NewScholarship=" + NewScholarship + '}';
    }
}
