package lesson15HomeWork;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Коллекция не может быть null!");
        }
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Коллекция не может быть null!");
        }
        Collection<Integer> result = new ArrayList<>();
        for (Integer integer : a) {
            if (b.contains(integer)) {
                result.add(integer);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Коллекция не может быть null!");
        }
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Коллекция не может быть null!");
        }
        Set<Integer> result = new HashSet<>();
        for (Integer integer : a) {
            if (b.contains(integer)) {
                result.add(integer);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Коллекция не может быть null!");
        }
        Collection<Integer> result = new ArrayList<>();
        for (Integer integer : a) {
            if (!b.contains(integer)) {
                result.add(integer);
            }
        }
        for (Integer integer : b) {
            if (!a.contains(integer)) {
                result.add(integer);
            }
        }
        return result;
    }
}
