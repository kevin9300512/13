import java.util.Scanner;

class IntegerLessThanZeroException extends Exception {
    public IntegerLessThanZeroException(String message) {
        super(message);
    }
}

class IntegerGreaterThanZeroException extends Exception {
    public IntegerGreaterThanZeroException(String message) {
        super(message);
    }
}

class IntegerEqualZeroException extends Exception {
    public IntegerEqualZeroException(String message) {
        super(message);
    }
}

public class EX17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("請輸入一個整數值: ");
            int input = scanner.nextInt();

            processInteger(input);
        } catch (IntegerLessThanZeroException e) {
            System.out.println("Caught IntegerLessThanZeroException: " + e.getMessage());
        } catch (IntegerGreaterThanZeroException e) {
            System.out.println("Caught IntegerGreaterThanZeroException: " + e.getMessage());
        } catch (IntegerEqualZeroException e) {
            System.out.println("Caught IntegerEqualZeroException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught an unexpected exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void processInteger(int value) throws IntegerLessThanZeroException, IntegerGreaterThanZeroException, IntegerEqualZeroException {
        if (value < 0) {
            throw new IntegerLessThanZeroException("您輸入的整數的值小於0");
        } else if (value > 0) {
            throw new IntegerGreaterThanZeroException("您輸入的整數的值大於0");
        } else {
            throw new IntegerEqualZeroException("您輸入的整數的值為0");
        }
    }
}
