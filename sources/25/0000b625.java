package tw;

import ch.qos.logback.core.joran.action.Action;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes6.dex */
abstract class a<K, V, V2> implements e<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, Provider<V>> f52631a;

    /* renamed from: tw.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC1171a<K, V, V2> {

        /* renamed from: a  reason: collision with root package name */
        final LinkedHashMap<K, Provider<V>> f52632a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC1171a(int i11) {
            this.f52632a = b.c(i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC1171a<K, V, V2> a(K k11, Provider<V> provider) {
            this.f52632a.put(h.c(k11, Action.KEY_ATTRIBUTE), h.c(provider, "provider"));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Map<K, Provider<V>> map) {
        this.f52631a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Provider<V>> a() {
        return this.f52631a;
    }
}