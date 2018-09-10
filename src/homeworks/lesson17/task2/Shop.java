package homeworks.lesson17.task2;


import homeworks.lesson16.task6.Item;

import java.io.*;
import java.util.*;

public class Shop {
    private static List<Item> bucket;
    private static double sumPrice = 0;

    public static void main(String[] args) {
        String login = "Serhii";
        String password = "123456";
        String confPassword = "123456";
        Scanner scn = new Scanner(System.in);
        Authentication auth = new Authentication();

        Item item1 = new Item("Nokia 3310", 1340, 3);
        Item item2 = new Item("Apple 6s", 1858, 5);
        Item item3 = new Item("Samsung J500", 1708, 2);
        Item item4 = new Item("Acer G54", 997, 1);
        Item item5 = new Item("Meizu M6", 1703, 4);
        Item item6 = new Item("Xiaomi MI6", 1558, 3);
        Item item7 = new Item("Xiaomi Redmi 3s", 1562, 5);
        Item item8 = new Item("Siemens A65", 245, 3);
        Item item9 = new Item("Alkatel 54", 2524, 1);
        Item item10 = new Item("Siemens M65", 4050, 2);

        Map<Integer, Item> map = getItems(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10);

        Category category = new Category("Телефоны", map);

        mainMenu(login, password, confPassword, scn, auth, map, category);
    }

    private static void mainMenu(String login, String password, String confPassword, Scanner scn, Authentication auth, Map<Integer, Item> map, Category category) {
        while (true) {
            System.out.println("Выберите пункт: ");
            System.out.println("1. Войти в магазин");
            System.out.println("2. Просмотр списка каталогов товара");
            System.out.println("3. Сортировка товаров");
            System.out.println("4. Выбор товара");
            System.out.println("5. Покупка товара");
            System.out.println("6. Deserialize");
            System.out.println("7. Выйти с магазина");
            if (scn.hasNextInt()) {
                int s = scn.nextInt();
                switch (s) {
                    case 1:
                        System.out.println("Вы успешно вошли в магазин!\n");
                        System.out.println("Ваши данные:");
                        auth.isAuthenticated(login, password, confPassword);
                        break;
                    case 2:
                        System.out.println(category.getName());
                        break;
                    case 3:
                        choiseSort(scn, map);
                        break;
                    case 4:
                        for (Map.Entry e : map.entrySet()) {
                            System.out.println(e.getKey() + " " + e.getValue());
                        }
                        bucket(scn, map);
                        break;
                    case 5:
                        System.out.println("Вы приобрели: " + bucket);
                        System.out.println("Общая стоимость товаров: " + sumPrice);
                        printWriter();
                        serialized();
                        break;
                    case 6:
                        deserialized();
                        break;
                    case 7:
                        System.exit(0);
                }
            } else {
                System.out.println("Неправильный выбор");
                System.exit(0);
            }
        }
    }

    private static void deserialized() {
        try (FileInputStream fis = new FileInputStream("bucket.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            bucket = (List<Item>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void serialized() {
        try (FileOutputStream fs = new FileOutputStream("bucket.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(bucket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printWriter() {
        try (PrintWriter pw = new PrintWriter("src/homeworks/lesson17/task2/bucket.txt");) {
            pw.println("Вы приобрели: " + bucket.toString());
            pw.println("Общая стоимость: " + sumPrice);
            //  pw.close();
            System.out.println("Запись в файл произведена");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void bucket(Scanner scn, Map<Integer, Item> map) {
        bucket = new LinkedList();
        int i = 0;
        do {
            System.out.println("Введите номер продукта:");
            i = scn.nextInt();
            if (i == 0) {
                return;
            }
            Item cItem = map.get(i);
            sumPrice += map.get(i).getPrice();
            bucket.add(cItem);
            System.out.println("В корзине находится: " + bucket);
            System.out.println("Общая стоимость товаров : " + sumPrice);
            System.out.println("Для возврата в меню введите 0");
        } while (i <= map.size());

    }

    private static Map<Integer, Item> getItems(Item... items) {
        Map<Integer, Item> map = new LinkedHashMap<>();
        for (Item item : items) {
            map.put(item.getId(), item);
        }
        return map;
    }

    private static void choiseSort(Scanner scn, Map<Integer, Item> map) {
        int b = 0;
        do {
            System.out.println("Сортировать товары");
            System.out.println("1. По цене");
            System.out.println("2. По имени");
            System.out.println("3. По рейтингу");
            System.out.println("4. Вернуться в магазин");
            if (scn.hasNextInt()) {
                b = scn.nextInt();
                switch (b) {
                    case 1:
                        print(map, new PriceComparator());
                        break;
                    case 2:
                        print(map, new ProductNameComparator());
                        break;
                    case 3:
                        print(map, new ProductRateComparator());
                        break;
                    //case 4:
                    default:
                        return;
                }
            } else {
                System.out.println("Неправильный выбор");
                System.exit(0);
            }
        } while (b != 4);
    }

    public static void print(Map<Integer, Item> map, Comparator<Item> comparator) {
        Set<Item> items = new TreeSet(comparator);
        items.addAll(map.values());
        System.out.println(items);
    }
}

