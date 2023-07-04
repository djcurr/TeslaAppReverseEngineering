package uy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ny.g;
import yy.k;

/* loaded from: classes5.dex */
public final class b<E> extends AtomicReferenceArray<E> implements g<E> {

    /* renamed from: f  reason: collision with root package name */
    private static final Integer f53736f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a  reason: collision with root package name */
    final int f53737a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicLong f53738b;

    /* renamed from: c  reason: collision with root package name */
    long f53739c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicLong f53740d;

    /* renamed from: e  reason: collision with root package name */
    final int f53741e;

    public b(int i11) {
        super(k.a(i11));
        this.f53737a = length() - 1;
        this.f53738b = new AtomicLong();
        this.f53740d = new AtomicLong();
        this.f53741e = Math.min(i11 / 4, f53736f.intValue());
    }

    int a(long j11) {
        return ((int) j11) & this.f53737a;
    }

    int b(long j11, int i11) {
        return ((int) j11) & i11;
    }

    E c(int i11) {
        return get(i11);
    }

    @Override // ny.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j11) {
        this.f53740d.lazySet(j11);
    }

    void e(int i11, E e11) {
        lazySet(i11, e11);
    }

    void f(long j11) {
        this.f53738b.lazySet(j11);
    }

    @Override // ny.h
    public boolean isEmpty() {
        return this.f53738b.get() == this.f53740d.get();
    }

    @Override // ny.h
    public boolean offer(E e11) {
        Objects.requireNonNull(e11, "Null is not a valid element");
        int i11 = this.f53737a;
        long j11 = this.f53738b.get();
        int b11 = b(j11, i11);
        if (j11 >= this.f53739c) {
            long j12 = this.f53741e + j11;
            if (c(b(j12, i11)) == null) {
                this.f53739c = j12;
            } else if (c(b11) != null) {
                return false;
            }
        }
        e(b11, e11);
        f(j11 + 1);
        return true;
    }

    @Override // ny.g, ny.h
    public E poll() {
        long j11 = this.f53740d.get();
        int a11 = a(j11);
        E c11 = c(a11);
        if (c11 == null) {
            return null;
        }
        d(j11 + 1);
        e(a11, null);
        return c11;
    }
}