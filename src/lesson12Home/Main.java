package lesson12Home;

// Создай приложение, моделирующее поведение трех видов уток: живой, плюшевой и резиновой.
// Каждому виду утки присущи свои особенности, такие как способность плавать, крякать и летать.
// - Живые утки умеют всё это, плюс они могут размножаться.
// - Плюшевые утки могут только плавать и крякать.
// - Резиновые утки лишь плавают.
// Используя интерфейсы и абстрактные классы, разработай модель,
// которая позволит легко добавить новые виды уток в будущем.
// Напиши тестовый класс Main, который создает экземпляры всех трех видов уток и вызывает их методы.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры всех трех видов уток
        ArrayList<Duck> ducks = getDucks();

        //Выводим информацию об объектах списка через toString
        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }

        System.out.println();

        // Выводим информацию об объектах(утках) списка и вызываем методы
        for (Duck duck : ducks) {
            System.out.println("Утку зовут " + duck.getName() + ". Она имеет " + duck.getColor() + " цвет, весит " +
                    duck.getWeight() + " кг.");
            duck.swim();
            if (duck instanceof Flyable) {
                ((Flyable) duck).fly();
            }

            if (duck instanceof Speakable) {
                ((Speakable) duck).speak();
            }

            if (duck instanceof LiveDuck) {
                ((LiveDuck) duck).reproduce();
            }
            System.out.println();
        }

    }

    private static ArrayList<Duck> getDucks() {
        LiveDuck liveDuck = new LiveDuck("Лили", "белый", 3);
        PlushDuck plushDuck = new PlushDuck("Дора", "зеленый", 1);
        RubberDuck rubberDuck = new RubberDuck("Кряква", "желтый", 1);
        Duck liveDuck1 = new LiveDuck("Дуду", "черный", 4);
        Duck rubberDuck1 = new RubberDuck("Оладушек", "синий", 2);

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(liveDuck);
        ducks.add(plushDuck);
        ducks.add(rubberDuck);
        ducks.add(liveDuck1);
        ducks.add(rubberDuck1);
        return ducks;
    }
}
