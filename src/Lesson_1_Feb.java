import java.sql.SQLOutput;

public class Lesson_1_Feb {

    // Задание № 1: Создать пустой проект в IntelliJ IDEA и прописать метод main();

    public static void main(String[] args) {

        // Задание № 2: Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte aByte = 1;
        short aShort = 2;
        int aInt = 3;
        long aLong = 4L;

        float aFloat = 5.0F;
        double aDouble = 6.0;

        char aChar = 'G';

        String aString = "Hello";

        boolean aBoolean = true;


        z17(30,30,20);


    }

    /*  Задание № 3: Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – входные параметры этого метода; */

    public static double calculate(double a, double b, double c, double d) {

        double result = a * (b + (c / d));
        return result;
    }

    /*  Задание № 4: Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
    от 10 до 20(включительно), если да – вернуть true, в противном случае – false; */

    public static boolean validate(double e, double f) {

        boolean r = false;
        double summ = e + f;

        if (summ >= 10 && summ <= 20) {
            r = true;
        }
        return r;
    }

    /*  Задание № 5: Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    считаем положительным числом. */

    public static void positiveNegative(int g) {

        if (g < 0) {
            System.out.println("Введёное число является отрицательным");
        } else {
            System.out.println("Введёное число является положительным");
        }
    }

    /*  Задание № 6: Написать метод, которому в качестве параметра передается целое число, метод должен вернуть
    true, если число отрицательное; */

    public static boolean negativeTrue(int k) {

        boolean s = false;

        if (k < 0) {
            s = true;
        }
        return s;
    }

    /*  Задание № 7: Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод
    должен вывести в консоль сообщение «Привет, указанное_имя!»; */

    public static void enterName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /* + Задание № 8: a и b - переменные типа boolean. Напишите метод, который доказывает, выражение true.
    выражение (!(a && b) && (a || b)) || ((a && b) || !(a || b)) */

    // Не совсем понял смысл задания, поэтому просто написал вот такой метод.
    public static boolean alwaysTrue(boolean a, boolean b) {

        boolean h = false;

        if ((!(a && b) && (a || b)) || ((a && b) || !(a || b))) {

            h = true;
        }
        return h;
    }

    //  Задание № 9: Переменные a и b типа int. Упростите выражение (!(a < b) && !(a > b)).

    // Тоже не совсем поня что от меня требуется, поэтому просто напишу что (!(a < b) && !(a > b))  равнозначно (a==b).


    /*  Задание № 10: Напишите метод, который получает на вход два положительных числа и выводит true, если
    одно из них нацело делится на другое. */

    public static void division(double w, double y) {

        if ((w % y == 0) ^ (y % w == 0)) {
            System.out.println("Правда");
        }
    }

    /*  Задание № 11: Напишите метод, котрый получает на вход 3 положительных числа и проверяет что одно
    из них больше суммы других двух. (Применяется для проверки, могут ли числа быть сторонами треугольника) */

    public static void triangle(double x, double z, double j) {

        if ((x + z) < j ^ (x + j) < z ^ (z + j) < x) {
            System.out.println("Одно число больше суммы двух других");
        }
    }

    /*  Задание № 12: Написать метод, который определяет является ли год високосным, и выводит сообщение в
    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */

    public static void year(int y) {

        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    /*  Задание № 13: Напишите метод, который получает на вход два целых числа и выводит случайное
     число в этом диапазоне. */

    public static int randomNumber(int t, int e) {
        int res = t;
        // Проверяю какое из чисел больше и присваиваю их минимуму и максимуму интервала
        if (t < e) {
            e = e - t;
            res = (int) (Math.random() * ++e) + t;
        } else if (e < t) {
            t = t - e;
            res = (int) (Math.random() * ++t) + e;
        }
        return res;
    }

    /*   Задание № 14: Напишите метод, который выводит сумму двух случайных
    чисел от 1 до 6. (имитация броска кубиков) */

    public static void dice() {

        int min = 1;
        int max = 5;
        int resultDice1 = (int) (Math.random() * max) + min;
        int resultDice2 = (int) (Math.random() * max) + min;
        int suDice = resultDice1 + resultDice2;
        System.out.println("Сумма двух случайных чисел равна: " + suDice);
    }

    /* Задание № 15: Напишите метод, который получает на вход число t и выводит в консоль результат выражения
    sin(2t) + sin(3t) */


    // Я нашёл вот такой способ, но при вычислении есть небольшая погрешность.
    public static void summSin(double t) {
        double rad = Math.toRadians(t);
        double valueSin1 = Math.sin(2 * rad);
        double valueSin2 = Math.sin(3 * rad);
        double sumValue = valueSin1 + valueSin2;

        System.out.println(sumValue);

    }

    /*  Задание № 16: Напишите метод, который получает на вход целочисленные m и d и проверяет, что
    введённые m-месяц и d-день, лежат в промежутке от 20.03 до 20.06. */

    public static void data(int m, int d) {
        if ((m == 4 && (d > 0 && d <= 30)) || (m == 3 && (d >= 20 && d < 32)) || (m == 5 && (d > 0 && d < 32)) || (m == 6 && (d > 0 && d <= 20))) {
            System.out.println("Введенная дата лежит в промежутке");
        } else {
            System.out.println("Веденная дата не лежит в промежутке");
        }
    }

    /* Задание № 17: Напишите метод, который на вход получает информацию о цвете в формате RGB и переводит
    ии в формат CMYK. Результат вывести в консоль. */

    // Не осилил



    /*  Задание № 18: Напишите метод, который получает на вход 3 целых числа, сравнивает их, и выводит
     в консоль "Все три числа равны" или "не равны". */

    public static void threeNumber(int f, int d, int v) {

        if (f == d && d == v) {
            System.out.println("Введённые числа равны");
        } else {
            System.out.println("Введённые числа не равны");
        }

    }

    /*  Задание № 19: Напишите метод, который проверяет, что переменные x и y типа double лежат
    строго в пределах от 0 до 1. */

    public static void bin(double x, double y) {

        if ((x > 0.0 && x < 1.0) && (y > 0.0 && y < 1.0)) {
            System.out.println("Оба числа лежат в заданном промежутке");
        } else {
            System.out.println("Одно или оба числа не лежат в заданном промежутке");
        }
    }


}
