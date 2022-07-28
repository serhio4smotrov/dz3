public class zad5 {
    public static void main(String[] args) {
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц относится к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц относится к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц относится к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц относится к осени");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
