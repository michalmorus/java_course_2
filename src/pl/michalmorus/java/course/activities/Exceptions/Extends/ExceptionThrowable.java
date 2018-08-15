package pl.michalmorus.java.course.activities.Exceptions.Extends;

public interface ExceptionThrowable {

    void methodThrowExceptionA() throws ExceptionA;

    void methodThrowExceptionB() throws ExceptionB;

    void methodThrowExceptionBButDeclaredA() throws ExceptionA;
}
