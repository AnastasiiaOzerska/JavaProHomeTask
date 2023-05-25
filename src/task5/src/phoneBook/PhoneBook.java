package task5.src.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<java.lang.Record> records;
    public PhoneBook() {
        this.records = new ArrayList<>();
    }
    public List<java.lang.Record> getRecords() {
        return records;
    }
    public void setRecords(List<java.lang.Record> records) {
        this.records = records;
    }
    public void addRecord(java.lang.Record record){
        records.add(record);
    }
    public java.lang.Record findName(String name){
        for (java.lang.Record record: records) {
            if (record.getName().equals(name)){
                return record;
            }

        }
        return null;
    }
    public List<java.lang.Record> findAll(String name){
        List<java.lang.Record> allNumbers = new ArrayList<>();
        for (java.lang.Record record:records) {
            if (record.getName().equals(name)){
                allNumbers.add(record);
            }

        }
        return allNumbers.isEmpty() ? null : allNumbers ;
    }
}
