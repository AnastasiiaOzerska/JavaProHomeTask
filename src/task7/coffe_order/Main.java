package task7.coffe_order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard newYear = new CoffeeOrderBoard();
        newYear.add("Mary");
        newYear.add("Bob");
        newYear.add("Mark");
        newYear.add("Olga");
        newYear.add("Alex");
        newYear.add("Andrew");
        newYear.add("Anton");
        newYear.add("Tom");
        newYear.add("Jerry");
        newYear.add("Oleg");
        newYear.add("Pedro");
        newYear.draw();
        System.out.println("====================");
        System.out.println(newYear.deliver(2));
        System.out.println("===================");
        System.out.println(newYear.deliver());
        newYear.draw();
        newYear.add("Nastya");
        newYear.draw();

    }
}