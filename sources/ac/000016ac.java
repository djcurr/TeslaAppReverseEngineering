package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import md.k;

/* loaded from: classes3.dex */
class b<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f11278a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11279b;

    /* renamed from: c  reason: collision with root package name */
    final Queue f11280c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11281d;

    /* renamed from: e  reason: collision with root package name */
    private int f11282e;

    public b(int i11, int i12, int i13, boolean z11) {
        k.i(i11 > 0);
        k.i(i12 >= 0);
        k.i(i13 >= 0);
        this.f11278a = i11;
        this.f11279b = i12;
        this.f11280c = new LinkedList();
        this.f11282e = i13;
        this.f11281d = z11;
    }

    void a(V v11) {
        this.f11280c.add(v11);
    }

    public void b() {
        k.i(this.f11282e > 0);
        this.f11282e--;
    }

    @Deprecated
    public V c() {
        V g11 = g();
        if (g11 != null) {
            this.f11282e++;
        }
        return g11;
    }

    int d() {
        return this.f11280c.size();
    }

    public void e() {
        this.f11282e++;
    }

    public boolean f() {
        return this.f11282e + d() > this.f11279b;
    }

    public V g() {
        return (V) this.f11280c.poll();
    }

    public void h(V v11) {
        k.g(v11);
        if (this.f11281d) {
            k.i(this.f11282e > 0);
            this.f11282e--;
            a(v11);
            return;
        }
        int i11 = this.f11282e;
        if (i11 > 0) {
            this.f11282e = i11 - 1;
            a(v11);
            return;
        }
        nd.a.l("BUCKET", "Tried to release value %s from an empty bucket!", v11);
    }
}