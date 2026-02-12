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
                    " для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения" +
                    " для Android по ссылке");
        }
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения" +
                    " для iOS по сслыке");
        }else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения" +
                    " для Android по сслыке" + "\n");
        }
        System.out.println("Задача 3");



    }
}