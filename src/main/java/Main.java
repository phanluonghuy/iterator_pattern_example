import containers.StudentBook;
import iterators.IStudentBookIterator;
import objects.Student;

public class Main {

    public static void main(String[] args) {
        Student student_0 = new Student("5001","PLH","5001@student.com",2003);
        Student student_1 = new Student("5002","TTP","5002@student.com",2002);
        Student student_2 = new Student("5003","TTA","5003@student.com",2006);
        Student student_3 = new Student("5004","AVA","5004@student.com",2005);

        StudentBook studentBook = new StudentBook(student_0,student_1,student_2,student_3);

        IStudentBookIterator nameIterator = studentBook.createAscendingNameIterator();
        while (nameIterator.hasNext()) {
            Student student = nameIterator.next();
            System.out.println(student.toString());
        }
        System.out.println("--------------------------------------------------------------");
        IStudentBookIterator ageIterator = studentBook.createOldestStudentIterator();
        while (ageIterator.hasNext()) {
            Student student = ageIterator.next();
            System.out.println(student.toString());
        }
    }
}
