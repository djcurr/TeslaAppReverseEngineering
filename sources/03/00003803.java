package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class c0 extends d0 {

    /* renamed from: e  reason: collision with root package name */
    private final q0 f16236e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, c0> f16237a;

        public c0 a() {
            return this.f16237a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16237a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            c0 value = this.f16237a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q0) {
                return this.f16237a.getValue().d((q0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, c0> entry) {
            this.f16237a = entry;
        }
    }

    /* loaded from: classes3.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f16238a;

        public c(Iterator<Map.Entry<K, Object>> it2) {
            this.f16238a = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f16238a.next();
            return next.getValue() instanceof c0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16238a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f16238a.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public q0 f() {
        return c(this.f16236e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}