import java.util.TreeSet;

public class MergeTreeSets {

    // Method to merge two TreeSets
    public static TreeSet<Integer> mergeSets(TreeSet<Integer> set1, TreeSet<Integer> set2) {
        TreeSet<Integer> merged = new TreeSet<>(set1); // Add all elements from set1
        merged.addAll(set2); // Add all elements from set2 (duplicates will be ignored)
        return merged;
    }

    // Main method to test the merge
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        // Sample data
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);

        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(7);

        // Merging sets
        TreeSet<Integer> mergedSet = mergeSets(set1, set2);

        // Display result
        System.out.println("Merged TreeSet: " + mergedSet);
    }
}
