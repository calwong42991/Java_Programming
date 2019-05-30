class BasicsDemo {
    // 1. Naming rules for classes/methods/variables
    // a) First Character: letter, underscore, $
    // Remaining: letter, underscore, $, numbers
    // b) No reserved keywords

    // 2. **Java is case-sensitive
    int id1 = 0;
    int id = 1;
    int ID = 2;

    void foo() {
    };

    // 3. Printing to console
    static void printA() {
        System.out.println("\n\nInside Print ...");
        System.out.print("HELLO");
    }

    // 4. Comments or disabling code

    /* This code is disabled */

    // 5. Arithmetic Operations

    static void printB() {
        int a = 2;
        int b = 6;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public static void main(String[] args) {
        printB();
    }
}
