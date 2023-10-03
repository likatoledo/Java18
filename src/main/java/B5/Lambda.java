package B5;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Filter(cadaNumero -> cadaNumero % 2 == 0)
                .collect(Collectors.toList()).forEach(System.out::println);


}
