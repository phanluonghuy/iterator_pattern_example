package iterators;

import objects.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AscendingNameIterator implements IStudentBookIterator{
    private List<Student> sortedStudentBook;
    private int currentPos;

    public AscendingNameIterator(List<Student> sortedStudentBook) {
        this.sortedStudentBook = sortAscendingbyName(sortedStudentBook);
        this.currentPos = 0;
    }

    private List<Student> sortAscendingbyName(List<Student> studentList) {
        List<Student> sortedStudentBook = new LinkedList<>(studentList);
        
        sortedStudentBook.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return sortedStudentBook;
    }

    @Override
    public boolean hasNext() {
        return this.currentPos < this.sortedStudentBook.size();
    }

    @Override
    public Student next() {
        if (this.hasNext()) {
            return this.sortedStudentBook.get(this.currentPos++);
        }
        return null;
    }

    @Override
    public void reset() {
        this.currentPos = 0;
    }
}
