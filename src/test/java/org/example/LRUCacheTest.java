package org.example;
import com.mysql.cj.util.LRUCache;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LRUCacheTest {
    @Test
    void testLRUCacheOperations() {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);
        assertEquals(10, lruCache.get(1));
        assertEquals(20, lruCache.get(2));
        assertEquals(30, lruCache.get(3));
        lruCache.get(2);
        lruCache.put(4, 40);
        assertNull(lruCache.get(1));
        assertEquals(20, lruCache.get(2));
        assertEquals(30, lruCache.get(3));
        assertEquals(40, lruCache.get(4));
    }
}
