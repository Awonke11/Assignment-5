package src;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash {
    private HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public Hash() {
    }

    /**
     * @param key
     * @param stringList
     */
    public void addItem(String key, ArrayList<String> stringList) {
        hashMap.put(key, stringList);
    }

    /**
     * @param key
     * @return ArrayList<String>
     */
    public ArrayList<String> getItem(String key) {
        return hashMap.get(key);
    }

    /**
     * @param key
     * @return boolean
     */
    public boolean contains(String key) {
        return hashMap.containsKey(key);
    }

    /**
     * @return HashMap<String, ArrayList<String>>
     */
    public HashMap<String, ArrayList<String>> getHashMap() {
        return hashMap;
    }

    /**
     * @return int
     */
    public int getHashSize() {
        return hashMap.size();
    }

    public void showItems() {
        for (String key : hashMap.keySet()) {
            for (String value : hashMap.get(key)) {
                System.out.println("key: " + key + " value: " + value);
            }
        }
    }
}
