package containers;

import iterators.AscendingNameIterator;
import iterators.IStudentBookIterator;
import iterators.OldestStudentIterator;
import objects.Student;

import java.util.List;

public class StudentBook implements IStudentBook{
    List<Student> studentList;

    public StudentBook(Student... students) {
        this.studentList = List.of(students);
    }

    @Override
    public IStudentBookIterator createAscendingNameIterator() {
        return new AscendingNameIterator(this.studentList);
    }

    @Override
    public IStudentBookIterator createOldestStudentIterator() {
        return new OldestStudentIterator(this.studentList);
    }
}
