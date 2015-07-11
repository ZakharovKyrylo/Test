package Lection;

public class Task {

    public static void main(String[] args) {

        Person person = new Person("Coach Bob",27,"M");
        Student student=new Student("Lynne Brooke",16,"F","HS95129",3.5);
        Teacher teachers=new Teacher("Duke Java",34, "M", "Computer Science", 50000.0);
        ColledgeStudent colledgeStudents=new ColledgeStudent("Ima Frosh",18,"F","UCB123", 4.0,1, " English" );


//        Person[] person =new Person[10];
//        person[0]= new Person("Coach Bob",27,"M");
//        Student[] student=new Student[10];
//        student[0]=new Student("Lynne Brooke",16,"F","HS95129",3.5);
//        Teacher[] teachers=new Teacher[10];
//        teachers[0]=new Teacher("Duke Java",34, "M", "Computer Science", 50000.0);
//        ColledgeStudent[] colledgeStudents=new ColledgeStudent[10];
//        colledgeStudents[0]=new ColledgeStudent("Ima Frosh",18,"F","UCB123", 4.0,1, " English" );
//
//        for(int j=0;j<person.length;j++) {
        //            Person[] persons = new Person[]{person[j],teachers[j],student[j],colledgeStudents[j]};

        Person[] persons = new Person[]{person,teachers,student,colledgeStudents};


            for (int i = 0; i < persons.length; i++) {

//                if (persons[i].toString()== null) {
//                    System.out.println("NULL");
//                    break;
//                }
                System.out.println(persons[i].toString());

            }
        }
//    }

}

class Person {

    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender){
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


class Teacher extends Person {
    private String subject;
    private double salary;

    Teacher(String name, int age, String gender, String subject, double salary) {
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

class Student extends Person{

    private String idNumber;
    private double gpa;

    Student(String name, int age, String gender,String idNumber, double gpa) {
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
class ColledgeStudent extends Student{

    private int year;
    private String major;

    ColledgeStudent(String name, int age, String gender, String idNumber, double gpa,int year, String major) {
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