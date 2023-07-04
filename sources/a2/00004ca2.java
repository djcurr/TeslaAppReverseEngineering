package com.stripe.android.core.injection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public final class WeakMapInjectorRegistry implements InjectorRegistry {
    public static final WeakMapInjectorRegistry INSTANCE = new WeakMapInjectorRegistry();
    private static final WeakHashMap<Injector, String> staticCacheMap = new WeakHashMap<>();
    private static final AtomicInteger CURRENT_REGISTER_KEY = new AtomicInteger(0);

    private WeakMapInjectorRegistry() {
    }

    public static /* synthetic */ void getCURRENT_REGISTER_KEY$annotations() {
    }

    public static /* synthetic */ void getStaticCacheMap$annotations() {
    }

    public final void clear() {
        synchronized (staticCacheMap) {
            INSTANCE.getStaticCacheMap().clear();
            b0 b0Var = b0.f54756a;
        }
    }

    public final AtomicInteger getCURRENT_REGISTER_KEY() {
        return CURRENT_REGISTER_KEY;
    }

    public final WeakHashMap<Injector, String> getStaticCacheMap() {
        return staticCacheMap;
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    @InjectorKey
    public String nextKey(String prefix) {
        s.g(prefix, "prefix");
        return s.p(prefix, Integer.valueOf(CURRENT_REGISTER_KEY.incrementAndGet()));
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    public synchronized void register(Injector injector, @InjectorKey String key) {
        s.g(injector, "injector");
        s.g(key, "key");
        staticCacheMap.put(injector, key);
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    public synchronized Injector retrieve(@InjectorKey String injectorKey) {
        Injector injector;
        Object obj;
        s.g(injectorKey, "injectorKey");
        Set<Map.Entry<Injector, String>> entrySet = staticCacheMap.entrySet();
        s.f(entrySet, "staticCacheMap.entries");
        Iterator<T> it2 = entrySet.iterator();
        while (true) {
            injector = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(((Map.Entry) obj).getValue(), injectorKey)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            injector = (Injector) entry.getKey();
        }
        return injector;
    }
}