package ch.qos.logback.core.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class AbstractComponentTracker<C> implements ComponentTracker<C> {
    private static final boolean ACCESS_ORDERED = true;
    public static final long LINGERING_TIMEOUT = 10000;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000;
    protected int maxComponents = Integer.MAX_VALUE;
    protected long timeout = ComponentTracker.DEFAULT_TIMEOUT;
    LinkedHashMap<String, Entry<C>> liveMap = new LinkedHashMap<>(32, 0.75f, true);
    LinkedHashMap<String, Entry<C>> lingerersMap = new LinkedHashMap<>(16, 0.75f, true);
    long lastCheck = 0;
    private RemovalPredicator<C> byExcedent = (RemovalPredicator<C>) new RemovalPredicator<Object>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.1
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<Object> entry, long j11) {
            return AbstractComponentTracker.this.liveMap.size() > AbstractComponentTracker.this.maxComponents;
        }
    };
    private RemovalPredicator<C> byTimeout = (RemovalPredicator<C>) new RemovalPredicator<Object>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.2
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<Object> entry, long j11) {
            return AbstractComponentTracker.this.isEntryStale(entry, j11);
        }
    };
    private RemovalPredicator<C> byLingering = (RemovalPredicator<C>) new RemovalPredicator<Object>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.3
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<Object> entry, long j11) {
            return AbstractComponentTracker.this.isEntryDoneLingering(entry, j11);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Entry<C> {
        C component;
        String key;
        long timestamp;

        Entry(String str, C c11, long j11) {
            this.key = str;
            this.component = c11;
            this.timestamp = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Entry entry = (Entry) obj;
                String str = this.key;
                if (str == null) {
                    if (entry.key != null) {
                        return false;
                    }
                } else if (!str.equals(entry.key)) {
                    return false;
                }
                C c11 = this.component;
                C c12 = entry.component;
                if (c11 == null) {
                    if (c12 != null) {
                        return false;
                    }
                } else if (!c11.equals(c12)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public void setTimestamp(long j11) {
            this.timestamp = j11;
        }

        public String toString() {
            return "(" + this.key + ", " + this.component + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface RemovalPredicator<C> {
        boolean isSlatedForRemoval(Entry<C> entry, long j11);
    }

    private void genericStaleComponentRemover(LinkedHashMap<String, Entry<C>> linkedHashMap, long j11, RemovalPredicator<C> removalPredicator) {
        Iterator<Map.Entry<String, Entry<C>>> it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Entry<C> value = it2.next().getValue();
            if (!removalPredicator.isSlatedForRemoval(value, j11)) {
                return;
            }
            it2.remove();
            processPriorToRemoval(value.component);
        }
    }

    private Entry<C> getFromEitherMap(String str) {
        Entry<C> entry = this.liveMap.get(str);
        return entry != null ? entry : this.lingerersMap.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryDoneLingering(Entry<C> entry, long j11) {
        return entry.timestamp + LINGERING_TIMEOUT < j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryStale(Entry<C> entry, long j11) {
        return isComponentStale(entry.component) || entry.timestamp + this.timeout < j11;
    }

    private boolean isTooSoonForRemovalIteration(long j11) {
        if (this.lastCheck + 1000 > j11) {
            return true;
        }
        this.lastCheck = j11;
        return false;
    }

    private void removeExcedentComponents() {
        genericStaleComponentRemover(this.liveMap, 0L, this.byExcedent);
    }

    private void removeStaleComponentsFromLingerersMap(long j11) {
        genericStaleComponentRemover(this.lingerersMap, j11, this.byLingering);
    }

    private void removeStaleComponentsFromMainMap(long j11) {
        genericStaleComponentRemover(this.liveMap, j11, this.byTimeout);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        for (Entry<C> entry : this.liveMap.values()) {
            arrayList.add(entry.component);
        }
        for (Entry<C> entry2 : this.lingerersMap.values()) {
            arrayList.add(entry2.component);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.liveMap.keySet());
        hashSet.addAll(this.lingerersMap.keySet());
        return hashSet;
    }

    protected abstract C buildComponent(String str);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        Entry<C> remove = this.liveMap.remove(str);
        if (remove == null) {
            return;
        }
        this.lingerersMap.put(str, remove);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        Entry<C> fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            return null;
        }
        return fromEitherMap.component;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.liveMap.size() + this.lingerersMap.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j11) {
        Entry<C> fromEitherMap;
        fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            Entry<C> entry = new Entry<>(str, buildComponent(str), j11);
            this.liveMap.put(str, entry);
            fromEitherMap = entry;
        } else {
            fromEitherMap.setTimestamp(j11);
        }
        return fromEitherMap.component;
    }

    public long getTimeout() {
        return this.timeout;
    }

    protected abstract boolean isComponentStale(C c11);

    protected abstract void processPriorToRemoval(C c11);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j11) {
        if (isTooSoonForRemovalIteration(j11)) {
            return;
        }
        removeExcedentComponents();
        removeStaleComponentsFromMainMap(j11);
        removeStaleComponentsFromLingerersMap(j11);
    }

    public void setMaxComponents(int i11) {
        this.maxComponents = i11;
    }

    public void setTimeout(long j11) {
        this.timeout = j11;
    }
}