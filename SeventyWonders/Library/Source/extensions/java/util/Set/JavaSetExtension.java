package extensions.java.util.Set;

import manifold.ext.api.Extension;
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
}
