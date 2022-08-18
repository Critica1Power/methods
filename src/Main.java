public class Main {
    public void isLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s - високосный год\n", year);
        } else {
            System.out.printf("%s - не високосный год\n", year);
        }
    }
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 2022;
        Main main = new Main();
        main.isLeapYearAndPrint(year);

    }
}