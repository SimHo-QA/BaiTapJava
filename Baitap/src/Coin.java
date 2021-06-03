public class Coin {
    private int value;
    private static final int maxValue = 3;
    private static final int minValue = 1;
    public Coin(){
        setValue(
                (int)Math.floor(Math.random()*(maxValue-minValue+1)+minValue)
        );
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
