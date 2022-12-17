package Passport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(
                new Passport("123456", "Александр", "Невский", " Владимирович ", LocalDate.now().minusDays(45)));
        passports.add(
                new Passport("123456", "Александр", "Невский", " Владимирович ", LocalDate.now().minusDays(45)));


        PassportList passportList = new PassportList(passports);

        System.out.println(passportList);
    }


}

        //Задание 3.4.

        // Array и Linked, связанные списки, чтобы по ним пройтись нужно идти от элемента к элементу- это долго!
        //Меньше времени для выполнения данного метода понадобится HashSet. Идет ускорение поиска за счет Hash кода
