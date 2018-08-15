package pl.michalmorus.java.course.activities.Exceptions.ReadFile;

import java.io.*;

public class Main {

    public static void run() {
        String s = test();

        System.out.println(s);
        String path = "/home/michal/.profile";
        path = "./";
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            System.out.println(br.readLine());
        } catch (FileNotFoundException enf) {
            System.out.println("Nie znaleziono pliku: " + path);
        } catch (IOException io) {
            System.out.println("Błąd odczytu!");
        }
    }

    public static String test() {
        try {
            throw new Exception("saas");
        } catch (Exception e) {
            return "Aaa";
        }
    }
}
