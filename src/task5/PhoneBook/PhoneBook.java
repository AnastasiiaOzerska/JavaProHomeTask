package task5.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public Record findName(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }

        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> allNumbers = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                allNumbers.add(record);
            }

        }
        return allNumbers.isEmpty() ? null : allNumbers;
    }
}
