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

    @Extension
    @SuppressWarnings("unchecked")
    public static <K, V> Map<K, V> copyOf(Map<? extends K,? extends V> map) {
        return (Map<K, V>) map.entrySet().stream()
                .toMap(pair -> pair.getKey(), pair -> pair.getValue());
    }
}
