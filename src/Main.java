import java.util.Arrays;

public class Main {

    // ✅ Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Precondition: sort array
        Arrays.sort(bogieIds);

        int left = 0;
        int right = bogieIds.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int compare = bogieIds[mid].compareTo(key);

            if (compare == 0) {
                return true; // found
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; // not found
    }

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

        System.out.println("\nUC19 search completed...");
    }
}