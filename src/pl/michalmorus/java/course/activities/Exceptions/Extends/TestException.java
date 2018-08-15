package pl.michalmorus.java.course.activities.Exceptions.Extends;

public class TestException implements ExceptionThrowable {
    @Override
    public void methodThrowExceptionA() throws ExceptionA {
        throw new ExceptionB();
    }

    @Override
    public void methodThrowExceptionB() throws ExceptionB {
        throw new ExceptionB();
    }

    @Override
    public void methodThrowExceptionBButDeclaredA() throws ExceptionA {
        throw new ExceptionB();
    }
}
