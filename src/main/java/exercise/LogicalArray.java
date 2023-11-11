package exercise;

public interface LogicalArray {
    int size = 1024;
    int countTrueElements();

    boolean getElement(int index);
    void setElement(int index, boolean value);
    void setElement(int index);
    void resetElement(int index);
    void  toggleElement(int index);


}
