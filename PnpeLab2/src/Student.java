public class Student extends Person{
    private double grade;

    public Student(String name, int age, double grade){
        super(name,age);
        this.grade=grade;
    }

    public double getGrade(){
        return grade;
    }

    public void setGrade(){
        this.grade=grade;
    }
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old and my grade is " + grade + " .");
    }
}
