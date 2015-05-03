package main.java.com.example;

/**
 * Created by marcelsato on 5/3/15.
 */
public class Item implements Comparable<Item> {
    private int value;
    private int count;

    public int getCount() {
        return count;
    }

    public int getValue() {
        return value;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addCount() {
        this.count++;
    }

    @Override
    public int compareTo(Item other) {
        return ((Integer)other.getCount()).compareTo(getCount());
//        if (this.getCount() <= other.getCount()) {
//            return 1;
//        }
//
//        return -1;
    }

    @Override // used in pair with hashCode
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        return value == item.value;

    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "Item [" +
                "value=" + value +
                ", count=" + count +
                ']';
    }
}
