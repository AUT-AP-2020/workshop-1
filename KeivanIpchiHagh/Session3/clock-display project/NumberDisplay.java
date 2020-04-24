/**
 * <h1>Number Display Class</h1>
 * This class stores each clock's partition information
 * @author Keivan Ipchi Hagh
 * @version 1.0.2
 */
class NumberDisplay {

    /**
     * Primary value of the object
     */
    private int value;

    /**
     * Limit for the value
     */
    private int limit;

    /**
     * NumberDisplay Constructor
     * Initializes object fields
     * @param value Value
     * @param limit Limit
     */
    public NumberDisplay(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    /**
     * Increases value; If value reached the boundaries, Then reset to '0'
     */
    public void increment() {
        if (++value >= limit)
            value = 0;
    }

    /**
     * Get Format Display
     * @return Formatted value
     */
    public String getFormatDisplay() {
        return String.format("%02d", value);
    }

    /**
     * Getter: Get value
     * @return Value
     */
    public int getValue() {
        return value;
    }
}