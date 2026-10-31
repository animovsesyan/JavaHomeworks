//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Variables {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        System.out.println(a + "," + b);
        short c = 3;
        short d = 4;
        System.out.println(c + "," + d);
        int e = 5;
        int f = 6;
        System.out.println(e + "," + f);
        long g = 7;
        long h = 8;
        System.out.println(g + "," + h);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);

        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE);

        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Min: " + Integer.MIN_VALUE);

        System.out.println("Long Max: " + Long.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE);

        byte x = 0b00000001;
        int y = 0b00000000000000000000000000000010;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        float j = 1.1f;
        float k = 2.2f;
        System.out.println("Float: " + j + ", " + k);

        double l = 3.3;
        double m = 4.4;
        System.out.println("Double: " + l + ", " + m);

        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE);

        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);

        /* Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,
                իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?
                float - 12.345, 8923.1234857, 3456.091
                double - 34.567839023  */

        char n = 'a';
        char o = 'b';
        System.out.println(n + "," + o);

        char s = 77;
        char w = 109;

        System.out.println(s);
        System.out.println(w);

        boolean p = true;
        boolean q = false;
        System.out.println(p + "," + q);

        System.out.println('K');
        System.out.println('\u004B');
        System.out.println((char) 75);
        char t = 75;
        System.out.println(t);

       /* Ի՞նչ կտպի կոդի այս հատվածը և ինչու՞։
        int year = 201l;
        System.out.print (year);
        ոչինչ չի տպի, որովհետև այն չի կոմպիլացվի։
        */

    }
}