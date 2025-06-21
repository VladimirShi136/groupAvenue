package lesson20HomeWork.predicate;

import java.util.function.Predicate;

public class PredicateClass implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return (person.getAge() > 30) && (person.getWeight() < 75);
    }
}
