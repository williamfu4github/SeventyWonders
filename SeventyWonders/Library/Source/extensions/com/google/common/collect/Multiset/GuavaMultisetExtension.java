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

    public static <E> Multiset<E> insert(@This Multiset<E> thiz, E element) {
        thiz.add(element);
        return thiz;
    }
}
