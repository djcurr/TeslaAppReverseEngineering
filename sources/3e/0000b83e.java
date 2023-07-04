package uy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ny.g;
import yy.k;

/* loaded from: classes5.dex */
public final class c<T> implements g<T> {

    /* renamed from: i  reason: collision with root package name */
    static final int f53742i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j  reason: collision with root package name */
    private static final Object f53743j = new Object();

    /* renamed from: b  reason: collision with root package name */
    int f53745b;

    /* renamed from: c  reason: collision with root package name */
    long f53746c;

    /* renamed from: d  reason: collision with root package name */
    final int f53747d;

    /* renamed from: e  reason: collision with root package name */
    AtomicReferenceArray<Object> f53748e;

    /* renamed from: f  reason: collision with root package name */
    final int f53749f;

    /* renamed from: g  reason: collision with root package name */
    AtomicReferenceArray<Object> f53750g;

    /* renamed from: a  reason: collision with root package name */
    final AtomicLong f53744a = new AtomicLong();

    /* renamed from: h  reason: collision with root package name */
    final AtomicLong f53751h = new AtomicLong();

    public c(int i11) {
        int a11 = k.a(Math.max(8, i11));
        int i12 = a11 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a11 + 1);
        this.f53748e = atomicReferenceArray;
        this.f53747d = i12;
        a(a11);
        this.f53750g = atomicReferenceArray;
        this.f53749f = i12;
        this.f53746c = i12 - 1;
        o(0L);
    }

    private void a(int i11) {
        this.f53745b = Math.min(i11 / 4, f53742i);
    }

    private static int b(int i11) {
        return i11;
    }

    private static int c(long j11, int i11) {
        return b(((int) j11) & i11);
    }

    private long d() {
        return this.f53751h.get();
    }

    private long e() {
        return this.f53744a.get();
    }

    private long f() {
        return this.f53751h.get();
    }

    private static Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        int b11 = b(i11);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, b11);
        m(atomicReferenceArray, b11, null);
        return atomicReferenceArray2;
    }

    private long i() {
        return this.f53744a.get();
    }

    private T j(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.f53750g = atomicReferenceArray;
        int c11 = c(j11, i11);
        T t11 = (T) g(atomicReferenceArray, c11);
        if (t11 != null) {
            m(atomicReferenceArray, c11, null);
            l(j11 + 1);
        }
        return t11;
    }

    private void k(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11, T t11, long j12) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f53748e = atomicReferenceArray2;
        this.f53746c = (j12 + j11) - 1;
        m(atomicReferenceArray2, i11, t11);
        n(atomicReferenceArray, atomicReferenceArray2);
        m(atomicReferenceArray, i11, f53743j);
        o(j11 + 1);
    }

    private void l(long j11) {
        this.f53751h.lazySet(j11);
    }

    private static void m(AtomicReferenceArray<Object> atomicReferenceArray, int i11, Object obj) {
        atomicReferenceArray.lazySet(i11, obj);
    }

    private void n(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void o(long j11) {
        this.f53744a.lazySet(j11);
    }

    private boolean p(AtomicReferenceArray<Object> atomicReferenceArray, T t11, long j11, int i11) {
        m(atomicReferenceArray, i11, t11);
        o(j11 + 1);
        return true;
    }

    @Override // ny.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // ny.h
    public boolean isEmpty() {
        return i() == f();
    }

    @Override // ny.h
    public boolean offer(T t11) {
        Objects.requireNonNull(t11, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f53748e;
        long e11 = e();
        int i11 = this.f53747d;
        int c11 = c(e11, i11);
        if (e11 < this.f53746c) {
            return p(atomicReferenceArray, t11, e11, c11);
        }
        long j11 = this.f53745b + e11;
        if (g(atomicReferenceArray, c(j11, i11)) == null) {
            this.f53746c = j11 - 1;
            return p(atomicReferenceArray, t11, e11, c11);
        } else if (g(atomicReferenceArray, c(1 + e11, i11)) == null) {
            return p(atomicReferenceArray, t11, e11, c11);
        } else {
            k(atomicReferenceArray, e11, c11, t11, i11);
            return true;
        }
    }

    @Override // ny.g, ny.h
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f53750g;
        long d11 = d();
        int i11 = this.f53749f;
        int c11 = c(d11, i11);
        T t11 = (T) g(atomicReferenceArray, c11);
        boolean z11 = t11 == f53743j;
        if (t11 == null || z11) {
            if (z11) {
                return j(h(atomicReferenceArray, i11 + 1), d11, i11);
            }
            return null;
        }
        m(atomicReferenceArray, c11, null);
        l(d11 + 1);
        return t11;
    }
}