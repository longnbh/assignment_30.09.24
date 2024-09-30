public class Person {

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