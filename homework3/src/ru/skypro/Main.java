package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int clientOS = 0;
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
    if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }



    int clientOS = 0;
    int clientDeviceYear = 2015;

    if (clientOS == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOS == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (clientOS == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }





        int year = 2021;
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        if (isLeapYear) {
            System.out.println("Год високосный");
    } else {
            System.out.println("Год не является високосным");
        }





        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + (deliveryTime + 2));
        }






        int monthNumber = 12;

        switch (monthNumber): {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



}
