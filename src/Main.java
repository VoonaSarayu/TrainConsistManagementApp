import java.util.Arrays;

public class Main {
    // Linear Search Method

    public static void main(String[] args) {

        System.out.println("\nUC19 Binary Search for Bogie ID\n");

        // Create array
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String key = "BG309";

        // Sort before search
        Arrays.sort(bogieIds);

        // Display
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Search
        boolean found = binarySearch(bogieIds, key);

        // Result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }


    }
}