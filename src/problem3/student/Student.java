package problem3.student;

import java.util.Objects;

public class Student {
    private int rollNumber;

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        Student student = (Student) o;
        if (rollNumber > student.rollNumber) {
            return true;
        }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}
