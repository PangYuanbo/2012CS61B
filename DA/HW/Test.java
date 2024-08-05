class Test {

    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        }
    }

    static void method() {
        String s = "5.6";
        Integer.parseInt(s); // Cause a NumberFormatException

        int i = 0;
        int y = 2 / i; // This will cause an ArithmeticException

        System.out.println("Welcome to Java");
    }
}
