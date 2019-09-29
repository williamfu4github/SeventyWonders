package extensions.java.util.Map;

import manifold.ext.api.Extension;
import java.util.Map;
import java.util.stream.Stream;

@Extension
public final class JavaMapExtension {

    @Extension
    @SuppressWarnings("unchecked")
    public static <K, V> Map<K, V> emptyMap() {
        return (Map<K, V>) Stream.empty()
                .toMap(key -> key, value -> value);
    }
}
