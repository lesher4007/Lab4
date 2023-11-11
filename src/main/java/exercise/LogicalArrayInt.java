
package exercise;

public class LogicalArrayInt implements LogicalArray{
    private final int[] array = new int[size/32];

    @Override
    public int countTrueElements() {
        int count = 0;
        for (int i=0 ; i<size-1 ; i++){
            if (getElement(i)){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean getElement(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1<<bit;
        int element = array[indexArray];
        return (mask & element) == mask;
    }

    @Override
    public void setElement(int index, boolean value) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1<<bit;
        int element = array[indexArray];
        if (value){
            array[indexArray] = mask|element;
        } else {
            array[indexArray] = mask&element;
        }
    }

    @Override
    public void setElement(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1<<bit;
        int element = array[indexArray];
        array[indexArray] = mask|element;
    }

    @Override
    public void resetElement(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1<<bit;
        int element = array[indexArray];
        array[indexArray] = mask&element;
    }

    @Override
    public void toggleElement(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1<<bit;
        int element = array[indexArray];
        array[indexArray] = mask^element;
    }

    @Override
    public String toString() {
        String[] str = new String[size];
        for (int i=0 ; i<size-1 ; i++){
            str[i] = getElement(i) ? "1" : "0";
        }
        return String.join(", ", str);
    }
}
