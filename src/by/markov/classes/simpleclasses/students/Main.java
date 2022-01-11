package by.markov.classes.simpleclasses.students;

import by.markov.classes.service.simpleclasses.students.StudentService;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Markov V.S", 162101, new int[]{9, 10, 9, 9, 9});
        Student st2 = new Student("Ivanov S.A.", 163420, new int[]{8, 7, 4, 9, 8});
        Student st3 = new Student("Petrov V.I", 162100, new int[]{6, 3, 4, 5, 6});
        Student st4 = new Student("Kirik Y.E.", 162100, new int[]{8, 8, 7, 9, 8});
        Student st5 = new Student("Novik D.V.", 163420, new int[]{8, 9, 4, 7, 6});
        Student st6 = new Student("Sidorov M.A.", 160010, new int[]{9, 9, 10, 9, 9});
        Student st7 = new Student("Sokol V.E.", 160010, new int[]{8, 9, 4, 9, 8});
        Student st8 = new Student("Smirnov E.V.", 162101, new int[]{5, 4, 6, 7, 6});
        Student st9 = new Student("Dragun O.I.", 163420, new int[]{6, 6, 4, 5, 6});
        Student st10 = new Student("Markova Y.V.", 164230, new int[]{10, 9, 9, 10, 9});

        Student [] students = new Student [] {st1,st2,st3,st4,st5,st6,st7,st8,st9,st10};

        StudentService studentService = new StudentService();
        studentService.showExcellentStudents(students);
    }
}
