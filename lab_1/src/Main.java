import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String args []) {
        //Task3();
        //Task4();
        //Task5();
        Task6();
    }

    public static void Task3()
    {
        var scanner = new Scanner(System.in);
        var one = scanner.nextInt();
        var two = scanner.nextInt();
        var three = scanner.nextInt();
        System.out.println(Max(one, two, three));
    }

    public static void Task4()
    {
        var scanner = new Scanner(System.in);
        var numbers = scanner.nextLine();
        var arrayOfNumbers = Arrays.stream(numbers.split(" ")).mapToInt((value -> Integer.parseInt(value))).toArray();
        var positiveNumbers = Arrays.stream(arrayOfNumbers).filter((value -> value > 0)).toArray();

        int min = 99999;
        int max = -99999;

        for (var number: positiveNumbers) {
            min = Min(min, number);
            max = Max(max, number);
        }

        System.out.println(String.format("Max: %d Min: %d", max, min));
    }

    public static void Task5()
    {
        var doubleNumber = 2.653;
        int number = (int) doubleNumber;
        System.out.println(number);
    }

    public static void Task6()
    {
        var scanner = new Scanner(System.in);
        BigInteger number = BigInteger.valueOf(scanner.nextInt());
        System.out.println(Factorial(number));
    }

    private static int Max(int n1, int n2, int n3)
    {
        return Max(Max(n1, n2), n3);
    }

    private static int Max(int n1, int n2)
    {
        return n1 > n2 ? n1 : n2;
    }

    private static int Min(int n1, int n2)
    {
        return n1 < n2 ? n1 : n2;
    }

    private static BigInteger Factorial(BigInteger n)
    {
        if (n.compareTo(BigInteger.valueOf(0)) == 1)
        {
            return Factorial(n.subtract(BigInteger.ONE)).multiply(n);
        }

        return BigInteger.valueOf(1);
    }
}