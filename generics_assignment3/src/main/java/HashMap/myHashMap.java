package HashMap;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 
 * 
 * @author steveduarte
 * @param <K> key of any type
 * @param <V> value of any type
 */
public class myHashMap<K,V> extends AbstractMap<K,V> 
        implements Map<K,V>, Cloneable, Serializable {
    
    // instantiate a new hash map
    private HashMap internalList = new HashMap();

    @Override
    public Set<Entry<K, V>> entrySet() {
        return internalList.entrySet();
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return super.getOrDefault(key, defaultValue); 
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> action) {
        super.forEach(action); 
    }

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        super.replaceAll(function); 
    }

    @Override
    public V putIfAbsent(K key, V value) {
        return super.putIfAbsent(key, value); 
    }

    @Override
    public boolean remove(Object key, Object value) {
        return super.remove(key, value); 
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return super.replace(key, oldValue, newValue); 
    }

    @Override
    public V replace(K key, V value) {
        return super.replace(key, value);
    }

    @Override
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        return super.computeIfAbsent(key, mappingFunction); 
    }

    @Override
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return super.computeIfPresent(key, remappingFunction); 
    }

    @Override
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return super.compute(key, remappingFunction); 
    }

    @Override
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return super.merge(key, value, remappingFunction); 
    }

 
}