package src.org.howard.edu.lsp.assignment5;


import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers with various operations like union, intersection, difference, etc.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default Constructor
     */
    public IntegerSet() {
    }

    /**
     * Constructor that initializes the set with given ArrayList
     * @param set the ArrayList to initialize the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal
     * @param o the object to compare with
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        IntegerSet that = (IntegerSet) o;
        return set.containsAll(that.set) && that.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value
     * @param value the value to check
     * @return true if the value is present, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Finds the largest item in the set
     * @return the largest integer in the set
     * @throws RuntimeException if the set is empty
     */
    public int largest() {
        if (isEmpty()) {
            throw new RuntimeException("Set is empty");
        }
        int max = set.get(0);
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Finds the smallest item in the set
     * @return the smallest integer in the set
     * @throws RuntimeException if the set is empty
     */
    public int smallest() {
        if (isEmpty()) {
            throw new RuntimeException("Set is empty");
        }
        int min = set.get(0);
        for (int num : set) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Adds an item to the set if not already present
     * @param item the integer to add to the set
     */
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if present
     * @param item the integer to remove from the set
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Performs union operation with another set (adds all elements from the other set)
     * @param intSetb the other IntegerSet to union with
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            add(num);
        }
    }

    /**
     * Performs intersection operation with another set (keeps only common elements)
     * @param intSetb the other IntegerSet to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs set difference operation (removes elements present in the other set)
     * @param intSetb the other IntegerSet to subtract
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs set complement operation (keeps elements not in the other set)
     * @param intSetb the other IntegerSet to complement against
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int num : intSetb.set) {
            if (!contains(num)) {
                complement.add(num);
            }
        }
        set = complement;
    }

    /**
     * Checks if the set is empty
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns string representation of the set
     * @return string representation of the set elements
     */
    @Override
    public String toString() {
        return set.toString();
    }
}