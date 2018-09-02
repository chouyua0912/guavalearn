package z.learn.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class CacheExample {

    public void example() {
        Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(1000).build();
        cache.put("abc", "cde");
    }
}
