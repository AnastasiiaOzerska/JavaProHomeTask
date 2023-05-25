package task5.src.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook myFriends = new PhoneBook();
        myFriends.addRecord(new Record("Bob", "2345787632"));
        myFriends.addRecord(new Record("Piter", "234578567"));
        myFriends.addRecord(new Record("Paul", "2345676788"));
        myFriends.addRecord(new Record("Mary", "234521345"));
        myFriends.addRecord(new Record("Ingret", "5863287632"));
        myFriends.addRecord(new Record("Olga", "6747893632"));
        myFriends.addRecord(new Record("Julia", "2356687632"));
        myFriends.addRecord(new Record("Jack", "23467689632"));
        myFriends.addRecord(new Record("Gans", "2345712432"));
        myFriends.addRecord(new Record("Fridrich", "989874787632"));
        myFriends.addRecord(new Record("Mary", "2345787632"));
        myFriends.addRecord(new Record("Gretta", "23666667632"));
        myFriends.addRecord(new Record("Dora", "23457999992"));
        System.out.println(myFriends.findName("Bob"));
        System.out.println(myFriends.findAll("Mark"));
    }
}
