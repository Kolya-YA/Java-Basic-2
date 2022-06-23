package com.telran.berlin.homeworks;

public class Vars {

    char charVar = 'G';             // a single character/letter or ASCII values — 16 bit
    int integerVar = 89;            // -2147483648 <=> 2147483647 — 32 bit
    byte byteVar = 4;               // -128 <=> 127 — 8 bit
    short shortVar = 56;            // -32768 <=> 32767 — 16 bit
    float floatVar = 4.7333436f;    // to 7 decimal digits — 32 bit
    double doubleVar = 4.355453532; // to 15 decimal digits — 64 bit
    long longVar = 12121L;          // 9223372036854775808 to 9223372036854775807 — 64 bit

    public void printAllVars() {
        System.out.println("char: " + charVar);
        System.out.println("integer: " + integerVar);
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("float " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("longVar: " + longVar);
    }
}
