package org.howard.edu.lsp.assignment6;

/**
 * Test driver for the IntegerSet class
 */
public class Driver {
    public static void main(String[] args) {
        // Test basic operations
        IntegerSet set1 = new IntegerSet();
        System.out.println("Initial Set1: " + set1);
        System.out.println("Is Set1 empty? " + set1.isEmpty());
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("After adding elements, Set1: " + set1);
        System.out.println("Is Set1 empty? " + set1.isEmpty());
        System.out.println("Length of Set1: " + set1.length());
        System.out.println("Smallest in Set1: " + set1.smallest());
        System.out.println("Largest in Set1: " + set1.largest());
        
        // Test contains and remove
        System.out.println("Does Set1 contain 2? " + set1.contains(2));
        set1.remove(2);
        System.out.println("After removing 2, Set1: " + set1);
        System.out.println("Does Set1 contain 2? " + set1.contains(2));
        
        // Test union
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        System.out.println("\nSet1: " + set1);
        System.out.println("Set2: " + set2);
        set1.union(set2);
        System.out.println("After union, Set1: " + set1);
        
        // Test intersection
        IntegerSet set3 = new IntegerSet();
        set3.add(3);
        set3.add(4);
        set3.add(6);
        
        System.out.println("\nSet1: " + set1);
        System.out.println("Set3: " + set3);
        set1.intersect(set3);
        System.out.println("After intersection, Set1: " + set1);
        
        // Test difference
        IntegerSet set4 = new IntegerSet();
        set4.add(4);
        
        System.out.println("\nSet1: " + set1);
        System.out.println("Set4: " + set4);
        set1.diff(set4);
        System.out.println("After difference (Set1 - Set4), Set1: " + set1);
        
        // Test complement
        IntegerSet set5 = new IntegerSet();
        set5.add(1);
        set5.add(3);
        set5.add(5);
        
        System.out.println("\nSet1: " + set1);
        System.out.println("Set5: " + set5);
        set1.complement(set5);
        System.out.println("After complement (elements in Set5 not in Set1), Set1: " + set1);
        
        // Test equals
        IntegerSet set6 = new IntegerSet();
        set6.add(1);
        set6.add(5);
        
        IntegerSet set7 = new IntegerSet();
        set7.add(5);
        set7.add(1);
        
        System.out.println("\nSet6: " + set6);
        System.out.println("Set7: " + set7);
        System.out.println("Are Set6 and Set7 equal? " + set6.equals(set7));
        
        // Test clear
        set6.clear();
        System.out.println("\nAfter clearing Set6: " + set6);
    }
}