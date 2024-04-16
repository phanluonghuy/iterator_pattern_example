package iterators;

import objects.Student;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class OldestStudentIterator implements IStudentBookIterator{
    private List<Student> sortedStudentBook;
    private int currentPos;

    public OldestStudentIterator(List<Student> sortedStudentBook) {
        this.sortedStudentBook = this.sortByOrderAge(sortedStudentBook);
        this.currentPos = 0;
    }

    private List<Student> sortByOrderAge(List<Student> studentList) {
        List<Student> sortedStudentBook = new LinkedList<>(studentList);
        sortedStudentBook.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getBirthYear()>o2.getBirthYear()) return 1;
                else  if (o1.getBirthYear()==o2.getBirthYear()) return 0;
                else  return  -1;
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
