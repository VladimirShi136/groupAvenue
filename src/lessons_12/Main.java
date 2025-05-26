package lessons_12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создадим животных
        // Орел
        // Слон
        // Жираф
        // Тигр
        // Лебедь
        // --- Есть ли у животных какие-то общие поля состояния? ---
        // Возраст
        // Имя
        // Еда
        // Цвет
        // --- Есть ли общее поведение? ---
        // двигаются
        // едят
        // спят
        //Есть ли индивидуальное поведение?
        //Орел, лебедь - летают
        //Тигр, Орел - охотятся
        //Лебедь - плавает
        Tiger tiger = new Tiger("Тигр", 23, "Мясо", "Черный");
        Eagle eagle = new Eagle("Орел", 12, "Рыба", "Серый");
        Swan swan = new Swan("Лебедь", 5, "Рыба", "Белый");
        Giraffe giraffe = new Giraffe("Жираф", 45, "Трава", "Серый");
        Elephant elephant = new Elephant("Слон", 45, "Трава", "Серый");
        // Сложим объекты в один список
        Animal[] animals = {tiger, eagle, swan, giraffe, elephant};
        System.out.println(Arrays.toString(animals)); 
    }
}
