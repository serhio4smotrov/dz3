public class zad3 {
    public static void main(String[] args) {
        int year = 2021;
        if (year % 4 != 0 || year % 100 ==0 && year % 400 != 0) {
            System.out.println("год является невысокосным");
        } else {
            System.out.println("год является высокосным");
        }
    }
}
