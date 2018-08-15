package pl.michalmorus.java.course.activities.Exceptions.ExceptionStack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void run() {
       throw new RuntimeException("runtime", new RuntimeException("exception 1"));
    }
}
