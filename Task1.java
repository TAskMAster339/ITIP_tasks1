public class Task1 {
    public static void main(String[] args) {
    }

    // 1
    public static double convert(int numGal) {
        return 3.785D * numGal;
    }

    // 2
    public static int fitCalc(int min, int level) {
        return min * level;
    }

    // 3
    public static int containers(int boxes, int bags, int barrels) {
        return boxes * 20 + bags * 50 + barrels * 100;
    }

    // 4
    public static String triangleType(int x, int y, int z) {
        if (x + y < z || x + z < y || z + y < x) {
            return "not a triangle";
        }
        if (x == y && y == z) {
            return "equilateral";
        }
        if (x == y || y == z || z == x) {
            return "isosceles";
        }
        return "different-sided";
    }

    // 5
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }

    // 6
    public static int howManyItems(int matLen, double height, double width) {
        return (int) (matLen / (height * width * 2));
    }

    // 7
    public static long factorial(int num) {
        long result = 1;
        while (num > 0) {
            result *= num--;
        }
        return result;
    }

    // 8
    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return (a + b);
    }

    // 9
    public static long ticketSaler(int num, int price) {
        double fee = 0.72;
        return Math.round(fee * num * price);
    }

    // 10
    public static int tables(int students, int numTables) {
        if (numTables * 2 >= students) {
            return 0;
        }
        int numNeed = students - numTables * 2;
        if (numNeed % 2 == 0) {
            return numNeed / 2;
        }
        return numNeed / 2 + 1;
    }
}
