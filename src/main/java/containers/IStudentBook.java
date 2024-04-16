package containers;

import iterators.IStudentBookIterator;

public interface IStudentBook {
    IStudentBookIterator createAscendingNameIterator();
    IStudentBookIterator createOldestStudentIterator();
}
