//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения " +
                        "для iOS по ссылке" + "\n");
                break;
            case 1:
                System.out.println("Установите версию приложения " +
                    "для Android по ссылке" + "\n");
                break;
            default:
                System.out.println("Выберите подходящую OS" + "\n");
        }
        System.out.println("Задача 2");
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения" +
                    " для iOS по ссылке" + "\n");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения" +
                    " для Android по ссылке" + "\n");
        }
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения" +
                    " для iOS по сслыке" + "\n");
        }else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения" +
                    " для Android по сслыке" + "\n");
        }
        System.out.println("Задача 3");
        int year =  2025;
        if (year <= 1584) {
            System.out.println(year + " год не является високосным" + "\n");
        }boolean leapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным" + "\n");
        }else {
            System.out.println(year + " год не является високосным" + "\n");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1" + "\n");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2" + "\n");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3" + "\n");
        } else {
            System.out.println("Доставки нет" + "\n");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        if (monthNumber < 1 || monthNumber> 12) {
            System.out.println("Ошибка, выберите месяц от 1 до 12");
        }else {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

        }
        }
    }
}