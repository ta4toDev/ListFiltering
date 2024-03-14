import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> filterList(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .map(e -> (Integer) e)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b"))); // List.of(1,2)
        System.out.println(filterList(List.of(1, "a", "b", 0, 15))); // List.of(1,0,15)
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123))); // List.of(1, 2, 123)
    }
}
