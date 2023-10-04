import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Huawei","8ГБ_DDR4","256ГБ_SSD", "Windows_11", "Grey");
        Laptop lap2 = new Laptop("Honor","8ГБ_DDR4","512ГБ_SSD", "Free_DOS", "Black");
        Laptop lap3 = new Laptop("Acer","16ГБ_DDR4","512ГБ_SSD", "Endless", "Silver");

        //System.out.println(lap1);
        //System.out.println(lap2);
        //System.out.println(lap3);

        Set<Laptop> set = new HashSet<>();
        set.add(lap1);
        set.add(lap2);
        set.add(lap3);

        //System.out.println(set);

        System.out.println("Выберите критерии для фильтрации:\n" +
                "1. ОЗУ\n" +
                "2. Объем ЖД\n" +
                "3. Операционная система\n" +
                "4. Цвет\n" +
                "5. Выход\n");

        Map<String, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Оперативная память?");
                    filters.put("Оперативная память", scanner.next());
                    break;
                case 2:
                    System.out.println("Диск?");
                    filters.put("Диск", scanner.next());
                    break;
                case 3:
                    System.out.println("Операционная система?");
                    filters.put("Операционная система", scanner.next());
                    break;
                case 4:
                    System.out.println("Цвет?");
                    filters.put("Цвет", scanner.next());
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        Set<Laptop> filteredLaptops = set.stream()
                .filter(laptop -> filters.getOrDefault("Оперативная память", "").equals("") || laptop.RAM.equalsIgnoreCase((String) filters.getOrDefault("Оперативная память", "")))
                .filter(laptop -> filters.getOrDefault("Диск", "").equals("") || laptop.disk.equalsIgnoreCase((String) filters.getOrDefault("Диск", "")))
                .filter(laptop -> filters.getOrDefault("Операционная система", "").equals("") || laptop.operatingSystem.equalsIgnoreCase((String) filters.getOrDefault("Операционная система", "")))
                .filter(laptop -> filters.getOrDefault("Цвет", "").equals("") || laptop.color.equalsIgnoreCase((String) filters.getOrDefault("Цвет", "")))
                .collect(Collectors.toSet());

        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }

    }
}