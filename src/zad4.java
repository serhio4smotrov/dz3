public class zad4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else {
            deliveryTime = (deliveryDistance + 20) / 40 +1;
        }
        System.out.println("Потребуется дней: "+deliveryTime);
    }
}
