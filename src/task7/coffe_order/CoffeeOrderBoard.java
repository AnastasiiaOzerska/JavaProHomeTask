package task7.coffe_order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
private Queue<Order> holidayOrders;
private int queueNumber;

    public CoffeeOrderBoard() {
        this.holidayOrders = new LinkedList<>();
    }
    public void add (String name){
        queueNumber++;
        holidayOrders.add(new Order(queueNumber,name));
    }
    public Order deliver(){
        Order item = holidayOrders.remove();

        return item;
    }
    public Order deliver(int number){
        for (Order holidayOrder : holidayOrders) {
            if(holidayOrder.getNumber()==number){
                holidayOrders.remove(holidayOrder);
                return holidayOrder;
            }

        }
        return null;
    }
    public void draw(){
        System.out.println("Num | Name");
        for (Order holidayOrder:holidayOrders) {
            System.out.println(holidayOrder.toString());

        }
    }
}
