import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        allElements(peopleList);
        allElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void allElements(Collection collection) {
        collection.add(new Person(3, "Arthur"));
        collection.add(new Person(1, "Anastasia"));
        collection.add(new Person(4, "Viktoria"));
        collection.add(new Person(2, "Georrge"));
    }
}