package com.plaid.internal;

import android.util.LruCache;

/* loaded from: classes2.dex */
public final class c7<K, V> implements u0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<K, V> f18249a = new LruCache<>(10);

    @Override // com.plaid.internal.u0
    public void a(K k11, V v11) {
        this.f18249a.put(k11, v11);
    }

    @Override // com.plaid.internal.u0
    public void clear() {
        this.f18249a.evictAll();
    }

    @Override // com.plaid.internal.u0
    public V a(K k11) {
        return this.f18249a.get(k11);
    }
}