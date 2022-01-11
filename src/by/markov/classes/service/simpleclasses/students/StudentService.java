package by.markov.classes.service.simpleclasses.students;

import by.markov.classes.simpleclasses.students.Student;

public class StudentService {
    private final int STUDENTS_MARK_9 = 9;
    private final int STUDENTS_MARK_10 = 10;

    public void showExcellentStudents(Student[] arrayOfStudents) {
        for (Student student : arrayOfStudents) {
            boolean result = true;
            for (int mark : student.getRating()) {
                result = false;
                if ((mark == STUDENTS_MARK_9) || (mark == STUDENTS_MARK_10)) {
                    result = true;
                } else {
                    break;
                }
            }
            if (result) System.out.println(student);
        }
    }
}
