package extensions.java.util.Set;

import manifold.ext.api.Extension;
import manifold.ext.api.This;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

@Extension
public final class JavaSetExtension {

    @Extension
    @SuppressWarnings("unchecked")
    public static <E> Set<E> emptySet() {
        return (Set<E>) Stream.empty()
                .toSet();
    }

    @Extension
    public static <E> Set<E> of(E e1, E... others) {
        return Stream.concat(Stream.of(e1), Stream.of(others))
                .toSet();
    }

    @Extension
    public static <E> Set<E> copyOf(E[] elements) {
        return Stream.of(elements)
                .toSet();
    }

    @Extension
    @SuppressWarnings("unchecked")
    public static <E> Set<E> copyOf(Collection<? extends E> elements) {
        return (Set<E>) elements.stream()
                .toSet();
    }

    public static <E> Set<E> insert(@This Set<E> thiz, E element) {
        thiz.add(element);
        return thiz;
    }
}
