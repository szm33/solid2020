package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToHashMapConverter {

    Map<Integer, Integer> valueHashMap = new HashMap<Integer, Integer>();
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;

    public ListToHashMapConverter(List<Integer> i1) {
        addListToMap(i1);
    }

    public ListToHashMapConverter() {
    }

    public void addListToMap(List<Integer> keys) {
        for(int i = 0; i < keys.size(); i++){
            incrementKeyValueAndFindKeyMinMax(keys.get(i));
        }
    }

    public void incrementKeyValueAndFindKeyMinMax(Integer i) {
        addOneToKeyValue(i);
        checkMinValue(i);
        checkMaxValue(i);
    }

    public void addOneToKeyValue(Integer key) {
        if(valueHashMap.containsKey(key)){
            Integer value = valueHashMap.get(key);
            valueHashMap.put(key, value + 1);
        } else {
            valueHashMap.put(key, 1);
        }
    }

    public void checkMinValue(Integer i) {
        if(i < minValue){
            minValue = i;
        }
    }

    public void checkMaxValue(Integer value) {
        if(value > maxValue){
            maxValue = value;
        }
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public Map<Integer,Integer> getValueHashMap(){
        return valueHashMap;
    }

}