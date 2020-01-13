package part3.model;

import java.util.Hashtable;
import java.util.Map;

public class Dictionary {

    private Map<String, String> map = new Hashtable<>();
    private boolean language = true;


    public Dictionary() {
    }

    public Dictionary(Map<String, String> map) {
        this.map = map;
    }

    public Dictionary(String key, String value) {
        this.map.put(key, value);
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(String key, String value) {
        this.map.put(key, value);
    }

    public boolean isLanguage() {
        return language;
    }

    public void setLanguage(boolean language) {
        this.language = language;
    }

    public String getKey(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String translateWord(String word) {
        return this.language ? map.get(word) : getKey(map, word) + " ";
    }

    public String translateSentence(String[] sentence) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : sentence) {
            stringBuilder.append(translateWord(s));
        }

        stringBuilder.append(".");

        return stringBuilder.toString();
    }


    @Override
    public String toString() {
        return "Dictionary{" +
                "map=" + map +
                '}';
    }
}
