/*
Задача(по желанию. Режим - Героя): Напишите обобщенный класс DataContainer,
который представляет собой контейнер для хранения и обработки данных. Класс должен иметь методы для добавления и
получения элементов, а также методы для сортировки и вывода элементов.
В этом примере мы создаем обобщенный класс DataContainer, который использует массив для хранения элементов типа T.
Класс имеет методы add для добавления элементов, get для получения элемента по индексу, sort для сортировки элементов
с помощью переданного компаратора, и print для вывода элементов на консоль.
В методе main мы создаем объект DataContainer для хранения строк. Мы добавляем несколько строк, выводим их на консоль
с помощью метода print, затем сортируем элементы в обратном порядке с помощью лямбда-выражения в методе sort
и снова выводим отсортированные элементы на консоль.
Таким образом, обобщенные классы позволяют нам создавать универсальные контейнеры для хранения
и обработки данных любого типа, обеспечивая безопасность типов и гибкость в использовании.
 */

package HW4z4;

public class Main {
    public static void main(String[] args) {

            DataContainer<String> container = new DataContainer<>(new String[]{"one", "two", "three"});
            container.add("four");
            container.print();
            container.sort((o1, o2) -> o2.compareTo(o1));
            String s1 = container.get(3);
            System.out.println("Выбранный элемент равен (после сортировки) "+s1);
            container.print();
            DataContainer<Integer> container2 = new DataContainer<>(new Integer[]{1, 2, 3});
            container2.add(4);
            container2.print();
            container2.sort((o1, o2) -> o2.compareTo(o1));
            String s2 = String.valueOf(container2.get(3));
            System.out.println("Выбранный элемент равен (после сортировки) "+s2);
            container2.print();
            DataContainer<Double> container3 = new DataContainer<>(new Double[]{2.5, 0.1, -5.9});
            container3.add(4.5);
            container3.print();
            container3.sort((o1, o2) -> o2.compareTo(o1));
            String s3 = String.valueOf(container3.get(3));
            System.out.println("Выбранный элемент равен (после сортировки) "+s3);
            container3.print();
        
    }
}
