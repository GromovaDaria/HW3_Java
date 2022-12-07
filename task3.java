import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

public class task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(11, 2, 73, 44, 85, 36, 17, 69));
        System.out.println(list);

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("min: " + Collections.min(list));
        System.out.println("max: " + Collections.max(list));
        System.out.printf("average: %.1f", sum / list.size());
    }
}