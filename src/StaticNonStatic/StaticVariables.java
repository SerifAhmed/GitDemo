package StaticNonStatic;

class StaticVariables {
    // 1. Direct initialization at declaration
    static int a = 10;

    // 2. Declared but initialized in static block
    static int b;
    static {
        b = 20;
    }

    // 3. Initialized inside a static method
    static int c;
    static void setC() {
        c = 30;
    }

    // 4. Assigned inside a constructor
    static int d;
    StaticVariables() {
        d = 40;
    }

    // 5. Assigned inside an instance method
    static int e;
    void setE() {
        e = 50;
    }

    public static void main(String[] args) {
        // call static method to initialize c
    	StaticVariables.setC();

        // create object so constructor runs
    	StaticVariables t1 = new StaticVariables();

        // call instance method to assign e
        t1.setE();

        System.out.println("a = " + a);  // 10
        System.out.println("b = " + b);  // 20
        System.out.println("c = " + c);  // 30
        System.out.println("d = " + d);  // 40
        System.out.println("e = " + e);  // 50
    }
}
