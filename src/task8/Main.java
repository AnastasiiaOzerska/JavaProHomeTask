package task8;

public class Main {
    public static void main(String[] args) {
    FileNavigator manager = new FileNavigator();
    manager.add("D:\\new folder",new FileData("Home",2345,"D:\\new folder"));
    manager.add("E:\\new folder",new FileData("Cat",2350,"E:\\new folder"));
    manager.add("C:\\new folder",new FileData("Dog",2348,"C:\\new folder"));
    manager.add("D:\\new folder",new FileData("Bird",2322,"D:\\new folder"));
    manager.add("D:\\new folder",new FileData("Mouse",4563,"D:\\new folder"));
        System.out.println(manager.filterBySize(3000));
        System.out.println(manager.remove("C:\\new folder"));
        System.out.println(manager.sortBySize());
        System.out.println(manager.find("D:\\new folder"));
    }
}