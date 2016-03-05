package com.epam.spring.core.beans;

import java.util.List;

/**
 * Created by Dzmitry_Hryhoryeu on 3/2/2016.
 */
public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize) {
            writeEventsFromCache(cache);
            cache.clear();
        }
    }

    private void writeEventsFromCache(List<Event> cache) {
        for (Event event : cache) {
            logEvent(event);
        }
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }
}
