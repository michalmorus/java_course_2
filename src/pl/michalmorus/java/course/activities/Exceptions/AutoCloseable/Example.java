package pl.michalmorus.java.course.activities.Exceptions.AutoCloseable;

class Example implements AutoCloseable {
    public void throwMyException() throws Exception {
        throw new Exception();
    }

    @Override
    public void close()  {
        System.out.println("i'm closing");
    }
}