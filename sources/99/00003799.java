package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final m f16093a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final m f16094b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    private static final m f16095c = new b(1);

    /* loaded from: classes3.dex */
    class a extends m {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.m
        public m d(int i11, int i12) {
            return j(fl.d.e(i11, i12));
        }

        @Override // com.google.common.collect.m
        public <T> m e(T t11, T t12, Comparator<T> comparator) {
            return j(comparator.compare(t11, t12));
        }

        @Override // com.google.common.collect.m
        public m f(boolean z11, boolean z12) {
            return j(fl.a.a(z11, z12));
        }

        @Override // com.google.common.collect.m
        public m g(boolean z11, boolean z12) {
            return j(fl.a.a(z12, z11));
        }

        @Override // com.google.common.collect.m
        public int h() {
            return 0;
        }

        m j(int i11) {
            if (i11 < 0) {
                return m.f16094b;
            }
            return i11 > 0 ? m.f16095c : m.f16093a;
        }
    }

    /* loaded from: classes3.dex */
    private static final class b extends m {

        /* renamed from: d  reason: collision with root package name */
        final int f16096d;

        b(int i11) {
            super(null);
            this.f16096d = i11;
        }

        @Override // com.google.common.collect.m
        public m d(int i11, int i12) {
            return this;
        }

        @Override // com.google.common.collect.m
        public <T> m e(T t11, T t12, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.m
        public m f(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.m
        public m g(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.m
        public int h() {
            return this.f16096d;
        }
    }

    /* synthetic */ m(a aVar) {
        this();
    }

    public static m i() {
        return f16093a;
    }

    public abstract m d(int i11, int i12);

    public abstract <T> m e(T t11, T t12, Comparator<T> comparator);

    public abstract m f(boolean z11, boolean z12);

    public abstract m g(boolean z11, boolean z12);

    public abstract int h();

    private m() {
    }
}