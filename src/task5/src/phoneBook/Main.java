package task5.src.phoneBook;

public class Main {
    public static void main(String[] args) {
    PhoneBook myFriends = new PhoneBook();
    myFriends.addRecord(new java.lang.Record("Bob","2345787632"));
    myFriends.addRecord(new java.lang.Record("Piter","234578567"));
    myFriends.addRecord(new java.lang.Record("Paul","2345676788"));
    myFriends.addRecord(new java.lang.Record("Mary","234521345"));
    myFriends.addRecord(new java.lang.Record("Ingret","5863287632"));
    myFriends.addRecord(new java.lang.Record("Olga","6747893632"));
    myFriends.addRecord(new java.lang.Record("Julia","2356687632"));
    myFriends.addRecord(new java.lang.Record("Jack","23467689632"));
    myFriends.addRecord(new java.lang.Record("Gans","2345712432"));
    myFriends.addRecord(new java.lang.Record("Fridrich","989874787632"));
    myFriends.addRecord(new java.lang.Record("Mary","2345787632"));
    myFriends.addRecord(new java.lang.Record("Gretta","23666667632"));
    myFriends.addRecord(new java.lang.Record("Dora","23457999992"));
        System.out.println(myFriends.findName("Bob"));
        System.out.println(myFriends.findAll("Mark"));
    }
}
