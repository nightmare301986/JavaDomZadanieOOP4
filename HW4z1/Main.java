/*
 Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T.
Мы просто выводим этот элемент на консоль с помощью метода System.out.println().
В методе main мы вызываем printElement с различными типами данных: целое число (Integer), строку (String) и число с плавающей запятой (Double).
Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных,
обеспечивая простоту и гибкость использования.
*/

package HW4z1;

public class Main {
    public static void main(String[] args) {

        Prel<Integer, String, Double> IOb = new Prel<Integer, String, Double>(100, "Wordle", 3.14);
        IOb.printElement();
        int v = IOb.getOb1();
        String str = IOb.getOb2();
        double numf = IOb.getOb3();

        System.out.println("Тип первого элемента v = "+ IOb.ob1.getClass().getName());
        System.out.println("Тип второго элемента str = "+IOb.ob2.getClass().getName());
        System.out.println("Тип третьего элемента numf = "+IOb.ob3.getClass().getName());
    }
}
