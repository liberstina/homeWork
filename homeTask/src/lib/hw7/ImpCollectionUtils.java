package lib.hw7;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Liberstina on 23.03.2015.
 */
public class ImpCollectionUtils implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        //return null;
        Collection<Integer> union = new ArrayList<Integer>();
        union.addAll(collection);
        union.addAll(collection1);

        if (collection == null || collection1 == null){

            throw new NullPointerException ("Error: One of values is null");
        }

        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        //return null;
                Collection<Integer> intersection = new ArrayList<Integer>();
        intersection.addAll(collection);
        intersection.addAll(collection1);

        if (collection == null || collection1 == null){
            //
            throw new NullPointerException ("Error: One of values is null");
        }

        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        //return null;
        Set<Integer> unionWithoutDupicates = new TreeSet<>();
        unionWithoutDupicates.addAll(collection);
        unionWithoutDupicates.addAll(collection1);

        if (collection == null || collection1 == null){
            //
            throw new NullPointerException ("Error: One of values is null");
        }

        return unionWithoutDupicates;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        //return null;
        Set<Integer> intersectionWithoutDuplicates = new TreeSet<>();
        intersectionWithoutDuplicates.addAll(collection);
        intersectionWithoutDuplicates.addAll(collection1);

        if (collection == null || collection1 == null){
            //
            throw new NullPointerException ("Error: One of values is null");
        }

        return intersectionWithoutDuplicates;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        //return null;
        Set<Integer> difference = new TreeSet<>();
        difference.addAll(collection);
        difference.addAll(collection1);
        Set<Integer> diff = new TreeSet<>();
        diff.addAll(collection1);
        if (diff.equals(difference)) {
            diff.removeAll(collection1);
        }
        else
            diff.retainAll(collection1);

        if (collection == null || collection1 == null){
            //
            throw new NullPointerException ("Error: One of values is null");
        }

        return difference;
    }
}
