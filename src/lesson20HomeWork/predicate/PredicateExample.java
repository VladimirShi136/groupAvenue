package lesson20HomeWork.predicate;

import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<Person> personsList = List.of(
                new Person("Игорь", 23, 78),
                new Person("Маша", 31, 54),
                new Person("Петя", 19, 65),
                new Person("Лена", 25, 78),
                new Person("Влад", 34, 90),
                new Person("Макс", 45, 81),
                new Person("Дима", 23, 78),
                new Person("Олег", 37, 94),
                new Person("Саша", 17, 56),
                new Person("Ваня", 29, 79),
                new Person("Гриша", 55, 110),
                new Person("Ира", 39, 64),
                new Person("Нина", 20, 48),
                new Person("Женя", 58, 73));
        System.out.println("Список людей :");
        for (Person person : personsList) {
            System.out.println(person);
        }
        System.out.println("\nВыведем людей старше 30 лет и весом меньше 75 кг / отдельный класс.)");
        personsList
                .stream()
                .filter(new PredicateClass())
                .forEach(System.out::println);
        System.out.println("\nВыведем людей старше 25 лет и весом больше 75 кг.");
        personsList
                .stream()
                .filter(person -> (person.getAge() > 25) && (person.getWeight() > 75))
                .forEach(System.out::println);
    }
}
