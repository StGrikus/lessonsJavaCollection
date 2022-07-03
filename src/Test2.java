import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test2 {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Arthur");
        Person person2 = new Person(2,"Anastasia");
        Person person3 = new Person(3,"Bob");
        Person person4 = new Person(4,"Cost");

        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));
/*
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        //person3 <-p2 <-p4 <-p1

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);

 */
    }
}
