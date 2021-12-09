package LR7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Store {
    HashMap<String, String> data = new HashMap<>();
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<String> category = new ArrayList<>();
    ArrayList<Product> cart = new ArrayList<>();
    ArrayList<Product> buff = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public User auth() {
        System.out.print("Логин: ");
        String login = sc.next();
        System.out.print("Пароль: ");
        String password = sc.next();
        if (data.containsKey(login) && data.containsValue(password))
            return new User(login, password);
        System.out.println("Пользователь не найден");
        return new User();
    }

    public void showCatalog() {
        System.out.println("\n    Категория");
        int i = 0;
        for (String c : category)
            System.out.println(++i + ") " + c);
        System.out.print("Выберите категорию или нажмите 0 для выхода: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i == 0) {
                getMenu();
                return;
            }
            showProduct(category.get(i - 1));
        } else
            showProduct(sc.next());
    }

    public void showProduct(String category) {
        System.out.println("\n    Продукты");
        int i = 0;
        buff.clear();
        for (Product p : products)
            if (p.category.toLowerCase().contains(category.toLowerCase())) {
                System.out.println(++i + ") " + p.name + " " + p.price + "rub");
                buff.add(p);
            }
        pushCart(buff);
    }

    public void showProduct() {
        System.out.println("\n    Продукты");
        int i = 0;
        for (Product p : products)
            System.out.println(++i + ") " + p.name + " " + p.price + "rub");
        pushCart(products);
    }

    public void showCart() {
        System.out.println("\n    Корзина");
        int i = 0;
        for (Product p : cart)
            System.out.println(++i + ") " + p.name + " " + p.price + "rub");
        System.out.print("\n    Введите 0, чтобы выйти в меню или 4, чтобы перейти к оплате: ");
        i = sc.hasNextInt() ? sc.nextInt() : 0;
        if (i == 0)
            getMenu();
        else if (i == 4)
            payment();
    }

    public void pushCart(ArrayList<Product> pp) {
        System.out.print("\n    Добавить в корзину или введите 0, чтобы выйти: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i == 0) {
                getMenu();
                return;
            }
            cart.add(pp.get(i - 1));
            System.out.println("    " + pp.get(i - 1).name + " added");
        } else
            pushCart(sc.next());
        pushCart(pp);
    }

    public void pushCart(String a) {
        int i = -1;
        while (++i < products.size()) {
            if (products.get(i).name.equals(a)) {
                cart.add(products.get(i));
                break;
            }
        }
    }

    public void payment() {
        int cost = 0;
        for (Product p : cart)
            cost += p.price;
        System.out.println("Стоимость корзины: " + cost);
        System.out.print("Введите 1, чтобы оплатить или 0, чтобы выйти: ");
        cost = sc.hasNextInt() ? sc.nextInt() : 0;
        if (cost == 1) {
            write();
            System.out.println("Успех!");
        } else if (cost == 0)
            getMenu();
    }

    public void write() {
        int i = 0;
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(new File("SuperComp\\src\\LR7\\cart")));
            for (Product p : cart)
                out.println(++i + ") " + p.name + " " + p.price + " rub");
            out.flush();
            out.close();
            System.out.println("Файл был записан");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void serialized() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(new File("SuperComp\\src\\LR7\\ser")));
            out.writeObject(cart.toString());
            out.close();
            System.out.println("Файл был сериализован");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String deserialized() {
        String ser = "";
        try {
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("SuperComp\\src\\LR7\\ser"));
            ser = (String) input.readObject();
            input.close();
            System.out.println("Файл был десериализован");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ser;
    }

    public void getMenu() {
        System.out.println("\n    Меню\n1) Категория\n2) Продукты\n3) Корзина\n4) Оплата\n0) Выход");
        System.out.print("Select: ");
        String choice = sc.next().toLowerCase(); // scan.nextline doesn`t work, why?
        if (choice.contains("1") || choice.contains("Категория"))
            showCatalog();
        else if (choice.contains("2") || choice.contains("Продукты"))
            showProduct();
        else if (choice.contains("3") || choice.contains("Корзина"))
            showCart();
        else if (choice.contains("4") || choice.contains("Оплата"))
            payment();
        else if (choice.contains("0") || choice.contains("Выход"))
            return;
        else
            getMenu();
    }

    public void fill() {
        data.put("qwerty", "qwerty");

        products.add(new Product("Огурцы", 100, "Овощи"));
        products.add(new Product("Помидоры", 120, "Овощи"));
        products.add(new Product("Капуста", 80, "Овощи"));
        products.add(new Product("Пирожное", 250, "Выпечка"));
        products.add(new Product("Торт", 500, "Выпечка"));
        products.add(new Product("Булочка", 50, "Выпечка"));

        for (Product p : products)
            if (!category.contains(p.category))
                category.add(p.category);
    }

    public static void main(String[] msi) {
        Store s = new Store();
        System.out.println("Добро пожаловать в магазин\nВойдите в свою учетную запись");
        s.fill();

        User user = s.auth();
        if (user.login != "")
            s.getMenu();

        s.serialized();
        System.out.println(s.deserialized());
        s.sc.close();
    }
}