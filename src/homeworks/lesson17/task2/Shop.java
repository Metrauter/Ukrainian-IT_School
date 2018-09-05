package homeworks.lesson17.task2;

import homeworks.lesson16.task6.Item;

import java.util.*;

public class Shop {
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

        Set<Item> set = getItems(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10);

        Category category = new Category("Телефоны", set);

        mainMenu(login, password, confPassword, scn, auth, set, category);
        return;
    }

    public static void mainMenu(String login, String password, String confPassword, Scanner scn, Authentication auth, Set<Item> set, Category category) {
        while (true) {
            System.out.println("Выберите пункт: ");
            System.out.println("1. Войти в магазин");
            System.out.println("2. Просмотр списка каталогов товара");
            System.out.println("3. Сортировка товаров");
            System.out.println("4. Выбор товара");
            System.out.println("5. Покупка товара");
            System.out.println("6. Выйти с магазина");
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
                        choiseSort(scn, set);
                        break;
                    case 4:

                    case 5:

                    case 6:
                        System.exit(0);
                }
            } else {
                System.out.println("Неправильный выбор");
                System.exit(0);
            }
        }
    }

    public static Set<Item> getItems(Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7, Item item8, Item item9, Item item10) {
        Set<Item> map = new HashSet<>();
        map.add(item1);
        map.add(item2);
        map.add(item3);
        map.add(item4);
        map.add(item5);
        map.add(item6);
        map.add(item7);
        map.add(item8);
        map.add(item9);
        map.add(item10);
        return map;
    }

    public static void choiseSort(Scanner scn, Set<Item> set) {
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
                        print(set, new PriceComparator());

                        break;
                    case 2:
                        print(set, new ProductNameComparator());
                        break;
                    case 3:
                        print(set, new ProductRateComparator());
                        break;
                    case 4:
                    default:
                        return;
                }
            } else {
                System.out.println("Неправильный выбор");
                System.exit(0);
            }
        } while (b != 4);
    }

    public static void print(Scanner scn, Set<Item> set, Comparator<Item> comparator) {
        Set<Item> newSet = new TreeSet<>(comparator);
        newSet.addAll(set);
        System.out.println(newSet);

        ArrayList<Item> choice = new ArrayList<Item>();
        System.out.println("введите название продукта");
        String choiceProduct = scn.next();
        for (int i = 0; i < newSet.size(); i++) {
            if (newSet.get(i).getName().equals(choiceProduct)) {
                choice.add(newSet.get(i));
                System.out.println("в корзине находится " + choice.get(i).getName());
            }
        }
    }
}