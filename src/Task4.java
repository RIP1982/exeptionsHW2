import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        getRequest();
    }

    public static void getRequest() {
        String request = (new Scanner(System.in)).nextLine();
        if (request.contains(" ") || request.equals("")) {
            throw new RuntimeException("do not enter empty lines");
        }
    }
}
