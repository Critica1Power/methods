public class Main {
    public void isLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s - високосный год\n", year);
        } else {
            System.out.printf("%s - не високосный год\n", year);
        }
    }

    public void checkAndPrintSuitableOs(int clientOS, int year) {
        if (clientOS == 0 && year == 2022) {
            System.out.println("Вам нужна современная версия для IOS");
        } else if (clientOS == 0 && year < 2022) {
            System.out.println("Вам нужна Lite версия для IOS");
        } else if (clientOS == 1 && year == 2022) {
            System.out.println("Вам нужна современная версия для Android");
        } else if (clientOS == 0 && year < 2022) {
            System.out.println("Вам нужна Lite версия для Android");
        } else {
            System.out.println("Ваша ОС не поддерживается");
        }
    }

    public int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20 && deliveryDistance > 0) {
            return 1;
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            return 2;
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            return 3;
        } else {
            throw new RuntimeException("Доставка невозможна");
        }
    }
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 2022;
        Main main = new Main();
        main.isLeapYearAndPrint(year);
        // Задание 2
        System.out.println("Задание 2");
        int clientOs = 0;
        main.checkAndPrintSuitableOs(clientOs, year);
        // Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        System.out.println(main.calculateDeliveryDays(deliveryDistance) + " количество дней доставки");
    }
}