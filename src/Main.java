class Person {

    private String yearOfBirth;
    private String fullName;

    public Person() {}

    public Person(String yearOfBirth, String fullName) {
        this.yearOfBirth = yearOfBirth;
        this.fullName = fullName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }

}

class Lecturer extends Person {
    public Lecturer() {}

    public Lecturer(String yearOfBirth, String fullName) {
        super(yearOfBirth, fullName);
    }

}

class Student extends Person {
    private String mssv;

    public Student() {}

    public Student(String yearOfBirth, String fullName, String mssv) {
        super(yearOfBirth, fullName);
        this.mssv = mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
}

public class Main {
    public static void main(String[] args) {
        Lecturer l1 = new Lecturer("1997", "Tran Manh Cuong");
        Lecturer l2 = new Lecturer("2001", "Kieu Van Tuyen");

        Student s1 = new Student("2005", "Nguyen Ba Hoang Long", "23020680");
        Student s2 = new Student("2004", "Tran Van Dong", "22020719");

        Person other1 = new Person("1978", "Nguyen Van A");
        Person other2 = new Person("1985", "Tran Thi B");

        //in danh sach giang vien
        System.out.println("Danh sach giang vien:");
    }
}