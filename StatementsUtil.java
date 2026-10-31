//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class StatementsUtil {

    //1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    //2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.
    public static boolean isPositive(int x) {
        return x > 0;
    }

    //3․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից
    //Կամ փոքր  20 ից և մեծ 15 ից ․
    public static boolean isInRange(int x) {
        return (x < 8 && x > 5) || (x < 20  && x > 15);
    }

    //4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.
    public static boolean isDivisible(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    //5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
    public static boolean has7AsSecondDigit(int x) {
        return (x / 10) % 10 == 7;
    }

    //6․ Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։
    public static boolean isInsideCircle(double x, double y) {
        return x * x + (y - 5) * (y - 5) <= 25;
    }

    //7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    //8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։ (նահանջ է համարվում այն տարին
    // որը բաժանվում է 4, բայց բացառություն է արվում այն տարիների համար, որոնք 100-ի բաժանվող են։ Այդ տարիները
    // նահանջ են միայն, եթե նաև բաժանվում են 400-ի։)
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․
    public static void printI() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    //12․  Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը.
    public static void printFirstDigit(int x) {
        if (x < 0) {
            x = -x;
        }
        while (x >= 10) {
            x = x / 10;
        }
        System.out.println(x);
    }

    //13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը․
    public static void printSum() {
        int x = 1;
        int y = 0;

        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    //4. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։
    public static void printSquare() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //15․ Գրել method, որը console -ից ստանում է N թիվը և հաշվում է [1-N] բոլոր 5 -ի բաժանվող թվերի գումարը։
    public static void sumOfMultiplesOf5(int n) {
        int sum = 0;

        for (int i = 5; i <= n; i += 5) {
            sum += i;
        }
        System.out.println(sum);
    }
    //16. Գրել method, որը հաշվում է [1-N] բոլոր երկնիշ զույգ թվերի արտադրյալը։
    public static void productOfEvenNumbers(int n) {
        int product = 1;

        for (int i = 10; i <= n; i += 2) {
            product *= i;
        }

        System.out.println(product);
    }

    //17․ Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է  մեծագույն և փոքրագույն տարրերը և հաշվում նրանց թվաբանական միջինը։
    public static void findAverage(int n) {
        int min = 1;
        int max = 1;

        for (int i = 1; i <= n; i++) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        double average = (min + max) / 2.0;
        System.out.println(average);
    }

    //18․ Գրել method, որը  ստանում է 5 - անիշ ամբողջ թիվ  և հաշվում  այդ թվի թվանշանների գումարը։
    public static void sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println(isEven(13));
        System.out.println(isPositive(-25));
        System.out.println(isInRange(17));
        System.out.println(isDivisible(-70));
        System.out.println(has7AsSecondDigit(374));
        System.out.println(isInsideCircle(2, 6));
        System.out.println(maxOfThree(12, 45, 28));
        System.out.println(isLeapYear(2000));

        printI();
        printFirstDigit(28765);
        printSum();
        printSquare();
        sumOfMultiplesOf5(30);
        productOfEvenNumbers(14);
        findAverage(20);
        sumOfDigits(12221);
    }
}
