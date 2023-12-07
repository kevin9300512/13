public class EX07 {
    public static void main(String[] args) {
        int num = 12, den = 0;

        try {
            if (den != 0) {
                int result = num / den;
                System.out.println("Result of division: " + result);
            } else {
                throw new ArithmeticException("除數為0");
            }
        } catch (Exception e) {
            System.out.println("捕捉到例外了: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("End of main()!!");
    }
}
