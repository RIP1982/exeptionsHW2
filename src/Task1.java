import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Task1 {
    public static void main(String[] args) {
        getRequest();
    }

    public static void getRequest() {
        Logger logger = Logger.getAnonymousLogger();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input num: ");
            Float requestNum = scanner.nextFloat();
            logger.info(requestNum.toString());
        } catch (InputMismatchException e) {
            getRequest();
        }
    }
}