package iterators;

import objects.Student;

public interface IStudentBookIterator {
    boolean hasNext();
    Student next();
    void reset();
}
