import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> newlist = number.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);
        List<Integer> newList1 = number.map(i -> i * i).collect(Collectors.toList());
        System.out.println(newList1);
        List<Integer> sorted = number.sorted().collect(Collectors.toList());
        System.out.println(sorted);
        double[] squaresAsDoubleArray = number.mapToDouble(n -> n * n)
                .toArray();
        for (double square : squaresAsDoubleArray) {
            System.out.print(square + " ");
            int[] squaresAsIntArray = number
                    .mapToInt(n -> n * n)
                    .toArray();
            for (double square1 : squaresAsDoubleArray) {
                System.out.print(square + " ");
            }
        }
    }
}
