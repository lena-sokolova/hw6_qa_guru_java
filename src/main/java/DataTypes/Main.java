package DataTypes;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int c = 10;
        int e = 15;
        byte b = 127;
        short s = 32767;
        long l = 5647383892823737L;
        float f = 5.03F;
        double d = 35.7;

        String condition = "Написал контрольную на 5";
        String result1;
        String result;

        //     Переполнение

        System.out.println(b+200);
        System.out.println(s+1);

        //     Арифметические вычисления с разными типами данных

        System.out.println("byte + short = " + (b + s));
        System.out.println("long - short = " + (l - s));
        System.out.println("double * byte = " + (d * b));
        System.out.println("double / float = " + (d / f));
        System.out.println("double % 10 = " + (d % 10));
        System.out.println("int ^ 2 = " + Math.pow(a, 2));
        System.out.println("int + 1 = " + (++a));
        System.out.println("int - 1 = " + (--c));

        //     Операторы сравнения

        System.out.println("в 1 км 1000 м " + (1*1000 == 1000) );
        System.out.println("10 дм не равно 10 см " + (10*10 != 10));
        System.out.println("100 кг больше 1000 г " + (100 > 1000/1000));
        System.out.println("500 м меньше 2 км " + (500 < 2*1000));
        System.out.println(100 <= 100.1);
        System.out.println(1000 >= 999);

        //     Логические операторы

        if (a < b & c < e) {
            System.out.println(e);
        }
        else {
            System.out.println(c);
        };

        if (a > b && c < e) {
            System.out.println(e);
        }
        else {
            System.out.println(c);
        };

        if (a < b || c < e) {
            System.out.println(e);
        }
        else {
            System.out.println(c);
        };

        //     Тернарный оператор

        if (condition.equals("Написал контрольную на 5")) {
            result1 = "Отличник";
        }
        else {
            result1 = "Двоечник";
        }
        System.out.println(result1);

        String result2 = condition.equals("Написал контрольную на 2")
                ? "Отличник"
                : "Двоечник";
        System.out.println(result2);

        switch (condition) {
            case "Написал контрольную на 3": {
                result = "Отличник";
                break;
            }
            case "Написал контрольную на 4": {
                result = "Хорошист";
                break;
            }
            default: {
                result = "Пересдача";
            }
        System.out.println(result);

        }
    }
}

