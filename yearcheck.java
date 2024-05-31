public class yearcheck {
    public static void main(String[] args) {
        int year = 2020;
        System.out.println(year + " високосный? " + isLeapYear(year));
    }
    
    public static String isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return "ДА";
        } else {
            return "НЕТ";
        }
    }
}
