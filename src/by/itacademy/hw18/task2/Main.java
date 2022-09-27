package by.itacademy.hw18.task2;

import java.lang.reflect.Method;

/**
 * 2. Написать собственную аннотацию @AcademyInfo c полем year. Создать метод,
 * помеченный этой аннотацией с заданным year, метод, помеченный аннотацией со
 * значением year по умолчанию, и метод без нее. С помощью рефлексии проверить
 * наличие аннотации и значение поля у этих методов из основной программы.
 * Результаты вывести на экран.
 */
public class Main {
    public static void main(String[] args) {

        Class<?> mClass = AcademyService.class;
        Method[] methods = mClass.getDeclaredMethods();

        for (Method method : methods) {
            AcademyInfo annotation = method.getAnnotation(AcademyInfo.class);
            if (annotation != null) {
                System.out.printf("Method '%s' has annotation 'AcademyInfo' with value '%s'%n",
                        method.getName(),annotation.year());
            }
            else {
                System.out.printf("Method '%s' doesn't have annotation 'AcademyInfo'%n",
                        method.getName());
            }
        }
    }
}
