package exercise;

public class Main {
    public static void main(String[] args) {

        LogicalArrayInt array = new LogicalArrayInt();
        LogicalArrayBoolean arrayBoolean = new LogicalArrayBoolean();
        System.out.println("Реализация: булевский массив");
        System.out.println(arrayBoolean);
        arrayBoolean.toggleElement(2);
        arrayBoolean.toggleElement(4);
        arrayBoolean.toggleElement(6);
        System.out.println(arrayBoolean);

        System.out.println();
        System.out.println("Реализация: целочисленный массив");
        array.toggleElement(3);
        System.out.println(array);
        array.setElement(2,true);
        array.setElement(3,true);
        System.out.println(array);
        System.out.println(array.countTrueElements());

    }
}
