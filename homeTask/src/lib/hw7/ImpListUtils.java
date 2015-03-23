package lib.hw7;

import com.sourceit.hometask.collections.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Дима on 23.03.2015.
 */
public class ImpListUtils implements ListUtils{

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> asList = Arrays.asList(strings);
        //asList.addAll(strings);
        if (asList == null){
            throw new IllegalArgumentException("Error: there is an illegal argument in the list");
        }
        //return null;
        return asList;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> list) throws IllegalArgumentException {
        //return null;
        List<T> Sorted = new ArrayList<T>();
        Sorted.addAll(list);
        if (Sorted == null){
            throw new IllegalArgumentException("Error: there is an illegal argument in the list");
        }

        return Sorted;
    }
}
