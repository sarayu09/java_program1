public class TypeCastingDemo {
    public static void main(String[] args) {
        // Type casting from int to long
        int intValue = 100;
        long longValue = intValue; // Implicit casting (widening)
        System.out.println("int to long: " + longValue);

        // Type casting from long to int
        long longNumber = 9876543210L;
        int intNumber = (int) longNumber; // Explicit casting (narrowing)
        System.out.println("long to int: " + intNumber);

        // Type casting from float to double
        float floatValue = 123.456f;
        double doubleValue = floatValue; // Implicit casting (widening)
        System.out.println("float to double: " + doubleValue);

        // Type casting from double to float
        double doubleNumber = 987.654;
        float floatNumber = (float) doubleNumber; // Explicit casting (narrowing)
        System.out.println("double to float: " + floatNumber);
    }
}
