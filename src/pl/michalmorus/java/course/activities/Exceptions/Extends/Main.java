package pl.michalmorus.java.course.activities.Exceptions.Extends;

public class Main {

    public static void run() {
        TestException test = new TestException();

        try {
            test.methodThrowExceptionB();
            test.methodThrowExceptionA();
        } catch (ExceptionB eB) {
            eB.printStackTrace();
        } catch (ExceptionA eA) {
            System.out.println(eA.getClass());
        }
//        throw new RuntimeExceptionC();
//        try {
//            throw new RuntimeExceptionC();
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//        System.out.println("after runtime");
//        try {
//            throw new RuntimeException("sda");
//        } catch (Exception e) {
//
//        }
//
//
//        try {
//            int i =0;
//            throw new Error("error");
//
//        } catch (Error e) {
//            System.out.println("in catch11");
//        }
//        System.out.println("finish");

    }
}
