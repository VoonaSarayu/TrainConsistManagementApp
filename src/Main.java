public class Main {

    // Search method with exception handling
    public static boolean search(String[] bogieIds, String key) {

        // Fail-fast validation
        if (bogieIds.length == 0) {
            throw new RuntimeException("No bogies available in train.");
        }

        // Linear search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // MAIN METHOD (required for Run button)
    public static void main(String[] args) {

        System.out.println("===== UC20 Exception Handling =====");

        String[] bogieIds = {};  // empty case
        String searchKey = "BG101";

        try {
            boolean result = search(bogieIds, searchKey);

            if (result) {
                System.out.println("Bogie " + searchKey + " FOUND");
            } else {
                System.out.println("Bogie " + searchKey + " NOT FOUND");
            }

        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}