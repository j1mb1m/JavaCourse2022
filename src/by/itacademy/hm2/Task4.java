package by.itacademy.hm2;

public class Task4 {

    public static void main(String[] args) {

        byte b = -110;
        char c = 'r';
        short s = 220;
        int i = 522200447;
        long l = 0xffffffffL;
        float f = 46.25f;
        double d = 378.00001234;

        сonversion(b);
        сonversion(c);
        сonversion(s);
        сonversion(i);
        сonversion(l);
        сonversion(f);
        сonversion(d);
    }

    public static void сonversion(byte b) {
        char c = (char) b;
        short s = b;
        int i = b;
        long l = b;
        float f = b;
        double d = b;

        System.out.println("Convert byte \"" + b + "\" to ");
        System.out.println("char : " + c);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println();
    }

    public static void сonversion(char c) {
        byte b = (byte) c;
        short s = (short) c;
        int i = c;
        long l = c;
        float f = c;
        double d = c;

        System.out.println("Convert char \"" + c + "\"  to ");
        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println();
    }

    public static void сonversion(short s) {
        byte b = (byte) s;
        char c = (char) s;
        int i = s;
        long l = s;
        float f = s;
        double d = s;

        System.out.println("Convert short \"" + s + "\"  to ");
        System.out.println("byte : " + b);
        System.out.println("char : " + c);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println();

    }

    public static void сonversion(int i) {
        byte b = (byte) i;
        char c = (char) i;
        short s = (short) i;
        long l = i;
        float f = i;
        double d = i;

        System.out.println("Convert int \"" + i + "\"  to ");
        System.out.println("byte : " + b);
        System.out.println("char : " + c);
        System.out.println("short : " + s);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println();

    }

    public static void сonversion(long l) {
        byte b = (byte) l;
        char c = (char) l;
        short s = (short) l;
        int i = (int) l;
        float f = l;
        double d = l;

        System.out.println("Convert long \"" + l + "\"  to ");
        System.out.println("byte : " + b);
        System.out.println("char : " + c);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println();
    }

    public static void сonversion(float f) {
        byte b = (byte) f;
        char c = (char) f;
        short s = (short) f;
        int i = (int) f;
        long l = (long) f;
        double d = f;

        System.out.println("Convert float \"" + f + "\"  to ");
        System.out.println("byte : " + b);
        System.out.println("char : " + c);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("double : " + d);
        System.out.println();
    }

    public static void сonversion(double d) {

        byte b = (byte) d;
        char c = (char) d;
        short s = (short) d;
        int i = (int) d;
        long l = (long) d;
        float f = (float) d;

        System.out.println("Convert double \"" + d + "\"  to ");
        System.out.println("byte : " + b);
        System.out.println("char : " + c);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println();
    }
}
