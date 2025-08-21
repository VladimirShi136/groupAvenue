package lesson36;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/**
 * Курс валют.
 * Создать сервис, который обращается к сервису курсов валют,
 * и отображает gifку в зависимости от курса валют
 */

public class Main {
    public static void main(String[] args) {
        //Создаем объект календаря
        Calendar calendar = Calendar.getInstance();

        //Устанавливаем дату и вычитаем 1 день для получения вчерашнего дня
        calendar.add(Calendar.DATE, -1);

        //Получаем день, месяц и год, день и месяц переводим в строку
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String monthStr = String.valueOf(month);
        String dayStr = String.valueOf(day);

        //Если месяц или день меньше 10, то добавляем 0 для красивого вывода
        if (month < 10) monthStr = "0" + monthStr;
        if (day < 10) dayStr = "0" + dayStr;

        //Создаем вчерашнюю дату в виде строки
        String yesterday = year + "-" + monthStr + "-" + dayStr;

        //Используем метод getRub() и получаем курс валют за вчера и сегодня, затем выводим в консоль
        double yesterdayRub = getRub(yesterday);
        double todayRub = getRub(null);
        System.out.println("\nHello!");
        System.out.println("Дата сегодня: " + calendar.getTime());
        System.out.println("Курс валют сегодня: " + todayRub);
        System.out.println("Курс валют за вчера: " + yesterdayRub);

        if (todayRub > yesterdayRub) {
            System.out.println("\nСегодня было дороже!");
            getGif("rich");
        } else {
            System.out.println("\nСегодня было дешевле!");
            getGif("broke");
        }
    }

    /**
     * Метод для получения курса валют
     *
     * @param date - дата календаря
     * @return - возвращает курс в рублях с плавающей точкой
     */
    static double getRub(String date) {
        //Заведем переменные для получения курса
        // rub - курс в рублях
        double rub;
        // APP_ID - токен для получения курса
        final String APP_ID = "ad1c3a856f32428db34c670bfefe84c1";
        // spec - ссылка для получения курса
        String spec = "https://openexchangerates.org/api/latest.json?app_id=" + APP_ID;

        //Если дата не null, то получаем курс валют за определенную дату
        if (date != null) {
            spec = "https://openexchangerates.org/api/historical/" + date + ".json?app_id=" + APP_ID;
        }

        //Получаем курс
        try {
            //URL - объект для работы с адресом-ссылкой курса валют
            URL url = new URL(spec);
            //HttpURLConnection - Открываем соединение
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //InputStream - открываем поток ввода и передаем ему входной поток соединения
            //BufferedReader - читаем из потока ввода в буфер для считывания данных построчно
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            //String line - переменная для чтения строки
            //result - переменная (StringBuilder) для хранения результата
            String line;
            StringBuilder result = new StringBuilder();

            // Пока не достигнут конец файла - считываем и выводим строку
            while ((line = br.readLine()) != null) {
                result.append(line);
            }

            //Закрываем потоки
            br.close();
            is.close();

            //Превратим строку JSON в объект JSON
            //JSONparser - разбираем JSON строки
            JSONParser jsonParser = new JSONParser();
            //JSONObject - превращаем JSON в объект
            JSONObject jsonObject = (JSONObject) jsonParser.parse(result.toString());
            //Разберем jsonObject и по полю rates получим еще один jsonObject с курсами валют
            JSONObject jsonRates = (JSONObject) jsonObject.get("rates");
            //Получаем курс валют в рублях по полю-ключу RUB
            rub = (double) jsonRates.get("RUB");
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        return rub; // - вернем курс
    }

    /**
     * Метод для поиска гифок
     *
     * @param search - поисковая строка/запрос
     */
    static void getGif(String search) {
        //APP_ID - токен для получения гифки
        final String APP_ID = "MGR9scZeBiM84H88nbtqoLxVvdN8vxzl";

        try {
            //URL - объект для работы с адресом-ссылкой
            URL url = new URL("https://api.giphy.com/v1/gifs/search?q=" + search + "&api_key=" + APP_ID);
            //HttpURLConnection - Открываем соединение
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //InputStream - открываем поток ввода и передаем ему входной поток соединения
            //BufferedReader - читаем из потока ввода в буфер для считывания данных построчно
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            //String line - переменная для чтения строки
            //result - переменная (StringBuilder) для хранения результата
            String line;
            StringBuilder result = new StringBuilder();

            // Пока не достигнут конец файла - считываем и выводим строку
            while ((line = br.readLine()) != null) {
                result.append(line);
                //System.out.println(line);
            }

            //Закрываем потоки
            br.close();
            is.close();

            //Превратим строку JSON в объект JSON а затем вытащим массив JSON по ключу data
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(result.toString());
            JSONArray jsonArray = (JSONArray) jsonObject.get("data");

            //Создадим список для хранения id на гифки
            List<String> gifList = new ArrayList<>();
            //Перебираем массив jsonArray и вытаскиваем id на гифки
            for (Object o : jsonArray) {
                JSONObject jsonObj = (JSONObject) o;
                gifList.add(jsonObj.get("id").toString());
            }

            //Выбираем случайную гифку
            Random random = new Random();
            int index = random.nextInt(gifList.size());

            //Получаем ссылку на гифку с помощью id и конкатенации строк
            String gifUrl = "https://i.giphy.com/" + gifList.get(index) + ".gif";
            System.out.println("Ссылка на случайную гифку: ");
            System.out.println(gifUrl);

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
