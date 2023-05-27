package task8.src;

import java.util.*;

public class FileNavigator {
    private Map <String, List<FileData>> fileDesk;

    public FileNavigator() {
        this.fileDesk = new HashMap<>();
    }
    public void add(String path, FileData file){
        if(file.getPath().equals(path)){
            if (!fileDesk.containsKey(path)){
                List<FileData> newList = new ArrayList<>();
                newList.add(file);
                fileDesk.put(path,newList);
            }else {
                List<FileData> existList = fileDesk.get(path);
                existList.add(file);}
        }else {
            System.out.println("Key " + path + " is not matched " + file.getPath());

        }
    }
    public List<FileData> find(String path){
        return fileDesk.get(path);
    }
    public List<FileData> filterBySize(int size){
        List<FileData> fileSpace = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> item: fileDesk.entrySet()) {
            for (FileData file: item.getValue()) {
                if (file.getSize() <= size){
                    fileSpace.add(file);
                }

            }

        }
        return fileSpace;
    }
    public boolean remove(String path){
        fileDesk.remove(path);
        return true;
    }
    public List<FileData> sortBySize(){
        List<FileData> sortedList = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> sorted: fileDesk.entrySet()) {
            for (FileData file : sorted.getValue()) {
                sortedList.add(file);
            }
        }
        Collections.sort(sortedList);

        return sortedList;
    }



}
