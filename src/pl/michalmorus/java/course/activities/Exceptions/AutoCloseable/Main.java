package pl.michalmorus.java.course.activities.Exceptions.AutoCloseable;

import java.io.IOException;

public class Main {

    public static void run() throws Exception {
        try (Example ex = new Example()) {
            ex.throwMyException();
        }

//        Example ex = new Example();
//        try {
//            ex.throwMyException();
//            throw new IOException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            ex.close();
//        }
    }
}


