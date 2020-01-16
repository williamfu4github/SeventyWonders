package extensions.com.google.common.collect.Multiset;

import com.google.common.collect.Multiset;
import manifold.ext.api.Extension;
import manifold.ext.api.This;
import java.util.stream.Stream;

@Extension
public final class GuavaMultisetExtension {

    @Extension
    @SuppressWarnings("unchecked")
    public static <E> Multiset<E> emptyMultiset() {
        return (Multiset<E>) Stream.empty()
                .toMultiset();
    }

    @Extension
    public static <E> Multiset<E> of(E e1, E... others) {
        return Stream.concat(Stream.of(e1), Stream.of(others))
                .toMultiset();
    }

    public static <E> Multiset<E> insert(@This Multiset<E> thiz, E element) {
        thiz.add(element);
        return thiz;
    }
}
