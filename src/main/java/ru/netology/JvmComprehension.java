package ru.netology;

public class JvmComprehension {
   /* Класс JvmComprehension отдается для загрузки в систему ClassLoader'ов
    и перемещается в Metaspace для сохранения данных о классе JvmComprehension.*/

    public static void main(String[] args) {
        int i = 1;                      // 1 Во frame main создается переменная  i, значение которой = 1
        Object o = new Object();        // 2 Переменная о создается в stack фрейма main и хранит в себе ссылку на объект, new Object создается для хранения в heap.
        Integer ii = 2;                 // 3 Integer является ссылочной переменной ii, помещается в stack main и хранит в себе ссылку на значение объекта Integer,
        // само значение объекта создается для хранения в heap.
        printAll(o, i, ii);             // 4 В stack формируется frame printAll
        System.out.println("finished"); // 7 В stack формируется frame println, в котором создается ссылка на объект String "finished". Объект String создаётся для хранения в heap.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 В stack во frame printAll для хранения создается
        // переменная uselessVar, которая хранит в себе ссылку на объект Integer.
        // Объект со значением 700 хранится в heap.
        System.out.println(o.toString() + i + ii);  // 6 В stack формируется frame println и toString.
        // В frame println передаются переменные i со значением 1, ii, o,
        // последние из которых хранят ссылки на объекты Object o, Integer ii.
    }

}
