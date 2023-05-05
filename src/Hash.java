package src;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash {
    private HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public Hash() {
    }

    public void addItem(String key, ArrayList<String> stringList) {
        hashMap.put(key, stringList);
    }

    public ArrayList<String> getItem(String key) {
        return hashMap.get(key);
    }

    public boolean contains(String key) {
        return hashMap.containsKey(key);
    }

    public HashMap<String, ArrayList<String>> getHashMap() {
        return hashMap;
    }

    public void showItems() {
        for (String key : hashMap.keySet()) {
            for (String value : hashMap.get(key)) {
                System.out.println("key: " + key + " value: " + value);
            }
        }
    }
}
