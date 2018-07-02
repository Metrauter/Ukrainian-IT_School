package homeworks.lesson3.task2;

public class Tranformation {

    public static void main(String[] args) {
        tByte();
        tShort();
        tChar();
        tInt();
        tLong();
        tFloat();
        tDouble();
    }

    private static void tByte() {
        byte bByte = 22;
        byte b = bByte;
        short s = (short) bByte;
        char c = (char) bByte;
        int i = (int) bByte;
        long l = (long) bByte;
        float f = (float) bByte;
        double d = (double) bByte;
        System.out.println("Base type is byte: b = " + bByte);
        System.out.println("From byte to byte: " + bByte);
        System.out.println("From byte to short: " + s);
        System.out.println("From byte to char: " + c + "(" + bByte + ")");
        System.out.println("From byte to int:  " + i);
        System.out.println("From byte to long: " + l);
        System.out.println("From byte to float: " + f);
        System.out.println("From byte to double: " + d);
        System.out.println("From byte to boolean:  Can't be casted to boolean type!\n");
    }

    private static void tShort() {
        short sShort = 294;
        byte b = (byte) sShort;
        char c = (char) sShort;
        int i = (int) sShort;
        long l = (long) sShort;
        float f = (float) sShort;
        double d = (double) sShort;
        System.out.println("Base type is short: s = " + sShort);
        System.out.println("From short to byte: " + b);
        System.out.println("From short to short: " + sShort);
        System.out.println("From short to char: " + c + "(" + sShort + ")");
        System.out.println("From short to int:  " + i);
        System.out.println("From short to long: " + l);
        System.out.println("From short to float: " + f);
        System.out.println("From short to double: " + d);
        System.out.println("From short to boolean:  Can't be casted to boolean type!\n");
    }

    private static void tChar() {
        char cChar = '\u2660';
        byte b = (byte) cChar;
        short s = (short) cChar;
        int i = (int) cChar;
        long l = (long) cChar;
        float f = (float) cChar;
        double d = (double) cChar;

        System.out.println("Base type is char: ch = " + cChar);
        System.out.println("From char to byte: " + b);
        System.out.println("From char to short: " + s);
        System.out.println("From char to char: " + cChar + "(" + ((int) cChar) + ")");
        System.out.println("From char to int: " + i);
        System.out.println("From char to long: " + l);
        System.out.println("From char to float: " + f);
        System.out.println("From char to double: " + d);
        System.out.println("From char to boolean:  Can't be casted to boolean type!\n");
    }

    private static void tInt() {
        int iInt = 3632;
        byte b = (byte) iInt;
        short s = (short) iInt;
        char c = (char) iInt;
        long l = (long) iInt;
        float f = (float) iInt;
        double d = (double) iInt;

        System.out.println("Base type is int: i = " + iInt);
        System.out.println("From int to byte: " + b);
        System.out.println("From int to short: " + s);
        System.out.println("From int to char: " + c + "(" + (int) c + ")");
        System.out.println("From int to int: " + iInt);
        System.out.println("From int to long: " + l);
        System.out.println("From int to float: " + f);
        System.out.println("From int to double: " + d);
        System.out.println("From int to boolean:   Can't be casted to boolean type!\n");
    }

    private static void tLong() {
        long lLong = 32523857238L;
        byte b = (byte) lLong;
        short s = (short) lLong;
        char c = (char) lLong;
        int i = (int) lLong;
        float f = (float) lLong;
        double d = (double) lLong;

        System.out.println("Base type is long: l = " + lLong);
        System.out.println("From long to byte: " + b);
        System.out.println("From long to short: " + s);
        System.out.println("From long to char: " + c + "(" + (int) c + ")");
        System.out.println("From long to int: " + i);
        System.out.println("From long to long: " + lLong);
        System.out.println("From long to float: " + f);
        System.out.println("From long to double: " + d);
        System.out.println("From long to boolean:  Can't be casted to boolean type!\n");
    }

    private static void tFloat() {
        float fFloat = 421.65147f;
        byte b = (byte) fFloat;
        short s = (short) fFloat;
        char c = (char) fFloat;
        int i = (int) fFloat;
        long l = (long) fFloat;
        double d = (double) fFloat;

        System.out.println("Base type is float: f = " + fFloat);
        System.out.println("From float to byte: " + b);
        System.out.println("From float to short: " + s);
        System.out.println("From float to char: " + c + "(" + (int) c + ")");
        System.out.println("From float to int: " + i);
        System.out.println("From float to long: " + l);
        System.out.println("From float to float: " + fFloat);
        System.out.println("From float to double: " + d);
        System.out.println("From float to boolean: Can't be casted to boolean type!\n");
    }

    private static void tDouble() {
        double dDouble = 74324.238423423;
        byte b = (byte) dDouble;
        short s = (short) dDouble;
        char c = (char) dDouble;
        int i = (int) dDouble;
        long l = (long) dDouble;
        float f = (float) dDouble;

        System.out.println("Base type is double: d = " + dDouble);
        System.out.println("From double to byte: " + b);
        System.out.println("From double to short: " + s);
        System.out.println("From double to char: " + c + "(" + (int) c + ")");
        System.out.println("From double to int: " + i);
        System.out.println("From double to long: " + l);
        System.out.println("From double to float: " + f);
        System.out.println("From double to double: " + dDouble);
        System.out.println("From double to boolean: Can't be casted to boolean type!\n");
    }
}