package java8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SyimykJava8 {
    public static void main(String[] args) {
        Random random=new Random();
        String[] names = {
                "Абдиразак\n",
                "Абдулфаттох\n",
                "Абдували\n",
                "Агахан\n",
                "Адил\n",
                "Адилет\n",
                "Айгерим\n",
                "Айпери\n",
                "Алибек\n",
                "Арабидин\n",
                "Артём\n",
                "Арун\n",
                "Байэл\n",
                "Бакас\n",
                "Бек\n",
                "Бектур\n",
                "Давлатбек\n",
                "Дастан\n",
                "Жайлообек\n",
                "Жанышбек\n",
                "Жийдегул\n",
                "Жумантай\n",
                "Исхак\n",
                "Кайратбек\n",
                "Каныкей\n",
                "Канымгүл\n",
                "Кубан\n",
                "Кутман\n",
                "Мадина\n",
                "Милана\n",
                "Мирлан\n",
                "Мирлан\n",
                "Мээрим\n",
                "Нурали\n",
                "Нуржигит\n",
                "Нуриза\n",
                "Нурия\n",
                "Нурсейит\n",
                "Нурсултан\n",
                "Нурсултан\n",
                "Осмон\n",
                "Санжар\n",
                "Сыймык\n",
                "Чынгыз\n",
                "Чынгыз\n",
                "Ынтымак\n",
                "Элиза\n",
                "Эрболот\n",
                "Эрлан\n",
                "Кутман"
        };
        System.out.println(names.length);
        String[] spaceX = new String[10];
        String[] facebook = new String[25];
        for (int i = 0; i < names.length; i++) {
            spaceX[i]= names[i];
        }
        System.out.println(Arrays.toString(spaceX));

    }
}
