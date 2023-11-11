package exercise;

public class Main {
    public static void main(String[] args) {

        LogicalArrayInt array = new LogicalArrayInt();



        array.toggleElement(3);
        System.out.println(array);
        array.setElement(2,true);
        array.setElement(3,true);
        System.out.println(array);
        System.out.println(array.countTrueElements());




    }
}
