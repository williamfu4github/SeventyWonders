package extensions.java.util.stream.Stream;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import manifold.ext.api.Extension;
import manifold.ext.api.This;
import java.util.stream.Stream;

@Extension
public final class JavaStreamExtension {

    public static <T> Multiset<T> toMultiset(@This Stream<T> thiz) {
        return thiz.collect(HashMultiset::create, Multiset::add, Multiset::addAll);
    }
}
