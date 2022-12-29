package phonebook;

import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Иванов Иван", "89114561520");
        phoneBook.put("Андреев Евгений", "89114561520");
        phoneBook.put("Смирнов Данил", "891145641590");
        phoneBook.put("Сетов Павел", "89114564720");
        phoneBook.put("Флотова Анастасия", "89114568950");
        phoneBook.put("Дженерин Стас", "89114161520");
        phoneBook.put("Имплементова Светлана", "891141212520");
        phoneBook.put("Аксенова Вера", "89134561520");
        phoneBook.put("ИБукварев Дмитрий", "89114781520");
        phoneBook.put("ИГитов Дмитрий", "89114161520");
        phoneBook.put("Хабова Евгения", "89134561520");
        phoneBook.put("Гуглин Павел", "89114561320");
        phoneBook.put("Клавин Егор", "89111231520");
        phoneBook.put("Антонов Алекс", "89114561163");
        phoneBook.put("Прогрпмкина Динара", "89116561520");
        phoneBook.put("Петров Илья", "89145861520");
        phoneBook.put("Стаканов Василий", "89114561130");
        phoneBook.put("Мониторов Дмитрий ", "89132561520");
        phoneBook.put("Стахин Петр", "89136961520");
        phoneBook.put("Телефонина Света", "89112361520");
        phoneBook.put("Трошев Иван", "89125861520");

        System.out.println( phoneBook.keySet());



    }
}
