package todo;

public class Todo {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);

        String begining = "My todo:\n";
        String ending1 = "- Download games\n";
        String ending2 = "     - Diablo";
        String todoList = "";

        for (int i = 0; i < todoText.length(); i++) {
            todoList+= todoText.charAt(i);
            if (i == 0) {
                todoList+= begining + " ";
            }
            if (i == todoText.length() - 1) {
                todoList+= " " +ending1 + ending2;
            }
        }

        System.out.println(todoList);

    }
}
