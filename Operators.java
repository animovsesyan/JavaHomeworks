public class Operators {

     //1. Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը

    public static void printActionsForInt(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));
    }

    //2. Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.

    public static void printActionsForDouble(double c, double d) {
        System.out.println("c + d = " + (c + d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c % d = " + (c % d));
    }

    //4. Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում  հետևյալը․
    public static void printActionsForUnaryOperators(int e, int f, boolean n1) {
        System.out.println("-e =" + -e);
        System.out.println("-f =" + -f);
        System.out.println("+e =" + +e);
        System.out.println("-e + 92 =" + (-e + 92));
        System.out.println("!n1 =" + !n1);
        System.out.println("!(!n1) =" + !(!n1));
        System.out.println("e++ =" + e++);
        System.out.println("--f =" + --f);
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }

    //6․ Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
    public static void printRelationalOperators(int x, int y) {
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);

    }
    /*
     Additional  tasks
     7. Գտնե և ուղղել սխալը․

     1) float y = 2.1;  should be float y = 2.1f;

     2) byte x = 5;
        byte y = 10;
        byte z = x + y;  should be byte z = (byte) (x + y);

     3) short x = 10;
        short y = 3;
        short z = x * y; should be short z = (short) (x * y);


     4) long x = 10;
        int y = 5;
        y = y * x; should be y = (int) (y * x);

     8․ Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5
        այնուհետև փոփոխականի արժեքները տեղերով փոխել։
        int a = 10, b = 5;
        int temp = a;
        a = b;
        b = temp;
     9․ Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
        int a = 10, b = 5
        ;
        a = a + b;
        b = a - b;
        a = a - b;
     10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
         int Sum = 100 * (100 + 1) / 2;
    */

    //11․ Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
    public static void printBitwiseAndLogicalOperators(int a, int b) {
        System.out.println("a & b = " + (a & b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a | b = " + (a | b));
        System.out.println("~a = " + (~a));
        System.out.println("true || (a < 4) = " + (true || (a < 4)));
        System.out.println("(b >= 6) || (++a <= 7) = " + ((b >= 6) || (++a <= 7)));
        System.out.println("(a < b) ? a : b = " + ((a < b) ? a : b));
        System.out.println("b ^ b = " + (b ^ b));
    }
    //12․ Տպել console -ում  հետևյալը․
    public static void printForShiftOperator() {
        System.out.println("10 << 2 = " + (10 << 2));
        System.out.println("-10 << 3 = " + (-10 << 3));
        System.out.println("20 >> 2 = " + (20 >> 2));
        System.out.println("15 >> 3 = " + (15 >> 3));
        //Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
        int a = 5;
        System.out.println("a * 8 = " + (a << 3));
        System.out.println("a * 16 = " + (a << 4));
    }
    public static void main(String[] args) {
        printActionsForInt(8,6);
        printActionsForDouble(6.4,0.03);
        // 3․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները
        int x1,y1;
        System.out.println(x1 = 2 * ((5 + 3) * 4 - 8));
        System.out.println(y1 = 2 * 5 + 3 * 4 - 8 );

        printActionsForUnaryOperators(10,  -88, true);
        //5․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
        int x = (int) 1.0;
        System.out.println(x);

        short y = (short) 1921222;
        System.out.println(y);

        System.out.println(2147483647 + 1);

        long z = (x = 3);
        System.out.println(z);

        boolean a = false;
        boolean b = (a = true);
        System.out.println(x);

        printRelationalOperators(10,20);
        printBitwiseAndLogicalOperators(8, 3);
        printForShiftOperator();
    }

}