public class delitel {
    public static void main(String[] args) {
        int number = 57;
        System.out.println("Наименьший делитель " + number + " это " + smallestDivisor(number));
    }

    public static int smallestDivisor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
