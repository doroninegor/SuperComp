package LR6.zd2;

public class Main {
        public static void main(String[] args) {

            MyCollection<String> list = new MyCollection<>();
            list.add("5","4","5","2","1","4","8","9");
            list.print();
            list.remove(8);
            list.print();
            list.remove("5");
            list.print();
            System.out.println(list.get(1));
            list.clear();
            list.add("1", "2","3");
            list.print();
        }
    }

