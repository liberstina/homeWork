package lib.hw7;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

/**
 * Created by Liberstina on 23.03.2015.
 */
public class ImpSetUtils implements SetUtils {

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection, Set<String> set) throws NullPointerException {

        ArrayList<Integer> coll = new ArrayList<>();//new array for collection data
    ArrayList<String> sett = new ArrayList<>(); //new array for strings
        coll.addAll(collection);//add all elements to collection
        sett.addAll(set);
        if (coll == null || sett == null){
            throw new NullPointerException("Error: there is no collection or set");
        }
        Map<Integer, String> mapp = new TreeMap<>();

        SortedSet<String> sortSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return mapp.get(o1).compareTo(mapp.get(o2));
            }
        });
        sortSet.addAll(set);


        return sortSet;
    }

    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        if (integers == null) throw new NullPointerException("Error: there is no elements");
        Set<Integer> intLinkedHash = new LinkedHashSet<>();// steady order for elements
        for (int i : integers) {
            intLinkedHash.add(i);
        }
        return intLinkedHash;
    }
    }
