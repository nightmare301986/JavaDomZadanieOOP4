package HW4z2;

public class PrintOutArray {
    public <T> void printArray(T[] items){
        for(T item: items){
            System.out.print(item);
            System.out.print(" ");
        }
    }
}
