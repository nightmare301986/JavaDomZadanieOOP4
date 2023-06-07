/*
Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл for-each,
чтобы пройти по всем элементам массива и вывести их на консоль.
В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них.
В результате мы получаем вывод на консоль элементов каждого массива.
Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных,
обеспечивая повторное использование и гибкость.
 */

package HW4z2;

public class Main {
    public static void main(String[] args) {
        PrintOutArray printer = new PrintOutArray();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        Double[] numbersd = {23.1, 4.2, 5.6, 2.9, 13.31, 456.21, 4.044};
        printer.<String>printArray(people);
        System.out.println();
        printer.<Integer>printArray(numbers);
        System.out.println();
        printer.<Double>printArray(numbersd);
    }
}
