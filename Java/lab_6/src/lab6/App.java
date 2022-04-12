package lab6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        TransportRefService service = getService();
        System.out.println("Вывод всех маршрутов:");
        service.printAllPaths();
        System.out.println();
        System.out.println("Автобусы маршрута Рязань – Тума:");
        service.printBus("Рязань", "Тума");
        System.out.println("Автобусы маршрута Гусь-Железный – Спас-Клепики:");
        service.printBus("Гусь-Железный", "Спас-Клепики");
        System.out.println("Автобусы маршрута Спас-Клепики – Тума на 15.04.2022:");
        service.printBus("Спас-Клепики", "Тума", LocalDate.of(2022, 4, 22));
    }

    static TransportRefService getService(){
        TransportRefService service = new TransportRefService();
        service.addBus(service.buildTransInfo("Рязань", LocalTime.of(18, 25))
                .addToPath("Спас-Клепики", LocalTime.of(19, 55), 222)
                .addToPath("Тума", LocalTime.of(20, 40), 97)
                .addToPath("Гусь-Железный", LocalTime.of(21, 29), 128)
                .addToPath("Касимов", LocalTime.of(22, 5), 64)
                .setWeekDays(DayOfWeek.values())
                .apply());
        service.addBus(service.buildTransInfo("Касимов", LocalTime.of(11, 10))
                .addToPath("Гусь-Железный", LocalTime.of(11, 40), 64)
                .addToPath("Тума", LocalTime.of(12, 25), 128)
                .addToPath("Спас-Клепики", LocalTime.of(12, 55), 97)
                .addToPath("Москва", LocalTime.of(16, 40), 760)
                .setWeekDays(DayOfWeek.values())
                .apply());
        service.addBus(service.buildTransInfo("Рязань", LocalTime.of(8, 10))
                .addToPath("Спас-Клепики", LocalTime.of(9, 25), 222)
                .addToPath("Тума", LocalTime.of(9, 48), 97)
                .addToPath("Гусь-Хрустальный", LocalTime.of(10, 50), 170)
                .addToPath("Владимир", LocalTime.of(13, 0), 200)
                .setWeekDays(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY)
                .apply());
        return service;
    }
}