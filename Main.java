import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);

        printElements(numbers);
        insertionSort(numbers);
        printElements(numbers);

        System.out.println();

        ArrayList<String> words = new ArrayList<>();
        words.add("amazon");
        words.add("lettuce");
        words.add("forest");
        words.add("alpha");
        words.add("child");
        words.add("turkey");
        words.add("sloped");

        printElements(words);
        insertionSort(words);
        printElements(words);
    }

    private static <E extends Comparable<? super E>> void insertionSort(List<E> list) {
        for (int i = 1; i < list.size(); i++) {
            E value = list.get(i);
            int j = i;

            while (j > 0 && value.compareTo(list.get(j - 1)) <= 0) {
                list.set(j, list.get(j - 1));
                j--;
            }

            list.set(j, value);
        }
    }

    private static <E extends Comparable<? super E>> void printElements(List<E> list) {
        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}