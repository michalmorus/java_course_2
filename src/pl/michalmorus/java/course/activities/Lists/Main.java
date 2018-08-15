package pl.michalmorus.java.course.activities.Lists;

import org.omg.PortableInterceptor.INACTIVE;
import sun.net.www.http.HttpClient;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        int loops = 10000;
        System.out.println("ArrayList");
        test(new ArrayList<>(), loops);

        System.out.println("LinkedList");
        test(new LinkedList<Integer>(), loops);

    }


    private static void test(List<Integer> list, int loops) {
        Random random = new Random();
        Long currentTime1 = System.currentTimeMillis();
        for (int i = 0; i < loops; i++) {
            list.add(random.nextInt());
        }
        System.out.println("wstawianie: " + (System.currentTimeMillis() - currentTime1) + " ms");

        Long currentTime2 = System.currentTimeMillis();

        for (Object integer : list);
        System.out.println("iteracja: " + (System.currentTimeMillis() - currentTime2) + " ms");

        Long currentTime3 = System.currentTimeMillis();
        int value = Math.abs(random.nextInt() % loops);
        for (Object integer : list) {
            if (integer.equals(value)) {
                break;
            }
        }
        System.out.println("wyszukiwanie: " + (System.currentTimeMillis() - currentTime3) + " ms");
    }
}
