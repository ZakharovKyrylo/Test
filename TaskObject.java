package Lection;

public class TaskObject {

    public static void main(String[] args) {

        Object[] unit = {
                new Person1("Coach Bob", 27, "M"),
                new Student1("Lynne Brooke", 16, "F", "HS95129", 3.5),
                new Student1("Lynne1 Brooke", 126, "M", "HS91229", 4.1),
                new Teacher1("Duke Java", 34, "M", "Computer Science", 50000.0),
                new ColledgeStudent1("Ima Frosh", 18, "F", "UCB123", 4.0, 1, " English")};


        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i].toString());
        }
    }
}



class Person1 {

    private String name;
    private int age;
    private String gender;

    Person1(String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return getName() + ", age:  " + getAge()+ ", gender: " + getGender();
    }
}


class Teacher1 extends Person1 {
    private String subject;
    private double salary;

    Teacher1(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.setSalary(salary);
        this.setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getName()+ ", age: " + getAge() + ", gender: " + getGender()
                + ", subject: " + getSubject() + ", salary: " + getSalary();
    }
}

class Student1 extends Person1{

    private String idNumber;
    private double gpa;

    Student1(String name, int age, String gender,String idNumber, double gpa) {
        super(name, age, gender);
        this.setGpa(gpa);
        this.setIdNumber(idNumber);
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return getName() + ", age: " + getAge() + ", gender: " + getGender()
                + ", student id: " + getIdNumber() + ", gpa: " + getGpa();
    }
}
class ColledgeStudent1 extends Student1{

    private int year;
    private String major;

    ColledgeStudent1(String name, int age, String gender, String idNumber, double gpa,int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.setMajor(major);
        this.setYear(year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return getName()+ ", age: " + getAge() + ", gender: " + getGender() + ", student id: "
                + getIdNumber() + ", gpa: " + getGpa() + ", year: " + getYear()+ ", major: " + getMajor();
    }
}