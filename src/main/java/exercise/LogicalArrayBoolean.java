package exercise;

public class LogicalArrayBoolean implements LogicalArray{
    private final boolean[] array;

    public LogicalArrayBoolean() {
        array = new boolean[size];
    }

    @Override
    public boolean getElement(int index) {
        if(index>=0) return array[index];
        else throw new IllegalArgumentException();
    }

    @Override
    public void setElement(int index, boolean value) {
        array[index]=value;
    }

    @Override
    public void setElement(int index) {
        array[index]=true;
    }

    @Override
    public void resetElement(int index) {
        array[index]=false;
    }

    @Override
    public void toggleElement(int index) {
        array[index]=!array[index];
    }

    @Override
    public int countTrueElements() {
        int count = 0;
        for (boolean value: array) {
            if (value) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (boolean value: array){
            result.append(value ? '1' : '0');
        }
        result.append("]");
        return result.toString();
    }
}
