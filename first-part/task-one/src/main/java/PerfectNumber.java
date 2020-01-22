
public  class PerfectNumber {

    protected static String findPerfectNumbers(int lowBound, int highBound) {
        String temp = "";
        for (int i = lowBound; i < highBound; i++) {
            if (isNumPerfect(i)) {
                temp += " " + i; //NOSONAR
            }
        }
        return temp;
    }


    public static boolean isNumPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}

