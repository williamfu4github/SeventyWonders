package extensions.com.google.common.collect.Multiset;

import com.google.common.collect.Multiset;
import manifold.ext.api.Extension;
import java.util.stream.Stream;

@Extension
public final class GuavaMultisetExtension {

    @Extension
    @SuppressWarnings("unchecked")
    public static <E> Multiset<E> emptyMultiset() {
        return (Multiset<E>) Stream.empty()
                .toMultiset();
    }
}
