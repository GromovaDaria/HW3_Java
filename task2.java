import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*1. Пусть дан произвольный список целых чисел, удалить из него четные числа*/

public class task2 {

        public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.print(list);
    }
}