package com.squareup.wire;

import com.squareup.wire.h.a;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class h<K extends a<T>, T> {

    /* renamed from: a  reason: collision with root package name */
    private final K f20839a;

    /* renamed from: b  reason: collision with root package name */
    private final T f20840b;

    /* loaded from: classes2.dex */
    public static abstract class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f20841a;

        /* renamed from: b  reason: collision with root package name */
        private final ProtoAdapter<T> f20842b;

        /* renamed from: c  reason: collision with root package name */
        private final String f20843c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f20844d;

        /* renamed from: e  reason: collision with root package name */
        private final String f20845e;

        public final ProtoAdapter<T> a() {
            return this.f20842b;
        }

        public final String b() {
            return this.f20843c;
        }

        public final String c() {
            return this.f20845e;
        }

        public final boolean d() {
            return this.f20844d;
        }

        public final int e() {
            return this.f20841a;
        }
    }

    public h(K key, T t11) {
        s.g(key, "key");
        this.f20839a = key;
        this.f20840b = t11;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, X] */
    public final <X> X a(a<X> key) {
        s.g(key, "key");
        if (s.c(this.f20839a, key)) {
            return this.f20840b;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                return s.c(this.f20839a, hVar.f20839a) && s.c(this.f20840b, hVar.f20840b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        K k11 = this.f20839a;
        int hashCode = (k11 != null ? k11.hashCode() : 0) * 31;
        T t11 = this.f20840b;
        return hashCode + (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        String i11;
        ProtoAdapter<T> a11 = this.f20839a.a();
        if (s.c(a11, ProtoAdapter.STRING) || s.c(a11, ProtoAdapter.STRING_VALUE)) {
            i11 = mr.d.i(String.valueOf(this.f20840b));
        } else {
            i11 = String.valueOf(this.f20840b);
        }
        return this.f20839a.b() + '=' + i11;
    }
}