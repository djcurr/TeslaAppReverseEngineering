package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
class q<K, V> extends d<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final K f16126a;

    /* renamed from: b  reason: collision with root package name */
    final V f16127b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(K k11, V v11) {
        this.f16126a = k11;
        this.f16127b = v11;
    }

    @Override // com.google.common.collect.d, java.util.Map.Entry
    public final K getKey() {
        return this.f16126a;
    }

    @Override // com.google.common.collect.d, java.util.Map.Entry
    public final V getValue() {
        return this.f16127b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v11) {
        throw new UnsupportedOperationException();
    }
}