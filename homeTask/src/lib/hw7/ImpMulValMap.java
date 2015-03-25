package lib.hw7;

import com.sourceit.hometask.collections.MultiValueMap;

import java.security.Key;
import java.util.*;

/**
 * Created by Liberstina on 23.03.2015.
 */
public class ImpMulValMap<K,V> implements MultiValueMap<K,V> {

    private Map<K,ArrayList<V>> multiValueMap = new HashMap<>();//creating map with K key & array with values

    @Override
    public int getCountValues(K key) {
    ArrayList<V> arrValues = multiValueMap.get(key); //determine the key of each value in array
        //return 0;
       return arrValues.lastIndexOf(key); //the last index is equal to the number of array elements
        //i used it because array.length does not work here
    }

    @Override
    public int size() {
        return multiValueMap.size();
        //return 0;
    }

    @Override
    public boolean isEmpty() {
        return multiValueMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return multiValueMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return multiValueMap.containsValue(value);
    }

    @Override
    public V get(Object key) {
        ArrayList<V> arrValues = multiValueMap.get(key); //determine the key of each value in array
        return arrValues.get(arrValues.size());//can not see the difference between it and previous get
        //return null;
    }

    @Override
    public V put(K key, V value) {
        multiValueMap.put(key,new ArrayList<>());
        ArrayList<V> arrValues = multiValueMap.get(key);
        // return null;
        return arrValues.get(arrValues.size());//i'm not sure what to return
    }

    @Override
    public Iterator<V> getIterator(K key) {
        return multiValueMap.get(key).iterator();
        //return null;
    }

    @Override
    public V remove(Object key) {
        ArrayList<V> arrValues = new ArrayList<>();
        arrValues.addAll(multiValueMap.get(key));
       // multiValueMap.put(K,new ArrayList<>()); //the compiler shows it impossible, but i'm not sure am i right without this string
        multiValueMap.get(key).clear();
        return arrValues.get(arrValues.size());
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {//i found this solution in internet, i'm not sure is it right
        ArrayList<? extends K> keySet = new ArrayList<>(m.keySet());
        ArrayList<? extends V> valueSet = new ArrayList<>(m.values());
        for (int i = 0; i < m.size(); i++) {
            this.put(keySet.get(i), valueSet.get(i));
        }
    }

    @Override
    public void clear() {
     multiValueMap.clear();
    }

    @Override
    public Set keySet() {
        return multiValueMap.keySet();
    }

    @Override
    public Collection<V> values() {
        ArrayList<ArrayList<V>> collect = (ArrayList<ArrayList<V>>) multiValueMap.values();
        Collection<V> allCollection = new ArrayList<>();
        for (int i = 0; i < collect.size(); i++) {
            allCollection.addAll(collect.get(i));
            i++;
        }
        return allCollection;
        //return null;
    }

    @Override
    public Set<Entry<K,V>> entrySet() {
        ArrayList<K> keySet = new ArrayList<>();
        keySet.addAll(multiValueMap.keySet());

        HashMap<K, V> map = new HashMap();


        for (int i = 0; i < multiValueMap.size() ; i++) {
            map.put(keySet.get(i), this.get(keySet.get(i)));
        }
        return  map.entrySet();
    }
}
