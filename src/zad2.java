public class zad2 {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS");
            }
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android");
            }
        }
    }
}
