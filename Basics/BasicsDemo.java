class BasicsDemo {
        // 1. Namin
    //  
      // ules for classes
          // a) First Charact
            // Remaining: letter, underscore, $, number
            // b) No reserved 
              
            // 2. **Java is case-sens
            int id1 = 0; 
            int id = 1; 
     

    
        
              / 
     
     
        System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
        System.out.println(); // Print empty line
        System.out.print("Hello, world!!"); // Cursor stayed after the printed string
        System.out.println("Hello,");
        System.out.print(" "); // Print a space
        System.out.print("world!!");
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
};