

/* public class Exercise1 {
    public void printHello() {
        System.out.println("Hello from SuperClass");
        return;
    }
}

    public class SubClass extends Exercise1 {
        public void printHello() {
            super.printHello();
            System.out.println("Hello from SubClass");
            return;
        }
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.printHello();
    }
*/


    public class SubClass extends SuperClass {
        public void printHello() {
            super.printHello();
            System.out.println("Hello from SubClass");

        }


        public static void main(String[] args) {
            System.out.println("Hello This is Exercise 1 !!!");
            SubClass obj = new SubClass();
            obj.printHello();


        }
    }
