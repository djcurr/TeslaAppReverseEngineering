package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class f0<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends e<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f16060a;

        a(int i11) {
            this.f16060a = i11;
        }

        @Override // com.google.common.collect.f0.e
        <K, V> Map<K, Collection<V>> c() {
            return m0.c(this.f16060a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends e<K0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f16061a;

        b(Comparator comparator) {
            this.f16061a = comparator;
        }

        @Override // com.google.common.collect.f0.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f16061a);
        }
    }

    /* loaded from: classes3.dex */
    private static final class c<V> implements com.google.common.base.a0<List<V>>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f16062a;

        c(int i11) {
            this.f16062a = h.b(i11, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.a0
        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f16062a);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class d<K0, V0> extends f0<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> y<K, V> e();
    }

    /* loaded from: classes3.dex */
    public static abstract class e<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends d<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f16063a;

            a(int i11) {
                this.f16063a = i11;
            }

            @Override // com.google.common.collect.f0.d
            public <K extends K0, V> y<K, V> e() {
                return g0.b(e.this.c(), new c(this.f16063a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i11) {
            h.b(i11, "expectedValuesPerKey");
            return new a(i11);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ f0(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i11) {
        h.b(i11, "expectedKeys");
        return new a(i11);
    }

    public static e<Comparable> c() {
        return d(l0.c());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        com.google.common.base.u.o(comparator);
        return new b(comparator);
    }

    private f0() {
    }
}