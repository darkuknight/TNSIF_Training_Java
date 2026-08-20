package org.tnsif.acc.c2tc.wrapper;


public class WrapperDemo {
    public static void main(String[] args) {

        // BYTE
        byte primitiveByte = 1;
        Byte wrapperByte = primitiveByte;       // Auto-boxing
        System.out.println(wrapperByte);

        byte unboxByte = wrapperByte;            // Un-boxing
        System.out.println(unboxByte);


        // SHORT
        short primitiveShort = 2;
        Short wrapperShort = primitiveShort;     // Auto-boxing
        System.out.println(wrapperShort);

        short unboxShort = wrapperShort;         // Un-boxing
        System.out.println(unboxShort);


        // INT
        int primitiveInt = 3;
        Integer wrapperInt = primitiveInt;       // Auto-boxing
        System.out.println(wrapperInt);

        int unboxInt = wrapperInt;               // Un-boxing
        System.out.println(unboxInt);


        // LONG
        long primitiveLong = 4L;
        Long wrapperLong = primitiveLong;        // Auto-boxing
        System.out.println(wrapperLong);

        long unboxLong = wrapperLong;             // Un-boxing
        System.out.println(unboxLong);


        // FLOAT
        float primitiveFloat = 5.5f;
        Float wrapperFloat = primitiveFloat;     // Auto-boxing
        System.out.println(wrapperFloat);

        float unboxFloat = wrapperFloat;         // Un-boxing
        System.out.println(unboxFloat);


        // DOUBLE
        double primitiveDouble = 6.6;
        Double wrapperDouble = primitiveDouble;  // Auto-boxing
        System.out.println(wrapperDouble);

        double unboxDouble = wrapperDouble;      // un-boxing
        System.out.println(unboxDouble);


        // CHAR
        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar;   // Auto-boxing
        System.out.println(wrapperChar);

        char unboxChar = wrapperChar;            // Un-boxing
        System.out.println(unboxChar);


        // BOOLEAN
        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; // Auto-boxing
        System.out.println(wrapperBoolean);

        boolean unboxBoolean = wrapperBoolean;      // Un-boxing
        System.out.println(unboxBoolean);
    }
}