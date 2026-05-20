public class DataTypeSizeRange {
    public static void main(String[] args) {

        // byte
        System.out.println("BYTE");
        System.out.println("Size: " + Byte.SIZE + " bits");
        System.out.println("Minimum Value: " + Byte.MIN_VALUE);
        System.out.println("Maximum Value: " + Byte.MAX_VALUE);

        // short
        System.out.println("\nSHORT");
        System.out.println("Size: " + Short.SIZE + " bits");
        System.out.println("Minimum Value: " + Short.MIN_VALUE);
        System.out.println("Maximum Value: " + Short.MAX_VALUE);

        // int
        System.out.println("\nINTEGER");
        System.out.println("Size: " + Integer.SIZE + " bits");
        System.out.println("Minimum Value: " + Integer.MIN_VALUE);
        System.out.println("Maximum Value: " + Integer.MAX_VALUE);

        // long
        System.out.println("\nLONG");
        System.out.println("Size: " + Long.SIZE + " bits");
        System.out.println("Minimum Value: " + Long.MIN_VALUE);
        System.out.println("Maximum Value: " + Long.MAX_VALUE);

        // float
        System.out.println("\nFLOAT");
        System.out.println("Size: " + Float.SIZE + " bits");
        System.out.println("Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Maximum Value: " + Float.MAX_VALUE);

        // double
        System.out.println("\nDOUBLE");
        System.out.println("Size: " + Double.SIZE + " bits");
        System.out.println("Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Maximum Value: " + Double.MAX_VALUE);

        // char
        System.out.println("\nCHARACTER");
        System.out.println("Size: " + Character.SIZE + " bits");
        System.out.println("Minimum Value: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum Value: " + (int) Character.MAX_VALUE);

        // boolean
        System.out.println("\nBOOLEAN");
        System.out.println("Boolean values are: true or false");
    }
}