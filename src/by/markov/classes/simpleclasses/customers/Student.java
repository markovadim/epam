package by.markov.classes.simpleclasses.customers;

public class Student {
    private boolean isStudent;
    private String university;
    private String faculty;

    public Student(boolean isStudent, String university, String faculty) {
        this.isStudent = isStudent;
        this.university = university;
        this.faculty = faculty;
    }

    public Student(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        if (isStudent) {
            return "is student" + "| University: " + university + "| Faculty: " + faculty;
        } else {
            return " is not a student";
        }
    }
}
